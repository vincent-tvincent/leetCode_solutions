public class mainClass {
    public static void main(String[] args) {
        int[] test1 = {1,1,2};
        int[] test2 = {0,0,1,1,1,2,2,3,3,4};
        int[] test3 = {1};
        int[] test4 = {1,2,3,4};
        RemoveDuplicatesFromSortedArray demo = new RemoveDuplicatesFromSortedArray();
        int outcome = demo.removeDuplicates(test4);
        System.out.println("k = " + outcome);
        for(int i = 0; i < outcome ; i++){
            System.out.print(test4[i] + " ");
        }
        System.out.println();
    }
}