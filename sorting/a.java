public class a {
    public static int[] sort(int[] a) {

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j <a.length-1-i; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }

        }
        return a;
    }
    public static int[] ssort(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j<a.length-1;j++)
            {
                if(a[minPos]>a[j])
                {
                    minPos=j;
                }
            }
            int swp=a[minPos];
            a[minPos]=a[i];
            a[i]=swp;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a={4,5,3,1,6,7};
        // int[] b=sort(a);
        int[] b=ssort(a);
        for(int i:b){
            System.out.print(i+" ");
        }


        
    }
    
}
