class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> m1 = new HashMap<>();
        HashMap<Integer, Integer> m2 = new HashMap<>();
        for(int i: target){
            m1.put(i, m1.getOrDefault(i, 0)+1);
        }
        for(int i: arr){
            m2.put(i, m2.getOrDefault(i,0)+1);
        }
        return m1.equals(m2);
    }
}