class Solution 
{
    public int rob(int[] nums) 
    {
            int n=nums.length;
            if(n==1)
            {
                return nums[0];
            }
            int case1=robHelper(nums,0,n-2);
            int case2=robHelper(nums,1,n-1);
            return Math.max(case1,case2);
    }
    public int robHelper(int nums[],int start,int end)
    {
        int size=end-start+1;
        int dp[]=new int[size];
        dp[0]=nums[start];
        if(size==1)
        {
            return dp[0];
        }
        dp[1]=Math.max(nums[start],nums[start+1]);
        for(int i=2;i<size;i++)
        {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[start+i]);
        }
        return dp[size-1];
    }
}
