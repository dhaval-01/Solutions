// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int arr1[] = new int[n];
            int arr2[] = new int[m];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().merge(arr1, arr2, n, m);

            StringBuffer str = new StringBuffer();
            for (int i = 0; i < n; i++) {
                str.append(arr1[i] + " ");
            }
            for (int i = 0; i < m; i++) {
                str.append(arr2[i] + " ");
            }
            System.out.println(str);
        }
    }
}// } Driver Code Ends


class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
    
        int j=0;
        for(int i=0;i+j<n && i<n && j<m;)
        {
            if(arr1[i]<arr2[j])
                i++;
            else
            {
                j++;
            }
        }
        for(int i=0;i<j;i++)
        {
            int temp=arr1[n-i-1];
            arr1[n-i-1]=arr2[i];
            arr2[i]=temp;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
        // below soln gave TLE
        
        /*for(int i=0;i<n;i++)
        {
            if(arr1[i]>arr2[0])
            {
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;
                putAtPlace(arr2,m);
            }
        }
        return;
    }
    
    public void putAtPlace(int arr[],int n)
    {
        int num=arr[0];
        for(int i=1;i<n;i++)
        {
            if(num<=arr[i])
            {
                arr[i-1]=num;
                return;
            }
            else
            {
                arr[i-1]=arr[i];
            }
        }
        arr[n-1]=num;
        return;
    }*/
}
