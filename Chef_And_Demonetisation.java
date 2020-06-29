import java.util.*;
import java.lang.*;

class Main
{

//https://www.codechef.com/LTIME85B/problems/CHFMOT18

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int s=sc.nextInt();
			int n=sc.nextInt();
			int count=0;
			while(s>1)
			{
				if(s>=n)
				{
					count=count+(s/n);
					s=s%n;
					// count=count+(s/n);
					
				
				}
				else
				{
					if(s%2==0)
						n=s;
					else
						n=s-1;
				}
			}
			if(s==1)
				System.out.println(count+1);
			else
				System.out.println(count);
		}	
	}
	
}
