class Solution {
    public int maxProduct(int n)
    {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        while(n>0)
        {
            int digit=n%10;
            if(digit>first)
            {
                second=first;
                first=digit;
                n/=10;
            }
            else if(digit>second)
            {
                second=digit;
                n/=10;
            }
            else
            {
                n/=10;
            }
            
        }
        return first*second;
    }
}