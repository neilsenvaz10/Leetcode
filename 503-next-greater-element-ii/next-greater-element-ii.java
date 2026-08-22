class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int[] stack = new int[2 * n];
        int top = -1;                 

        for (int i = 2 * n - 1; i >= 0; i--) {
            int current = nums[i % n];
            
            while (top >= 0 && current >= stack[top])
            {
                top--;
            }
            if (i < n)
            {
                ans[i] = (top == -1) ? -1 : stack[top];
            }
            stack[++top] = current; 
        }
        return ans;
    }
}