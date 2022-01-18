class Solution {
    public String longestPalindrome(String s) {
        int[] currentLongest = {0, 1};
        for (int i = 1; i < s.length(); i++) {
            int[] odd = getLongestPalindromeFrom(s, i - 1, i + 1);
            int[] even = getLongestPalindromeFrom(s, i - 1, i);
            int[] longest = odd[1] - odd[0] > even[1] - even[0] ? odd : even;
            currentLongest = currentLongest[1] - currentLongest[0] > longest[1] - longest[0] ? currentLongest : longest;
        }
        return s.substring(currentLongest[0], currentLongest[1]);
    }
    
    public int[] getLongestPalindromeFrom(String str, int leftIdx, int rightIdx) {
        while(leftIdx >= 0 && rightIdx < str.length()) {
            if(str.charAt(leftIdx) != str.charAt(rightIdx)) {
                break;
            }
            leftIdx--;
            rightIdx++;
        }
        return new int[] {leftIdx + 1, rightIdx};
    }
}