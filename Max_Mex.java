import java.io.*;
import java.util.*;
public class Main{

//https://www.codechef.com/COOK119B/problems/MAXMEX
//MAX MEX

public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    int test=sc.nextInt();
    while(test-->0)
    {
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[]=new int[n];
		int lt[]=new int[m];
		for(int i=0;i<m;i++)
			lt[i]=0;
		int gc=0;
		int lc=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>m)
				gc++;
			if(arr[i]<m)
				lt[arr[i]]++;
		}
		//Arrays.sort(arr);
		int bf=0;
		for(int i=m-1;i>0;i--)
		{
			if(lt[i]!=0)
				lc+=lt[i];
			else
			{
			    bf=1;
				break;
			}
		}
		if(bf==1)
			System.out.println(-1);
		else	
			System.out.println(gc+lc);

    }
}


}

