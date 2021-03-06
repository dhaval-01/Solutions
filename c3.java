import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.text.*;
public class Main
{
  /*
Hacked Solution
while(t-->0)
        {
            long n=sc.nextLong();
            long max=n;
            long i=1;
            long ans=0;
            while(i<n)
            {
                ans=i+(long)(Math.ceil((double)(n-i)/i));
                if(ans>max)
                    break;
                max=ans;
                i++;
            }
            out.println(max-1);
            out.flush();
            
        }*/   
  
    static private int MAX=100005;
    static private long mod=(long)998244353;//1e9+7;
    static private int INT_MAX=Integer.MAX_VALUE,INT_MIN=Integer.MIN_VALUE;
    static private long LLONG_MAX=Long.MAX_VALUE,LLONG_MIN=Long.MIN_VALUE;

    static Reader sc;
    static PrintWriter out;

    public static void main (String[] args) throws java.lang.Exception
    {
       // sc=new Reader("input.txt");out=new PrintWriter("output.txt");
       sc=new Reader();out=new PrintWriter(System.out);
        
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            long m;
            if(n==2)
            {
                    out.println(1);
                    out.flush();
                    continue;   
            }   
            if(n==1)
            {
                    out.println(0);
                    out.flush();
                    continue;   
            }
        long ans=1;
        long sum=2;
        long add=2;
        long o=0;
        long kt =2;
        long ansv=1;
        while(sum<n)
        {

                ansv++;
          
                o++;
                sum+=add;
                if(sum>=n)
                    break;
                if(o==2)
                {
                    o=0;
                    add++;
                    ans++;
                }
        }
        out.println(ansv);
        out.flush();
    }

            
        }   
    







    static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String nextLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 

    }   

    class pair<T,G>
    {
        T x; G y;
        public pair(){}
        public pair(T x,G y)
        {this.x=x;this.y=y;}
        public String toString()
        {return " <"+x.toString()+","+y.toString()+"> ";}
    }
}
