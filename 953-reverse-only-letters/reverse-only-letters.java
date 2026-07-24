class Solution
{
    public boolean isAlphabet(char ch)
    {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    public String reverseOnlyLetters(String s)
    {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right)
        {
            char l = s.charAt(left);
            char r = s.charAt(right);
            
            if (!isAlphabet(l))
            {
                left++;
            } 
            else if (!isAlphabet(r))
            {
                right--;
            } 
            else
            {
                char temp=charArray[left];
                charArray[left]=charArray[right];
                charArray[right]=temp;

                left++;
                right--;
            }
        }
        String str = new String(charArray);
        return str;
    }
}