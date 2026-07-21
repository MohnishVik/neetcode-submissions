class Solution 
{
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        backtrack(0,candidates,target,new ArrayList<>());
        return ans;
    }
    public void backtrack(int ind,int[] candidates,int target,List<Integer> current)
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
        for(int i=ind;i<candidates.length;i++)
        {
            if(i>ind&&candidates[i]==candidates[i-1])
            {
                continue;
            }
            current.add(candidates[i]);
            backtrack(i+1,candidates,target-candidates[i],current);
            current.remove(current.size()-1);
        }
    }
}
