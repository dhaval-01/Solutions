class Solution {

//https://leetcode.com/contest/weekly-contest-205/problems/number-of-ways-where-square-of-number-is-equal-to-product-of-two-numbers/

    public int numTriplets(int[] nums1, int[] nums2) {
        int count=0;
        count+=ans(nums1,nums2);
        count+=ans(nums2,nums1);
        return count;
    }
    public int ans(int nums1[],int nums2[])
    {
        int count=0;
        Map<Long,Integer> map=new HashMap();
        for(long a:nums1)
            map.put(a*a,map.getOrDefault(a*a,0)+1);
        
        for(int i=0;i<nums2.length;i++)
        {
            for(int j=i+1;j<nums2.length;j++)
            {
                long key=(long)nums2[i]*nums2[j];
                if(map.containsKey(key))
                    count+=map.get(key);
            }
        }
        
        return count;
    }
}
