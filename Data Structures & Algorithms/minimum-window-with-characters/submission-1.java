class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int needed=t.length();
        int left=0;
        int min=Integer.MAX_VALUE;
        int count[]=new int[128];
        int start=0;
        for(char ch:t.toCharArray()) count[ch]++;
        for(int right=0;right<s.length();right++)
        {
            if(count[s.charAt(right)]>0) needed--;
            count[s.charAt(right)]--;
            while(needed==0)
            {
                if(right-left+1<min)
                {
                    min=right-left+1;
                    start=left;
                }
                count[s.charAt(left)]++;
                if(count[s.charAt(left)]>0) needed++;
                left++;
            }
        }
        return min==Integer.MAX_VALUE?"":s.substring(start,start+min);  
    }
}
