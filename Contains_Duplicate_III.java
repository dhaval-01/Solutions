class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n && j-i<=k;j++)
            {
                if(Math.abs((long)nums[i]-(long)nums[j])<=t)
                    return true;
            }
        }
        return false;
    }
}
