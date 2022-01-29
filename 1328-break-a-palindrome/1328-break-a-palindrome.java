class Solution {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        char[] ch = palindrome.toCharArray();
        if (n == 1) {
            return "";
        }
        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            if (i == j) {
                continue;
            }
            if(ch[i] != 'a') {
                ch[i] = 'a';
                return String.valueOf(ch);
            }
        }
        ch[n - 1] = 'b';
        return String.valueOf(ch);
    }
}