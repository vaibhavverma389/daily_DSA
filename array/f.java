package array;

public class f {
    public static int[] revarray(int[] arrr)
    {
        for(int i=0;i<arrr.length/2;i++)
        {
            int a=arrr[i];
            arrr[i]=arrr[arrr.length-(1+i)];
            arrr[arrr.length-(1+i)]=a;
        }
        return arrr;

    }
    public static void main(String[] args) {
        int[] arr={37, 84, 12, 68, 91, 45, 77, 53, 28, 64,99};
        int[] a=revarray(arr);
        for(int i:a)
        {
            System.out.println(i);
        }
        
    }
    
}
