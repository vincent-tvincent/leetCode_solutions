public class longestCommonPrefix {
    // solution 1, wrong solution because some different ascii number may add
    // together to
    // several times of another number, the sum do not have uniqueness
    private String getShortestString(String[] strs) {
        String minString = strs[0];
        for (String str : strs) {
            if (str.length() < minString.length()) {
                minString = str;
            }
        }
        return minString;
    }

    public String LongestCommonPrefix(String[] strs) {
        String minString = getShortestString(strs);
        boolean keepCheck = true;
        int prefixLength = 0;
        while (prefixLength < minString.length() && keepCheck) {
            int countCheck = 0;
            for (String str : strs) {
                countCheck += str.charAt(prefixLength);
            }
            if (countCheck / minString.charAt(prefixLength) != strs.length) {
                keepCheck = false;
            } else {
                prefixLength++;
            }
        }
        return minString.substring(0, prefixLength);
    }

    // solution 2

    private String commonInTwo(String s1, String s2) {
        int maxLength = Math.min(s1.length(), s2.length());
        int end = 0;
        boolean keepCount = true;
        while (end < maxLength && keepCount) {
            if (s1.charAt(end) != s2.charAt(end)) {
                keepCount = false;
            } else {
                end++;
            }
        }
        return s1.substring(0, end);
    }

    public String LongestCommonPrefix2(String[] strs) {
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            result = commonInTwo(result, strs[i]);
        }
        return result;
    }
}
// github test
