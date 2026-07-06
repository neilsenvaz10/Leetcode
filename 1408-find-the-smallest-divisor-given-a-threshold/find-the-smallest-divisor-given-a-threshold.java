class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
        }

        long low=1;
        long high=max;
        long ans=max;

        while(low<=high)
        {
            long sum=0;
            long mid=low+(high-low)/2;

            for(int i=0;i<nums.length;i++)
            {
                sum += Math.ceil((double)nums[i]/(double)mid);
            }
            if(sum<=threshold)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return (int)ans;
    }
}