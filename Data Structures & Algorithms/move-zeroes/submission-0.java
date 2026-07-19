class Solution {
    public void moveZeroes(int[] nums) 
    {
        int n=nums.length;
        int temp[]=new int[n];
        int ind=0;
        for(int num:nums)
        {
            if(num!=0)
            {
                temp[ind]=num;
                ind++;
            }
        } 
        for(int i=0;i<n;i++)
        {
            nums[i]=temp[i];// void hence update the global variable nums
        }   
    }
}