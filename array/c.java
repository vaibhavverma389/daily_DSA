package array;

public class c {
    // array liner search
    public static  int linearsearch(int number[] , int key)
    {
        for(int i=0;i<number.length;i++)
        {
            if(number[i]==key)
            {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9,10};
        int key=11;
        System.out.print(linearsearch(arr, key));       
    }
    
}
