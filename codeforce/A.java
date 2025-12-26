import java.util.*;
public class A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >0)
        {
            int a=sc.nextInt();
            char ch[] = sc.next().toCharArray();
            int q=0;
            for(int i=0;i<a;i++)
            {
                if(ch[i]=='Q')
                {
                    q++;
                }
                else
                {
                    q=Math.max(0,q-1);
                }
            }
            if(q==0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}