package array2;

public class b {
    public static int maxsubarr(int[] arrr)
    {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int a=0;
        for(int i=0;i<arrr.length;i++){
            a+=arrr[i];
            arrr[i]=a;
        }
        for(int i=0;i<arrr.length;i++)
        {
            for(int j=i;j<arrr.length;j++)
            {
                if(i==0)
                {
                    currSum=arrr[j];
                }
                else
                {
                    currSum =arrr[j]-arrr[i-1];
                }
                if(maxSum<currSum)
                {
                    maxSum=currSum;
                }
            }
            
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr={1,-2,6,-1,3};
        
        System.out.println("maximun Sum is: " + maxsubarr(arr));
        
    }
    
}
