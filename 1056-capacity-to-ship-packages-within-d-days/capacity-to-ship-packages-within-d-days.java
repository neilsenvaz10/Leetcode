class Solution 
{
    public int daysRequired(int[] weights,int capacity)
    {
        int day=1;
        int load=0;
        for(int i=0;i<weights.length;i++)
        {
            if(load+weights[i]>capacity)
            {
                day++;
                load = weights[i];
            }
            else
            {
                load+=weights[i];
            }
        }
        return day;
    }

    public int shipWithinDays(int[] weights, int days)
    {
        int capacity=0;
        int sum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<weights.length;i++)
        {
            sum+=weights[i];
            max=Math.max(max,weights[i]);
        }

        int low=max;
        int high=sum;
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(daysRequired(weights,mid)<=days)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}