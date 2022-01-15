class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] tempArr = new int[score.length];
        for(int i = 0; i < score.length; i++) {
            tempArr[i] = score[i];
        }
        Arrays.sort(tempArr);
        
        Map<Integer, String> rankMap = new HashMap();
        int scoreLength = score.length;
        for(int i = scoreLength - 1; i >= 0; i--) {
            if(i == scoreLength - 1) {
                rankMap.put(tempArr[i], "Gold Medal");
            } else if (i == scoreLength - 2) {
                rankMap.put(tempArr[i], "Silver Medal");
            } else if (i == scoreLength - 3) {
                rankMap.put(tempArr[i], "Bronze Medal");
            } else {
                rankMap.put(tempArr[i], String.valueOf(scoreLength - i));
            }
        }
        
        String[] result = new String[scoreLength];
        for(int i = 0; i < scoreLength; i++) {
            result[i] = rankMap.get(score[i]);
        }
        
        return result;
    }
}