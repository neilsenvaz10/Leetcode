class Solution {
    public boolean isPurePalindrome(String s,int start,int end)
    {
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public boolean validPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;
        int count=0;
        
        while (left < right)
        {
            char l = s.charAt(left);
            char r = s.charAt(right);
            
            if (l==r)
            {
                left++;
                right--;
            } 
            else
            {
                return isPurePalindrome(s, left + 1, right) || isPurePalindrome(s, left, right - 1);
            }
        }
        return true;  
    }
}