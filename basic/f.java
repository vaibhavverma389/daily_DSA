package basic;

public class f {
    public static void main(String[] args) {
        int n=8;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=0;k<n;k++)
            {
                if(k==0  || k==(n-1) || i==1 ||i==n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
