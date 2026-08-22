class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int helperArray[]=new int[2*n];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++)
        {
            helperArray[i]=nums[i];
            helperArray[i+n]=nums[i];
        }

        for(int i=helperArray.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && helperArray[i]>=st.peek())
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
            st.push(helperArray[i]);
        }
        return ans;
    }
}