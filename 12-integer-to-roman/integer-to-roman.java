class Solution {
    public String intToRoman(int num) {
        StringBuilder s=new StringBuilder();
        while(num>0)
        {
            if(num>=1000)
            {
                s.append('M');
                num-=1000;
            }
            else if(num<1000 && num>=900)
            {
                s.append('C');
                s.append('M');
                num-=900;
            }
            else if(num<900 && num>=500)
            {
                s.append('D');
                num-=500;
            }
            else if(num<500 && num>=400)
            {
                s.append('C');
                s.append('D');
                num-=400;
            }
            else if(num<400 && num>=100)
            {
                s.append('C');
                num-=100;
            }
            else if(num<100 && num>=90)
            {
                s.append('X');
                s.append('C');
                num-=90;
            }
            else if(num<90 && num>=50)
            {
                s.append('L');
                num-=50;
            }
            else if(num<50 && num>=40)
            {
                s.append('X');
                s.append('L');
                num-=40;
            }
            else if(num<50 && num>=10)
            {
                s.append('X');
                num-=10;
            }
            else if(num==9)
            {
                s.append('I');
                s.append('X');
                num-=9;
            }
            else if(num<9 && num>=5)
            {
                s.append('V');
                num-=5;
            }
            else if(num==4)
            {
                s.append('I');
                s.append('V');
                num-=4;
            }
            else
            {
                s.append('I');
                num-=1;
            }
        }
        return s.toString();
    }
}