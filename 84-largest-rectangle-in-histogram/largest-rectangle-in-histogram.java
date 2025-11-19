class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<int[]> s = new Stack<>();
        for(int i=0; i<heights.length; i++){
            int start = i;
            while(!s.isEmpty() && s.peek()[1] > heights[i]){
                int[] top = s.pop();
                int index = top[0];
                int h = top[1];
                maxArea = Math.max(maxArea, h*(i-index));
                start = index;
            }
            s.push(new int[]{start, heights[i]});
        }
        for(int[] rem : s){
            int in = rem[0];
            int he = rem[1];
            maxArea = Math.max(maxArea, he*(heights.length - in));
        }
        return maxArea;
        
    }
}