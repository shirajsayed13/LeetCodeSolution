class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int n1 = charS.length;
        int n2 = charT.length;
        if (n1 != n2) {
            return false;
        }
        Arrays.sort(charS);
        Arrays.sort(charT);
        for (int i = 0; i < n1; i++) {
            if (charS[i] != charT[i]) {
                return false;
            }
        }
        return true;
    }
}