class Solution {

//https://leetcode.com/contest/biweekly-contest-34/problems/number-of-ways-to-split-a-string/

    public int numWays(String s) {
        int n=s.length();
        int total=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
                total++;
        }
        if(total%3!=0)
            return 0;
        if(total==0)
        {
           long an=((long)(n-2)*(long)(n-1))/2;
            an=an%1000000007;
            return (int)an;
        
        }
        else
        {
            long fh=0;
            long sh=0;
            int div=total/3;
            int i=0;
            int no1=0;
            for(i=0;i<n && no1<div;i++)
            {
                if(s.charAt(i)=='1')
                    no1++;
            }
            for(i=i;i<n;i++)
            {
                if(s.charAt(i)=='0')
                    fh++;
                else
                    break;
            }
            no1=0;
            for(i=i;i<n && no1<div;i++)
            {
                if(s.charAt(i)=='1')
                    no1++;
            }
            for(i=i;i<n;i++)
            {
                if(s.charAt(i)=='0')
                    sh++;
                else
                    break;
            }
            long ans=((fh+1)*(sh+1));
            ans=ans%1000000007;
            int a=(int)ans;
            return a;
        }
    }
}
