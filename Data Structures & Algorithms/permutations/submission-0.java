class Solution 
{
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) 
    {
        boolean[] used=new boolean[nums.length];
        backtrack(nums,used,new ArrayList<>());
        return ans;
    }
    public void backtrack(int[] nums,boolean used[],List<Integer> current)
    {
        if(current.size()==nums.length)
        {
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i])
            {
                continue;
            }
            current.add(nums[i]);
            used[i]=true;
            backtrack(nums,used,current);
            current.remove(current.size()-1);
            used[i]=false;
        }
    }
}
