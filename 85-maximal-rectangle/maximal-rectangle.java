class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int max = his(matrix[0]);
        for(int i =1; i<m; i++){
            add(matrix[i-1], matrix[i]);
            max = Math.max(his(matrix[i]), max);

        }
        return max;
        
    }
    private static void add(char[] a, char[] b){
        for(int i =0; i<a.length; i++){
            int x = a[i] - '0';
            int y = b[i] - '0';
            if(y==0){
                b[i]='0';
                continue;
            }
            int sum = x + y;
            b[i] = (char)(sum + '0');
        }
    }
private static int his(char[] nums) {
    Stack<int[]> stack = new Stack<>();
    int maxArea = 0;

    for (int i = 0; i < nums.length; i++) {
        int height = nums[i] - '0';
        int start = i;

        while (!stack.isEmpty() && stack.peek()[1] > height) {
            int[] top = stack.pop();
            int index = top[0];
            int h = top[1];
            maxArea = Math.max(maxArea, h * (i - index));
            start = index;
        }

        stack.push(new int[]{start, height});
    }

    int n = nums.length;
    while (!stack.isEmpty()) {
        int[] top = stack.pop();
        int index = top[0];
        int h = top[1];
        maxArea = Math.max(maxArea, h * (n - index));
    }

    return maxArea;
}
}