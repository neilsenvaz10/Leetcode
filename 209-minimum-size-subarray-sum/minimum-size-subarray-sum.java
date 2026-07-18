class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end]; // Expand the window

            // Conditionally shrink the window while the sum meets or exceeds the target
            while (sum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }

        // Return 0 if no valid subarray is found
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
