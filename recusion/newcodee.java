package recusion;

public class newcodee {
    public static void main(String[] args) {
        
        int[] arr={2,4,6,3,8,10};
        System.out.println(sorted(arr, 1));

        
    }
    public static boolean sorted(int[] arr,int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]<arr[i-1])
        {   
            return false;
        }
        return sorted(arr, i+1);
    }
}
