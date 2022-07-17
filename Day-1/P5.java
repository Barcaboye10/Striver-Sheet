class Solution {
    public static void sortColors(int[] arr) 
    {
        int start=0, end=arr.length-1;
        int i=0;
        while(i<=end)
        {
            if(arr[i]==0)
            {
                arr[i]=arr[start];
                arr[start]=0;
                i++;
                start++;
            }
            else if(arr[i]==2)
            {
                arr[i]=arr[end];
                arr[end]=2;
                end--;
            }
            else
                i++;
        }
    }
}