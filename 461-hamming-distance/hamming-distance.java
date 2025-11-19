class Solution {
    public int hammingDistance(int x, int y) {
        int diff = x^y;
        int c = 0;
        while(diff>0){
            if((diff & 1) == 1) c++;
            diff>>=1;
        }
        return c;
    }
}