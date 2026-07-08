class Solution {
    public int characterReplacement(String s, int k) 
    {
        int n=s.length();
        int maxlen=0;
        for(int i=0;i<n;i++)
        {
            int[] count=new int[26];
            int maxfreq=0;
            for(int j=i;j<n;j++)
            {
                count[s.charAt(j)-'A']++;
                maxfreq=Math.max(maxfreq,count[s.charAt(j)-'A']);
                int len=j-i+1;
                if(len-maxfreq<=k)
                {
                    maxlen=Math.max(maxlen,len);
                }
            }
        }
        return maxlen;
    }
}
