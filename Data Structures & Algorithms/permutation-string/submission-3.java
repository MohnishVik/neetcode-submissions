class Solution {
    public boolean checkInclusion(String s1, String s2) 
    {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2) 
        {
            return false;
        }
        for (int i = 0; i <= n2 - n1; i++) 
        {
            int[] count1 = new int[26];
            int[] count2 = new int[26];

            for (int j = 0; j < n1; j++) 
            {
                count1[s1.charAt(j) - 'a']++;
                count2[s2.charAt(i + j) - 'a']++;
            }

            if (Arrays.equals(count1, count2)) 
            {
                return true;
            }
        }

        return false;
    }
}