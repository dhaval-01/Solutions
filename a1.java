class Solution {
    public int findDuplicate(int[] nums) {
  
       int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        fast=nums[0];
        while(fast!=slow)
        {
            fast=nums[fast];
            slow=nums[slow];
        }
        return fast;
    }
/*




class Solution {

//https://leetcode.com/problems/find-the-duplicate-number/submissions/

    public int findDuplicate(int[] nums) {
  
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                return nums[i];
        }
        return -1;
        
      //O(nlong(n))
      //O(1)
    }
}

class Solution {
    public int findDuplicate(int[] nums) {
  
        int freq[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
            if(freq[nums[i]]>1)
                return nums[i];
        }
        return -1;
       
      //O(n)
      //O(n)
        
    }
}
*/
}
