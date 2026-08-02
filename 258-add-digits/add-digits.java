class Solution {
    public int addDigits(int num) {
        if(num<10)
        {
            return num;
        }
        int res=0;
        while(num>0)
        {
            res+=num%10;
            num/=10;
        }

        while(res>9)
        {
            int num1=res;
            int sum=0;
            while(num1>0)
            {
                sum+=num1%10;
                num1/=10;
            }
            res=sum;
        }
        return res;
    }
}