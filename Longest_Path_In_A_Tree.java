import java.util.*;
import java.lang.*;

class Main
{

//https://www.spoj.com/problems/PT07Z/

	static int lastnode=0;
	static int depth=0;
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		//int test=sc.nextInt();
		depth=0;
		lastnode=0;
	
			int n=sc.nextInt();
			int m=n-1;
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

			for(int i=1;i<=n;i++)
			{
				if(visited[i]==0)
				{
					dfs(i,al,visited,0);
				}
			}
			
			depth=0;
			//System.out.println("lastnode="+lastnode);
			for(int i=0;i<=n;i++)
				visited[i]=0;
		
			dfs(lastnode,al,visited,0);

			System.out.println(depth);
			
			
		
	}
	public static void dfs(int v,Map<Integer,List<Integer>> al,int visited[],int d)
	{
		visited[v]=1;
		
		if(d>depth)
		{
			depth=d;
			lastnode=v;
		}

		for(int node:al.get(v))
		{
			if(visited[node]==0)
			{
				dfs(node,al,visited,d+1);
			}
		}
		return;
	}
}
