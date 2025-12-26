package array;

import java.util.Arrays;

public class e {
    public static int bsearch(int[] arrr,int b)
    {
        int min=0;
        int max=arrr.length;
        while (max>min) {
            int mid=(min+max)/2;
            if(arrr[mid]==b)
            {
                return mid;
            }
            else if (arrr[mid]>b) {
                max=mid;
                
            }
            else 
            {
                min=mid;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr={37, 84, 12, 68, 91, 45, 77, 53, 28, 64};
        Arrays.sort(arr);
        int a=37;
        System.out.println("Number Index is : " + bsearch(arr,a));


        
    }
    
}
