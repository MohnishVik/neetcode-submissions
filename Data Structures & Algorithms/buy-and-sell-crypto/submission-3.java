class Solution {
    public int maxProfit(int[] prices) 
    {
        int n=prices.length;
        int left=0;
        int max=0;
        int profit=0;
        for(int right=1;right<n;right++)
        {
            if(prices[right]>prices[left])
            {
                profit=prices[right]-prices[left];
                max=Math.max(max,profit);
            }
            else
            {
                left=right;
            }
         }
        return max;
    }
}
