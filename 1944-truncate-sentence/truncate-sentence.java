class Solution {
    public String truncateSentence(String s, int k) {
        String[] x = s.split("\\s+");
        String res = "";
        for(int i=0; i<k; i++){
            res = res + x[i] + " ";
        }
        return res.trim();
    }
}