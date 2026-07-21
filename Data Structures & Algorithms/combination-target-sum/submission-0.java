class Solution 
{
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) 
    {
        backtrack(0,nums,target,new ArrayList<>());
        return ans;    
    }
    public void backtrack(int ind,int [] nums,int target,List<Integer> current)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(current));
            return;
        }
        if(target<0)
        {
            return;
        }
        for(int i=ind;i<nums.length;i++)
        {
            current.add(nums[i]);
            backtrack(i,nums,target-nums[i],current);
            current.remove(current.size()-1);
        }
    }
}
