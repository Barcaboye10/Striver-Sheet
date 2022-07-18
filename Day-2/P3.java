// Easy question, only tricky part being, returning the solution inplace. Try to figure it out before moving on to the code.
// https://leetcode.com/problems/merge-sorted-array/discuss/29704/My-clean-java-solution has the explanation
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int t1 = m-1, t2=n-1, k = m+n-1;
        while(t1>=0 && t2>=0)
        {
            if(nums1[t1]>=nums2[t2])
            {
                nums1[k]=nums1[t1];
                t1--;
            }
            else
            {
                nums1[k]=nums2[t2];
                t2--;
            }
            k--;
        }
        while(t2>=0)
        {
            nums1[k]=nums2[t2];
            k--;
            t2--;
        }
    }
}