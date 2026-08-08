class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)=='M')
            {
                ans+=1000;
                i=i+1;
            }
            else if(s.charAt(i)=='C' && ((i+1<s.length()) && (s.charAt(i+1)=='M')))
            {
                ans+=900;
                i=i+2;
            }
            else if(s.charAt(i)=='D')
            {
                ans+=500;
                i=i+1;
            }
            else if(s.charAt(i)=='C' && ((i+1<s.length()) && (s.charAt(i+1)=='D')))
            {
                ans+=400;
                i=i+2;
            }
            else if(s.charAt(i)=='C')
            {
                ans+=100;
                i=i+1;
            }
            else if(s.charAt(i)=='X' && ((i+1<s.length()) && (s.charAt(i+1)=='C')))
            {
                ans+=90;
                i=i+2;
            }
            else if(s.charAt(i)=='L')
            {
                ans+=50;
                i=i+1;
            }
            else if(s.charAt(i)=='X' && ((i+1<s.length()) && (s.charAt(i+1)=='L')))
            {
                ans+=40;
                i=i+2;
            }
            else if(s.charAt(i)=='X')
            {
                ans+=10;
                i=i+1;
            }
            else if(s.charAt(i)=='I' && ((i+1<s.length()) && (s.charAt(i+1)=='X')))
            {
                ans+=9;
                i=i+2;
            }
            else if(s.charAt(i)=='V')
            {
                ans+=5;
                i=i+1;
            }
            else if(s.charAt(i)=='I' && ((i+1<s.length()) && (s.charAt(i+1)=='V')))
            {
                ans+=4;
                i=i+2;
            }
            else
            {
                ans+=1;
                i=i+1;
            }
        }
        return ans;
    }
}