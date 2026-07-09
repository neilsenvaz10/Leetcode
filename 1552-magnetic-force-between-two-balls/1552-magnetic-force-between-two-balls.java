class Solution {
    public boolean isValid(int nums[],int maxDistance,int m)
    {
        int balls=1;
        int lastPosition=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-lastPosition>=maxDistance)
            {
                balls++;
                lastPosition=nums[i];
            }
            if(balls==m)
            {
                return true;
            }
        }
        return balls>=m;
    }

    
    public int maxDistance(int[] nums, int m) 
    {
        Arrays.sort(nums);

        int low=1;
        int high=nums[nums.length-1]-nums[0];
        int ans=-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(isValid(nums,mid,m))
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }
}