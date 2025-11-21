class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        long ex=n;
        if(ex<0){
            x = 1.0/x;
            ex = -ex;
        }
        while (ex>0){
            if((ex&1) == 1){
                res*=x;
            }
            x*=x;
            ex>>=1;
        }
        return res;
    }
}