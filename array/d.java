package array;

public class d {
    public static int larger(int[] arr)
    {
        int a=Integer.MIN_VALUE;
        int b=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>a)
            {
                a=arr[i];
            }
            if(arr[i]<b)
            {
                b=arr[i];
            }
        }
        System.out.println("Smallest number is : " + b);
        return a;
    }
    public static void main(String[] args) {
        int[] arrr={2,3,4,5,6,7,8};
       System.out.println("larger number is : " +larger(arrr)); 
    }
}
