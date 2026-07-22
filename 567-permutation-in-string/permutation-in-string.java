class Solution {
    public boolean isFreqSame(int arr1[],int arr2[])
    {
        for(int i=0;i<26;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        int freq[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            freq[s1.charAt(i)-'a']++;
        }

        int windowSize=s1.length();
        for(int j=0;j<s2.length();j++)
        {
            int windowFreq[] = new int[26];
            int windowIndex=0;
            int index=j;

            while(windowIndex<windowSize && index<s2.length())
            {
                windowFreq[s2.charAt(index)-'a']++;
                index++;
                windowIndex++;
            }
            if(isFreqSame(windowFreq,freq))
            {
                return true;
            }
        }
        return false;
    }
}