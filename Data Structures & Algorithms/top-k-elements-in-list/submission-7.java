class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer>[]bucket=new ArrayList[nums.length+1];
        for(int key:map.keySet())
        {
            int freq=map.get(key);
            if(bucket[freq]==null)
            {
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int result[]=new int[k];
        int ind=0;
        for(int i=nums.length;i>=0;i--)
        {
            if(bucket[i]!=null)
            {
                for(int num:bucket[i])
                {
                    result[ind++]=num;
                    if(ind==k) return result;
                }
            }
        }
        return result;
    }
}
