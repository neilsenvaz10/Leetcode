class Solution {

    public List<Integer> generateRow(int row)
    {
        int ans=1;
        List<Integer> temp= new ArrayList<>();
        temp.add(1);
        for(int col=1;col<=row;col++)
        {
            ans=ans*(row-col+1);
            ans=ans/col;
            temp.add(ans);
        }
        return temp;
    }

    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            ans.add(generateRow(i));
        }
        return ans;
    }
}