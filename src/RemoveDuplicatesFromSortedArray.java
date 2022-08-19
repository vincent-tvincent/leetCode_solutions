public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums){
        int nextPosition = 0;
        for(int newNumPosition = 1; newNumPosition < nums.length; newNumPosition++){
            if(nums[newNumPosition] != nums[nextPosition]){
                nextPosition++;
                nums[nextPosition] = nums[newNumPosition];
            }
        }
        return nextPosition + 1;
    }
}
