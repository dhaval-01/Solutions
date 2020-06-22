import java.io.*;
import java.util.*;
public class Main{

//https://www.codechef.com/COOK119B/problems/CACHEHIT
//Cache hits

public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    int test=sc.nextInt();
    while(test-->0)
    {
		int n=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();
		int seq[]=new int[m];
		for(int i=0;i<m;i++)
		{
			seq[i]=sc.nextInt();
		}
		int bn=-1;
		int c=0;
		for(int i=0;i<m;i++)
		{
			int cb=seq[i]/b;
			if(cb!=bn)
			{
				c++;
				bn=cb;
			}
		}
		System.out.println(c);

    }
}


}

