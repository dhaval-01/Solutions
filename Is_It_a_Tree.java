import java.util.*;
import java.lang.*;

class Main
{

//https://www.spoj.com/problems/PT07Y/

	static Map<Integer,List<Integer>> al;
	static int visited[]=new int[100009];
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		al=new HashMap<>();
		for(int i=1;i<=n;i++)
			al.put(i,new ArrayList<Integer>());
		for(int i=0;i<m;i++)
		{
			int u=sc.nextInt();
			int v=sc.nextInt();
			al.get(u).add(v);	
			al.get(v).add(u);
		}
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(visited[i]==0)
			{
				dfs(i);
				count++;
			}
		}
		if(count==1 && m+1==n)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	public static void dfs(int v)
	{
		visited[v]=1;
		for(int node:al.get(v))
		{
			if(visited[node]==0)
			{
				dfs(node);
			}
		}
		return;
	}
}
