class Solution {
    public int maxProfit(int[] arr) 
    {
        int l=arr.length;
        int lpbt=arr[0];
        int res=0;
        for(int i=1;i<l;i++)
        {
            int tp=arr[i]-lpbt;
            if(tp>res)
                res=tp;
            if(arr[i]<lpbt)
                lpbt=arr[i];
        }
        return res;
        
    }
}