class Solution {

//https://leetcode.com/problems/sort-colors/

    public void sortColors(int[] nums) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0 && i>s)
            {
                swap(nums,i,s);
                s++;
                i--;
            }
            if(nums[i]==2 && i<e)
            {
                swap(nums,i,e);
                e--;
                i--;
            }
        }
        return;
    }
    public void swap(int nums[],int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return;
    }
}
