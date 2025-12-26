package recusion;

public class newcode {
    public static void main(String[] args) {
        
        // printNumbersI(10);
        System.out.println(fib(10));
        System.out.println(fib(20));
        System.out.println(fib(25));

        
    }

    public static void printNumbers(int n) {
        if(n<=0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }

    public static void printNumbersI(int n) {
        if(n<=0){
            return;
        }
        printNumbersI(n-1);
        System.out.print(n +" ");
    }

    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fuct_num=fact(n-1);
        return n*fuct_num;
    }

    public static int fib(int n)
    {
        if (n==0 || n==1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    
    public static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sum(n-1);
    }
}
