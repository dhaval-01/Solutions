import java.util.*;
import java.lang.*;

class Main
{

//https://www.codechef.com/problems/FIRESC

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		
		for(int t=1;t<=test;t++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int visited[]=new int[n+1];
			Map<Integer,List<Integer>> al=new HashMap<>();
			for(int i=1;i<=n;i++)
				al.put(i,new ArrayList<Integer>());
			for(int i=0;i<m;i++)
			{
				int u=sc.nextInt();
				int v=sc.nextInt();
				al.get(u).add(v);
				al.get(v).add(u);
			}

			List<Integer> lst=new ArrayList<>();
			for(int i=1;i<=n;i++)
			{
				if(visited[i]==0)
				{
					int c=dfs(i,al,visited);
					lst.add(c);
				}
			}
			long ans=1;
			long mod=1000000007;
			for(int num:lst)
			{
				ans=(ans*num)%mod;
			}
			System.out.println(lst.size()+" "+ans);
			
			
		}
	}
	public static int dfs(int v,Map<Integer,List<Integer>> al,int visited[])
	{
		visited[v]=1;
		int ans=1;
		for(int node:al.get(v))
		{
			if(visited[node]==0)
			{

				ans+=dfs(node,al,visited);
			}
		}
		return ans;
	}
}
