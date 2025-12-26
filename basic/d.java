package basic;

public class d {
    public static void main(String[] args) {
        int n=8;
        // int b=1;
        // for(int i=0;i<a;i++)
        // {
        //     for(int j=0;j<=i;j++)
        //     {
        //         System.out.print(b + " ");
        //         b++;
        //     }
        //     System.out.println();
        // }
        // //second
        // for(int i=0;i<a;i++)
        // {
        //     for(int j=0;j<=i;j++)
        //     {
        //         if((i+j)%2==0)
        //         {
        //             System.out.print("1");
        //         }
        //         else
        //         {
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }
        int a=n/2;
        for(int i=0;i<=a;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            for(int j=0;j<(a*2-(i*2));j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }  
        for (int i = a; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
    
            for (int j = 0; j < (a * 2 - (i * 2)); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }   
            System.out.println();
        }   
    } 
}
