class Solution {

//https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/554/week-1-september-1st-september-7th/3447/


    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        int win=n/2;
        while(win>0 && n%win!=0)
                win=win-1;
        while(win>0)
        {
            int i=0;
            String pat=s.substring(0,win);
            for(i=win;i<n;i+=win)
            {
                String txt=s.substring(i,i+win);
                if(!pat.equals(txt))
                    break;
            }
            if(i>=n)
                return true;
            win=win-1;
            while(win>0 && n%win!=0)
                win=win-1;
        }
        return false;
    }
}
