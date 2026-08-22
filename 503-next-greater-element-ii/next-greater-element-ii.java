class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            ans[i]=-1;
            int j=i+1;
            while(j%n!=i)
            {
                if(nums[j%n]>nums[i])
                {
                    ans[i]=nums[j%n];
                    break;
                }
                j++;
            }
        }
        return ans;
    }
}