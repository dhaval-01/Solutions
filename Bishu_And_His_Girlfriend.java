import java.util.*;

class TestClass {

//https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/bishu-and-his-girlfriend/description/


    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //int isg[]=new int[n+1];
        int dis[]=new int[n+1];
        int visited[]=new int[n+1];
        Map<Integer,List<Integer>> al=new HashMap<>();
        for(int i=1;i<=n;i++)
            al.put(i,new ArrayList<Integer>());
        for(int i=0;i<n-1;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            List<Integer> ul=al.get(u);
            ul.add(v);
            al.put(u,ul);
            List<Integer> vl=al.get(v);
            vl.add(u);
            al.put(v,vl);
        }
        int q=sc.nextInt();
        List<Integer> girls=new ArrayList<>();
        for(int i=0;i<q;i++)
        {
            int ind=sc.nextInt();
            girls.add(ind);
        }
        
        dfs(1,0,dis,visited,al);

        Collections.sort(girls);
        int luckygirl=-1;
        int min=Integer.MAX_VALUE;
        for(int g:girls)
        {
            if(dis[g]<min)
            {
                luckygirl=g;
                min=dis[g];
            }
        }
        
        System.out.println(luckygirl);
    }
    public static void dfs(int v,int d,int dis[],int visited[],Map<Integer,List<Integer>> al)
    {
        visited[v]=1;
        dis[v]=d;
        List<Integer> list=al.get(v);
        for(int node:list)
        {
            if(visited[node]==0)
                dfs(node,d+1,dis,visited,al);
        }
        return;
    }
}
