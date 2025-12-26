public class friend
{
    public static void main(String[] args)
    {
        int n=3;
        // System.out.println(friendpair(n));
        printBinstring(n,0,"");
    }
    public static int friendpair(int n)
    {
        if(n==1 || n==2)
        {
            return n;
        }
        return friendpair(n-1)+ (n-1)*friendpair(n-2);
    }


    public static void printBinstring(int n,int lastplace,String str)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        printBinstring(n-1,0,str+"0");
        if(lastplace==0)
        {
            printBinstring(n-1,1,str+"1");
        }
    }
}