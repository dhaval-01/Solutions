import java.util.*;

class TestClass {
//https://www.hackerearth.com/problem/algorithm/connected-components-in-a-graph/description/
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        int visited[]=new int[n+1];
        Map<Integer,List<Integer>> al=new HashMap<>();
        for(int i=1;i<=n;i++)
            al.put(i,new ArrayList<Integer>());
        for(int i=0;i<e;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            List<Integer> lu=al.get(u);
            lu.add(v);
            al.put(u,lu);
            List<Integer> lv=al.get(v);
            lv.add(u);
            al.put(v,lv);
        }
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(visited[i]==0)
            {
                dfs(i,visited,al);
                count++;
            }
        }
        System.out.println(count);
    }
    public static void dfs(int v,int visited[],Map<Integer,List<Integer>> al)
    {
        visited[v]=1;
        List<Integer> list=al.get(v);
        for(int node:list)
        {
            if(visited[node]==0)
                dfs(node,visited,al);
        }
        return;
    }
}
