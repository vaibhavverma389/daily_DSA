public class subset {


    public static void findsubsets(String str,String ans,int i)
    {
        if(i==str.length())
        {
            System.out.println(ans);
            return;
        }
        findsubsets(str, ans+str.charAt(i), i+1);
        findsubsets(str, ans, i+1);
    }  


    public static void findpermurations(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            findpermurations(newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        // findsubsets(str,"",0);
        findpermurations(str,"");
        
    }
    
}
