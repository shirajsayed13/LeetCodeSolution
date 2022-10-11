class Solution {
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
            if (max < salary[i]) {
                max = salary[i];
            }
            if (min > salary[i]){
                min = salary[i];
            }
        }
        return (sum - max - min) / (salary.length - 2);
    }
}