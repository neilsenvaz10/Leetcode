class Solution {
    public List<Integer> getRow(int rowIndex) {
        long ans=1;
        List<Integer> answer= new ArrayList<>();
        answer.add((int)ans);
        for(int col=1;col<=rowIndex;col++)
        {
            ans=ans*(rowIndex-col+1);
            ans=ans/col;
            answer.add((int)ans);
        }
        return answer; 
    }
}