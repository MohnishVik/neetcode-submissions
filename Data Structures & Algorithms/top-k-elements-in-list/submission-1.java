class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        boolean counted[]=new boolean[n];
        int[] freq=new int[n];
        for(int i=0;i<n;i++)
        {
            if(!counted[i])
            {
                int count=1;
                for(int j=i+1;j<n;j++)
                {
                    if(nums[i]==nums[j]){
                        count++;
                        counted[j]=true;
                    }
                }
                freq[i]=count;
            }
        }
        int result[]=new int[k];
        for(int x=0;x<k;x++)
        {
            int max=-1;
            int ind=-1;
            for(int i=0;i<n;i++)
            {
                if(freq[i]>max)
                {
                    max=freq[i];
                    ind=i;
                }
            }
            result[x]=nums[ind];
            freq[ind]=-1;
        }
        return result;
    }
}
