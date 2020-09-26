class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int ans=sum;
        for(int i=1;i<nums.length;i++)
        {
            sum+=nums[i];
            if(nums[i]>sum)
            {
                sum=nums[i];
            }
            if(sum>ans)
            {
                ans=sum;
            }
        }
        return ans;
    }
   
}
