class Solution {
    public boolean isAlphaNumeric(char ch)
    {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }

    public boolean isPalindrome(String s) 
    {
        if(s.length()==0) return true;
        String t=s.trim().toLowerCase();
        int start=0;
        int end=t.length()-1;
        while(start<end)
        {
            if(!isAlphaNumeric(t.charAt(start)) || !isAlphaNumeric(t.charAt(end) ))
            {
                if(!isAlphaNumeric(t.charAt(start)))
                {
                    start++;
                }
                if(!isAlphaNumeric(t.charAt(end)))
                {
                    end--;
                }
            }
            else
            {
                if(t.charAt(start)==t.charAt(end))
                {
                    start++;
                    end--;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}