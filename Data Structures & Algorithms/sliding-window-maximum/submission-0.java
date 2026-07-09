class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        int n=nums.length;
        int[] result=new int[n-k+1];
        int left=0;
        for(int right=k-1;right<n;right++)
        {
            int max=nums[left];
            for(int i=left;i<=right;i++)
            {
                max=Math.max(max,nums[i]);
            }
            result[left]=max;
            left++;
        }
    return result;
    }
}
