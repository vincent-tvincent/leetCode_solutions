public class longestCommonPrefix {
    private String getLongestString(String[] strs){
        String maxString = "";
        for(String s: strs){
            if(s.length() > maxString.length()) maxString = s;
        }
        return maxString;
    }
    public String LongestCommonPrefix(String[] strs){
        String maxString = getLongestString(strs);
        int[] countList = new int[maxString.length()];

    }
}
