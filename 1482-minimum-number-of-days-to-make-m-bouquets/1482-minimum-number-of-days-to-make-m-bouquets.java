class Solution {

    public  boolean canFormBouquet(int arr[],int day,int m, int k)
    {
        int count=0;
        int BouquetFormed=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=day)
            {
                count++;
            }
            else
            {
                BouquetFormed+=(count/k);
                count=0;
            }
        }
        BouquetFormed+=(count/k);
        return BouquetFormed>=m;

    }
    public int minDays(int[] arr, int m, int k) {
        if((long)m*k>arr.length) return -1;

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int num: arr)
        {
            min=Math.min(min,num);
            max=Math.max(max,num);
        }

        int low=min;
        int high=max;
        int ans=high;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(canFormBouquet(arr,mid,m,k))
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