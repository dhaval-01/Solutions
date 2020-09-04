class Solution {

//https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/554/week-1-september-1st-september-7th/3448/

    public List<Integer> partitionLabels(String S) {
        int n=S.length();
        int arr[]=new int[n];
        List<Integer> list=new ArrayList<>();
        Map<Character,Integer> map=new HashMap();
        for(int i=n-1;i>=0;i--)
        {
            char cc=S.charAt(i);//current charecter
            if(map.containsKey(cc))
            {
                    arr[i]=map.get(cc);                
            }
            else
            {
                map.put(cc,i);
                arr[i]=i;
            }
        }

        int lim=0;
        int prev=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(i>=lim && i==arr[i])
            {
                list.add(i-prev+1);
                prev=i+1;
            }
            else
            {
                lim=Math.max(arr[i],lim);
            }
        }
        return list;
    }
}
