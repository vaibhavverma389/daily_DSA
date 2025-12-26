package array;

public class h {
    public static void subarray(int[] arrr)
    {
        for(int i=0;i<arrr.length;i++)
        {
            for(int j=i;j<arrr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arrr[k]);
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        subarray(arr);
        
    }
    
}
