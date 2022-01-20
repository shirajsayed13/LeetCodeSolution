class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charStr1 = s.toCharArray();
        char[] charStr2 = t.toCharArray();
        int n1 = charStr1.length;
        int n2 = charStr2.length;
        
        if(n1 != n2)
            return false;
        
        Arrays.sort(charStr1);
        Arrays.sort(charStr2);
        
        for (int i = 0;i < n1; i++) {
            if (charStr1[i] != charStr2[i]) {
                return false;
            }
        }
        return true;
    }
}