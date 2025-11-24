class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> li = new ArrayList<>();
        int v = 0;
        for(int i : nums){
            v = (v*2+i)%5;
            li.add(v==0);            
        }
        return li;
    }
}