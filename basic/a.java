package basic;

public class a {
    
    public static boolean isprime(int a)
    {
        for(int i=2;i*i<=a;i++)
        {
            if(a%i==0)
            {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        for(int i=1;i<20;i++)
        {
            if(isprime(i))
            {
                System.out.println(i +" is prime number");
            }
        }
    }
}