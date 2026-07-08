class Solution {
    public String minWindow(String s, String t) 
    {
        int n1=s.length();
        int n2=t.length();
        if(n1<n2) return ""; 
        int count[]=new int[128];
        int left=0;
        int minlen=Integer.MAX_VALUE;
        int need=n2;
        int start=0;
        for(int i=0;i<n2;i++)
        {
            count[t.charAt(i)]++;
        }
        for(int right=0;right<n1;right++)
        {
            if(count[s.charAt(right)]>0)
            {
                need--;
            }
            count[s.charAt(right)]--;
            while(need==0)
            {
                if(right-left+1<minlen)
                {
                    minlen=right-left+1;
                    start=left;
                }
                count[s.charAt(left)]++;
                if(count[s.charAt(left)]>0)
                {
                    need++;
                }
                left++;
            }
        }
        if(minlen==Integer.MAX_VALUE) return "";
        return s.substring(start,start+minlen);
    }
}
