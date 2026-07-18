class Solution 
{
    public int leastInterval(char[] tasks, int n) 
    {
        int freq[]= new int[26];
        for(char ch:tasks)
        {
            freq[ch-'A']++;
        } 
        int maxFreq=0;//maxfreq-1=Gaps
        for(int f:freq)
        {
           maxFreq=Math.max(maxFreq,f);
        }
        int maxCount=0;
        for(int f:freq)
        {
            if(f==maxFreq)
            {
                maxCount++;//Same Freq by tasks
            }
        }
        int formula=(maxFreq-1)*(n+1)+maxCount;//n+1=blovk len=task+cooldown
        return Math.max(formula,tasks.length);       
    }
}
