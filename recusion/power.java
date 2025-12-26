package recusion;

public class power {
    
    public static void main(String[] args) {
        int b=optimaizedPower(2,10);
        System.out.println(b);
    }
    public static int optimaizedPower(int a,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int halfpow=optimaizedPower(a, n/2);
        int pow=halfpow*halfpow;
        if(n%2==1)
        {
            pow=pow*a;
        }
        return pow;
    }
    
}
