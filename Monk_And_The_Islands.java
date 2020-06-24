import java.util.*;

class TestClass {

//https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/monk-and-the-islands/description/
//bfs

    public static class p{
        int node;
        int dis;
        public p()
        {

        }
        public p(int node,int dis)
        {
            this.node=node;
            this.dis=dis;
        }
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            Map<Integer,List<Integer>> graph=new HashMap<>();
            int visited[]=new int[n+1];
            int dis[]=new int[n+1];
            for(int i=1;i<=n;i++)
                graph.put(i,new ArrayList<Integer>());
            for(int i=1;i<=m;i++)
            {
                int u=sc.nextInt();
                int v=sc.nextInt();
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
            bfs(1,graph,visited,dis);
            System.out.println(dis[n]);
        }

    }
    public static void bfs(int v,Map<Integer,List<Integer>> graph,int visited[],int dis[])
    {
        visited[v]=1;
        Queue<p> q=new LinkedList<>();
        q.add(new p(v,0));
        while(!q.isEmpty())
        {
            p curp=q.remove();
            dis[curp.node]=curp.dis;
            for(int n:graph.get(curp.node))
            {
                if(visited[n]==0)
                {
                    visited[n]=1;
                    q.add(new p(n,curp.dis+1));
                }
            }
        }
        return;
    }
}
