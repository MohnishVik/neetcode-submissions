class Solution {
    public int trap(int[] height) {
        int totalwater=0;
        int n=height.length;
        for(int i=0;i<n;i++)
        {   
            int leftmax=0;
            for(int j=0;j<=i;j++)
            {
                leftmax=Math.max(leftmax,height[j]);
            }
            int rightmax=0;
            for(int j=i;j<n;j++)
            {
                rightmax=Math.max(rightmax,height[j]);
            }
            int water=Math.min(leftmax,rightmax)-height[i];
            totalwater+=water;
        }
        return totalwater;
    }
}
