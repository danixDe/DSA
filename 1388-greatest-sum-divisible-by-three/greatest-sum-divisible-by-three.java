class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        List<Integer> rem1 = new ArrayList<>();
        List<Integer> rem2 = new ArrayList<>();

        for(int i: nums){
            sum+=i;
            if(i%3 == 1) rem1.add(i);
            else if(i%3 == 2) rem2.add(i);
        }
        if(sum%3==0) return sum;

        Collections.sort(rem1);
        Collections.sort(rem2);
        
        int res = 0;
        if(sum%3 == 1){
            int r1 = rem1.isEmpty() ? Integer.MAX_VALUE : rem1.get(0);
            int r2 = rem2.size() < 2 ? Integer.MAX_VALUE : rem2.get(0) + rem2.get(1);
            res = sum - Math.min(r1,r2);
        }
        else{
            int r1 = rem2.isEmpty() ? Integer.MAX_VALUE : rem2.get(0);
            int r2 = rem1.size()<2 ? Integer.MAX_VALUE : rem1.get(0)+rem1.get(1);
            res = sum - Math.min(r1, r2);
        }
        return res;

    }
}