public class arrayback {
    public static void main(String[] args)
    {
        int n=1;
        int arr[] = new int[10];
        backtrack(arr, 0,n);
        printarr(arr);
    }
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void backtrack(int arr[], int i, int n)
    {
        if(i==arr.length)
        {
            printarr(arr);
            return;
        }
        arr[i]=i+1;
        backtrack(arr, i+1,n+1);
        arr[i]-=2;
    }
}
