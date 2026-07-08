class Solution {
    public boolean checkInclusion(String s1, String s2) 
    {
        int n1=s1.length();
        int n2=s2.length();
        if(n1>n2) return false;
        int left=0;
        int right=0;
        int count1[]=new int[26];
        int count2[]=new int[26];
        while(right<n1)
        {
            count1[s1.charAt(right)-'a']++;
            count2[s2.charAt(right)-'a']++;
            right++;
        }
        while(true)
        {
            if(Arrays.equals(count1,count2)) return true;
            if(right==n2) break;
            count2[s2.charAt(right)-'a']++;
            count2[s2.charAt(left)-'a']--;
            right++;
            left++;
        }
        return false;
    }
}
