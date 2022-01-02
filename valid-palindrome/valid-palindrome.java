import java.util.Locale;

class Solution {
    public boolean isPalindrome(String s) {
        
        String st = s.toLowerCase(Locale.ROOT);
        String replace = st.replaceAll("[^a-zA-Z0-9]", "");
        int start = 0;
        int end = replace.length() - 1;
        boolean isPalindrome = true;
        char[] chars = replace.toCharArray();
        while (start <= end) {
            if (chars[start] == chars[end]) {
                start++;
                end--;
            } else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}