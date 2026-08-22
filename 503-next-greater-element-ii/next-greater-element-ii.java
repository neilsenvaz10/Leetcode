class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=(2*n)-1;i>=0;i--)
        {
            int currIndex=i%n;
            while(!st.isEmpty() && nums[currIndex]>=st.peek())
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans[i%n]=-1;
            }
            else
            {
                ans[i%n]=st.peek();
            }
            st.push(nums[currIndex]);
        }
        return ans;
    }
}