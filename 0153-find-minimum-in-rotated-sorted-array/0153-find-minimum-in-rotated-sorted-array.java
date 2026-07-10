class Solution {
    public int findMin(int[] nums) {
        int ans=Integer.MAX_VALUE;

        int low=0;
        int high=nums.length-1;

        while(low<=high)
        {
            int mid=low+((high-low)/2);
            
            if(nums[low]<=nums[mid])
            {
                int min=nums[low];
                ans=Math.min(min,ans);
                low=mid+1;
            }
            else
            {
                int min=nums[mid];
                ans=Math.min(min,ans);
                high=mid-1;
            }
        }
        return ans;
    }
}