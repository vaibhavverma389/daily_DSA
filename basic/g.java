package basic;

public class g {
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(i*2)+1;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<n-i;j++)
            {
                System.out.print("  ");
            }
            System.out.println();
            
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=1;j<n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(i*2)+1;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<n-i;j++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    
}
