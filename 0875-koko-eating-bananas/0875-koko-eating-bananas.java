class Solution {

    public long calculateHours(int[] piles, int speed)
    {
        long hours=0;
        for(int i=0;i<piles.length;i++)
        {
            hours += ((long)piles[i] + speed - 1) / speed;
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h)
    {
        int max=0;
        for(int num:piles)
        {
            max=Math.max(max,num);
        }

        int low=1;
        int high=max;
        long ans=high;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long hours = calculateHours(piles, mid);

            if(hours <= h)
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return (int)ans;
    }
}