class Solution 
{
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) 
    {
        backtrack(0,nums,new ArrayList<>());
        return ans;
    }
    public void backtrack(int ind,int[] nums,List<Integer>current)
    {
        if(ind==nums.length)
        {
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[ind]);//add current element
        backtrack(ind+1,nums,current);
        current.remove(current.size()-1);//backtracking
        backtrack(ind+1,nums,current);//exclude current element
    }
}
