class Solution {
    public int characterReplacement(String s, int k) 
    {
        int n=s.length();
        int[] count=new int[26];
        int left=0;
        int maxlen=0;
        int maxfreq=0;
        for(int right=0;right<n;right++)
        {
            count[s.charAt(right)-'A']++;
            maxfreq=Math.max(maxfreq,count[s.charAt(right)-'A']);
            int len=right-left+1;
            while((right-left+1)-maxfreq>k)
            {
                count[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}
