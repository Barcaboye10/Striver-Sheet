// Optimal Solution: Definitely watch video https://www.youtube.com/watch?v=LuLCLgMElus&t=378s to get the intuition.
class Solution {
    public void nextPermutation(int[] nums) 
    {
        int l = nums.length;
        int i = l-2;
        while(i>=0)
        {
            if(nums[i]<nums[i+1])
                break;
            i--;
        }
        if(i<0)
        {
            reverse(nums, 0, l-1);
            return;
        }
        int j=l-1;
        while(j>i)
        {
            if(nums[j]>nums[i])
                break;
            j--;
        }
        int c=nums[i];
        nums[i]=nums[j];
        nums[j]=c;
        reverse(nums, i+1, l-1);
    }
    public void reverse(int[] arr, int s, int e)
    {
        for(; s<e;s++, e--)
        {
            int c=arr[s];
            arr[s]=arr[e];
            arr[e]=c;
        }
    }
}