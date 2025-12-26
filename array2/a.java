package array2;

public class a {
    public static void maxSubarraysum(int[] arrr)
    {
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arrr.length;i++)
        {
            for(int j=i;j<arrr.length;j++)
            {
                int currSum=0;
                for(int k=i;k<=j;k++)
                {
                    currSum+=arrr[k];
                }
                System.out.println("Currenet Sum is " +currSum);
                if(maxSum<currSum)
                {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum is" +maxSum);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,-4,5,6};
        maxSubarraysum(arr);
        
    }
    
}
