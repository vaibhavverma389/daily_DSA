
import java.util.Scanner;

public class a {
    public static int maxsearch(int matrix[][])
    {
        int a=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(a<matrix[i][j])
                {
                    a=matrix[i][j];
                }
            }

        }
        return a;
    }
    public static void main(String[] args) {
        int mat[][]=new int[3][3];
        int n=mat.length;
        int m=mat[0].length;
        Scanner sc = new  Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println(maxsearch(mat));

        // for(int[] i:mat)
        // {
        //     for(int j:i)
        //     {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }        
    }
    
}
