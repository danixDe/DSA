class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int i: apple){
            sum+=i;
        }
        Arrays.sort(capacity);
        int second = 0;
        int n = capacity.length;
        for(int i=n-1; i>=0; i--){
                         second+=capacity[i];

            if(sum<=second){
                return n-i;
            }
        }
        return -1;
    }
}