class Solution {
    public String truncateSentence(String s, int k) {
        String[] x = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i=0; i<k; i++){
            res.append(x[i]+" ");
        }
        return res.toString().trim();
    }
}