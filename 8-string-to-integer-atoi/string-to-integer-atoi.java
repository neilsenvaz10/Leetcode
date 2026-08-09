class Solution {
    public boolean isNumeric(char ch)
    {
        return (ch >= '0' && ch <= '9');
    }
    public int myAtoi(String s) {
        long ans=0;
        int i=0;

        boolean isPositive=true;

        while(i<s.length() && s.charAt(i)==' ')
        {
            i++;
        }
        if (i >= s.length())
        {
            return 0;
        }

        if(s.charAt(i)=='-' || s.charAt(i)=='+')
        {
            if(s.charAt(i)=='-')
            {
                isPositive=false;
            }
            i++;
        }
        while(i<s.length() && isNumeric(s.charAt(i)))
        {
            ans=(ans*10)+(s.charAt(i)-'0');
            if (isPositive && ans > Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }
            if (!isPositive && -ans < Integer.MIN_VALUE)
            {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        if(isPositive==false)
        {
            ans=-ans;
        }
        return (int)ans;
    }
}
