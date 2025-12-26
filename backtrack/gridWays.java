public class gridWays {
    public static int countways(int i,int j,int n,int m)
    {
        if(i==n-1 && j==m-1)
        {
            return 1;
        }
        if(i>=n || j>=m)
        {
            return 0;
        }
        int dw=countways(i+1, j, n, m);
        int rw=countways(i, j+1, n, m);

        return dw+rw;
    }
    public static void main(String[] args) {
        int n=4;
        int m=4;
        System.out.println(countways(0,0,n,m));
    }
    
}
