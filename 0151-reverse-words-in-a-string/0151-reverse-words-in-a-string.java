class Solution {
    public String reverseWords(String s) 
    {
        StringBuilder ans=new StringBuilder(); 
        StringBuilder sb=new StringBuilder(s);
        String reversed=sb.reverse().toString();

        int i = 0; 
        while (i < reversed.length())
        {
            if (reversed.charAt(i) == ' ')
            {
                i++;
                continue;
            }

            StringBuilder word=new StringBuilder();;
            while(i<reversed.length() && reversed.charAt(i)!=' ')
            {
                word.append(reversed.charAt(i));
                i++;
            }
            word.reverse();

            if (ans.length() > 0)
            {
                ans.append(" ");
            }
            ans.append(word);
        }
        return ans.toString();
    }
}