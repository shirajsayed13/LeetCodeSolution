class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        
        for(String str: strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            
            if(anagrams.containsKey(sortedWord)) {
                anagrams.get(sortedWord).add(str);
            } else {
                anagrams.put(sortedWord, new ArrayList<>(Collections.singletonList(str)));
            }
        }
        return new ArrayList<>(anagrams.values());
    }
}