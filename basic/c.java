package basic;

public class c {
    public static void main(String[] args) {
        int a=7;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if((i+j)>=a-1)
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
