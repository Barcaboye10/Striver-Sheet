class Solution {
    public int maxSubArray(int[] nums) 
    {
        int prevSum=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int sumIncl=prevSum+nums[i];
            if(sumIncl>=nums[i])
            {
                prevSum=sumIncl;
            }
            else
            {
                prevSum=nums[i];
            }
            res=Math.max(res, prevSum);
        }
        return res;
        
    }
}