class Solution {
    public boolean checkPerfectNumber(int num) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i =1; i<=num/2; i++){
            if(num%i == 0) li.add(i);
        }
        int sum = 0;
        for(int i: li){
            sum+=i;
        }
        if(num==sum) return true;
        return false;
    }

}