class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
        {
            return "";
        }
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            int count[]=new int[128];
            for(char ch:t.toCharArray())
            {
                count[ch]++;
            }
            int needed=t.length();
            for(int j=i;j<s.length();j++)
            { 
                if(count[s.charAt(j)]>0) needed--;
                count[s.charAt(j)]--;
            
            if(needed==0)
            {
                String sub=s.substring(i,j+1);
                if(ans.equals("")||sub.length()<ans.length())
                {
                    ans=sub;
                }
                break;
            }

        }
    }
        return ans;
        
    }
}
