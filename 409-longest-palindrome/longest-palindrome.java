class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int even = 0;
        int oddsum = 0;
        boolean odd = false;
        
        for(int i: map.values()){
            if(i%2 !=0){
                odd = true;
                oddsum+= (i-1);
            }
            else{
                even+=i;
            }
        }
        if(odd) oddsum+=1;
        return even+oddsum;
    }
}