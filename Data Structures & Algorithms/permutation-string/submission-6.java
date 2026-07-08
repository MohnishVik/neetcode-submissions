class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2) return false;
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (int right = 0; right < n1; right++) {
            count1[s1.charAt(right) - 'a']++;
            count2[s2.charAt(right) - 'a']++;
        }
        for (int right = n1, left = 0; right < n2; right++, left++) {
            if (Arrays.equals(count1, count2)) return true;
            count2[s2.charAt(right) - 'a']++;
            count2[s2.charAt(left) - 'a']--;
        }
        return Arrays.equals(count1, count2);
    }
}