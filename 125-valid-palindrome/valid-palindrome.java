class Solution {
    public boolean isAlphaNumeric(char ch)
    {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }

    public char toLowerCase(char ch)
    {
        if (ch >= 'A' && ch <= 'Z')
        {
            return (char) (ch + 32);
        }
        return ch;
    }
    public boolean isPalindrome(String s) 
    {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right)
        {
            char l = s.charAt(left);
            char r = s.charAt(right);
            
            if (!isAlphaNumeric(l))
            {
                left++;
            } 
            else if (!isAlphaNumeric(r))
            {
                right--;
            } 
            else
            {
                if (toLowerCase(l) != toLowerCase(r)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}