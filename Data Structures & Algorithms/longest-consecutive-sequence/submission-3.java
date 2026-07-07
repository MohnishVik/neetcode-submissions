class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums)
        {
            set.add(n);
        }
        int max=0;
        for(int n:set)
        {
            int count=1;
            if(!set.contains(n-1))
            {
                int curr=n;
                while(set.contains(curr+1))
                {
                    curr++;
                    count++;
                }
            }
            max=Math.max(max,count);
            
        }
        return max;
    }
}
