class Solution {
    public int[] dailyTemperatures(int[] temperatures)
    {
        int n=temperatures.length;
        int ans[]=new int[n];

        Stack<Integer> st=new Stack<>();

        for (int i = 0; i < temperatures.length; i++)
        {
            while (!st.isEmpty() && temperatures[i]>temperatures[st.peek()])
            {
                int previousIndex = st.pop();
                ans[previousIndex] = i - previousIndex;
            }
            st.push(i);
        }
        return ans;
    }
}