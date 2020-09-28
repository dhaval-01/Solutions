import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.text.*;
public class Main
{
    static private int MAX=100005;
    static private long mod=(long)998244353;//1e9+7;
    static private int INT_MAX=Integer.MAX_VALUE,INT_MIN=Integer.MIN_VALUE;
    static private long LLONG_MAX=Long.MAX_VALUE,LLONG_MIN=Long.MIN_VALUE;

    static Reader sc;
    static PrintWriter out;

    public static void main (String[] args) throws java.lang.Exception
    {
        //sc=new Reader("input.txt");out=new PrintWriter("output.txt");
       sc=new Reader();out=new PrintWriter(System.out);
        
                int n=sc.nextInt();
                int ar=sc.nextInt(),as=sc.nextInt(),ap=sc.nextInt(),br=sc.nextInt(),bs=sc.nextInt(),bp=sc.nextInt();
                int min=0;
                int max=0;
                max+=Math.min(ar,bs)+Math.min(as,bp)+Math.min(ap,br);

                if(ar>br+bp)
                    min+=ar-br-bp;
                if(as>bs+br)
                    min+=as-bs-br;
                if(ap>bp+bs)
                    min+=ap-bp-bs;

                out.println(min+" "+max);
                out.flush();
          
           
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
