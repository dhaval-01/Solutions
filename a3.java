class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int actual=0;
        int optimal=0;
        int xzory=0;
        for(int i=0;i<n;i++)
        {
            actual^=arr[i];
            optimal^=(i+1);
        }
        xzory=actual^optimal;
        int setbit=0;
        while(true)
        {
            if((xzory&(1<<setbit))!=0)
                break;
            setbit++;
        }
        int x=0;
        int y=0;
        for(int i=0;i<n;i++)
        {
            if((arr[i]&(1<<setbit))!=0)
                x^=arr[i];
            else
                y^=arr[i];
                
            int num=i+1;
            if((num&(1<<setbit))!=0)
                x^=num;
            else
                y^=num;
        }
        boolean xfound=false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                xfound=true;
                break;
            }
        }
        if(xfound)
            return new int[]{x,y};
        else
            return new int[]{y,x};
    }
}
