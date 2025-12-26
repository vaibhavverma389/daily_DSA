package array2;

public class c {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i:arr)
        {
            currSum+=i;
            if(currSum>maxSum)
            {
                maxSum=currSum;
            }
            if(currSum<0)
            {
                currSum=0;
            }

        }
        System.out.println(maxSum);
    }
    
}
