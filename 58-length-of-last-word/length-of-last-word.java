class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int length=0;
        boolean isValid=true;
        while(isValid)
        {
            if(length==0 && s.charAt(i)==' ')
            {
                i--;
            }
            else
            {
                if(i>=0 && s.charAt(i)!=' ')
                {
                    i--;
                    length++;
                }
                else
                {
                    isValid=false;
                }
            }
        }
        return length;
    }
}