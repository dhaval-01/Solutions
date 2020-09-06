class Solution {

//https://leetcode.com/contest/weekly-contest-205/problems/replace-all-s-to-avoid-consecutive-repeating-characters/

    public String modifyString(String s) {
       int n=s.length();
        char c='a';
        String ans="";
        for(int i=0;i<n;i++)
        {
            c='a';
            if(s.charAt(i)=='?')
            {
                while((i>0 && ans.charAt(i-1)==c) || (i<n-1 && s.charAt(i+1)==c))
                {
                    c++;
                }
                ans+=Character.toString(c);
            }
            else
            {
                ans+=Character.toString(s.charAt(i));
            }
        }
        return ans;
    }
}
