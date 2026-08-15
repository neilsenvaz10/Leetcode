class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++)
        {
            res[i] = -1;
        }
        
        int[] stack = new int[n];
        int top = -1;
        
        for (int i = 0; i < 2 * n; i++) {
            while (top >= 0 && nums[i % n] > nums[stack[top]]) {
                res[stack[top--]] = nums[i % n];
            }
            if (i < n) {
                stack[++top] = i;
            }
        }
        
        return res;
    }
}