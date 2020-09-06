class Solution {

//https://leetcode.com/contest/biweekly-contest-34/problems/matrix-diagonal-sum/

    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=mat[i][i];
            sum+=mat[i][n-i-1];
        }
        if(n%2!=0)
        {
            int mid=(n-1)/2;
            sum=sum-mat[mid][mid];
        }
        return sum;
    }
}
