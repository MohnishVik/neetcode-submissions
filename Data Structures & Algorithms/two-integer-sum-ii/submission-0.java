class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int n=numbers.length;
        if(n==0) return new int[]{};
        int right=n-1;
        int left=0;
        for(int i=0;i<n;i++)
        {
            int sum=numbers[left]+numbers[right];
            if(sum==target)
            {
                return new int[]{left+1,right+1};
            }
            if(sum<target)
            {
             left++;;
            }
            
            else
            {
                right--;
            }
        }
        return new int[]{};
    }
}
