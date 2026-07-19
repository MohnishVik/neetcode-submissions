class Solution {
    public void moveZeroes(int[] nums) 
    {
        int write=0;//pos to mov non zero element
        for(int read=0;read<nums.length;read++)//read scans the nums array
        {
            if(nums[read]!=0)
            {
                int temp=nums[write];
                nums[write]=nums[read];
                nums[read]=temp;
                write++;
            }
        }    
    }
}