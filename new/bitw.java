public class bitw {

    public static int getbit(int n, int pos) {
        if((n & (1 << pos))==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setbit(int n, int pos) {
        return n | (1 << pos);
    }
    public static int clearbit(int n, int pos) {
        return n & ~(1 << pos);
    }

    public static int updatebit(int n, int i, int newi) {
        n = clearbit(n, i);
        return n | (newi << i);
    }

    public static int clearlnbit(int n , int i)
    {
        int bitmask = (-1 << i);
        return n & bitmask;
    }

    public static int clearbitsrange(int n , int i , int j)
    {
        int a = (-1 << (j+1));
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static boolean ispowertwo(int n)
    {
        return (n & (n-1))==0;
    }
    public static int counrtsetbit(int a)
    {
        int ans=0;
        while(a>0)
        {
            if((a & 1) == 1)
            {
                ans++;
            }
            a >>= 1;
        }
        return ans;
    }
    public static int fastexpo(int a,int n)
    {
        int ans =1;
        while(n>0)
        {
            if((n & 1) == 1)
            {
                ans *= a;
            }
            a *= a;
            n >>= 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // int n = 7;      
        // int pos = 2;    

        // System.out.println(getbit(n, pos));
        // System.out.println(setbit(n, pos));      
        // System.out.println(clearbit(n, pos));
        // System.out.println(updatebit(n, pos, 0));
        // System.out.println(clearlnbit(n, pos));
        // System.out.println(clearbitsrange(93, 2, 3));
        // System.out.println(ispowertwo(15));
        // System.out.println(counrtsetbit(16));
        System.out.println(fastexpo(4,5));
    }
}
