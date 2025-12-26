package array;

public class g {
    public static void pairarray(int[] arrr)
    {
        for(int i=0;i<arrr.length;i++)
        {
            for(int j=i+1;j<arrr.length;j++)
            {
                System.out.print("("+arrr[i] + "," + arrr[j] +")");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        pairarray(arr);

    }
    
}
