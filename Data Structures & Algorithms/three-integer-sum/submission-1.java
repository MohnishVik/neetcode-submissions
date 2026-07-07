class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        for(int fixed=0;fixed<n-2;fixed++)
        {
            if(fixed>0&&nums[fixed]==nums[fixed-1])//ignore fixed duplicates
            {
                continue;
            }
            int left=fixed+1;
            int right=n-1;
            while(left<right)
            {
                int sum=nums[fixed]+nums[left]+nums[right];
                List<Integer>temp=new ArrayList<>();;
                if(sum==0)
                {
                    temp.add(nums[fixed]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);
                    while(left<right&&nums[left]==nums[left+1])//ignore left duplicates
                    {
                        left++;
                    }
                    while(left<right&&nums[right]==nums[right-1])//ignore right duplicates
                    {
                        right--;
                    }
                    left++;
                    right--;
                }
               else if(sum<0)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        return result;
    }
}
