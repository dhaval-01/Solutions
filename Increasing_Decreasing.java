import java.util.*;
import java.lang.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer;
import java.io.*;

class Main
{

//https://www.codechef.com/LTIME85B/problems/INCRDEC

    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader sc=new FastReader();
		PrintWriter out=new PrintWriter(System.out);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			int fr[]=new int[200009];
			int ans[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				fr[arr[i]]++;
			}
			int bf=0;
			int p=0;
			int lastfr=0;
			for(int i=0;i<200009;i++)
			{
				if(fr[i]>2)
				{
					bf=1;
					break;
				}
				if(fr[i]>=1)
				{
					lastfr=fr[i];
					ans[p]=i;
					p++;
					fr[i]--;
				}
			}
			if(bf==1 || lastfr>=2)
			{
				out.println("NO");
			}
			else
			{
				for(int i=200009-1;i>=0;i--)
				{
					if(fr[i]>=1)
					{
						ans[p]=i;
						p++;
						fr[i]--;
					}
				}
				out.println("YES");
				for(int i=0;i<n;i++)
					out.print(ans[i]+" ");
				out.println();
			}
			out.flush();
			
		}	
	}
	
}
