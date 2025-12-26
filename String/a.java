public class a {
    public static boolean ispelindrom(String str)
    {
        int left=0;
        int right=str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void printchar(String str)
    {
        for(int i=0;i<str.length();i++)
        {

            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) 
    {
        // String name="vaibhav verma";
        String str="racecar";
        System.out.println(ispelindrom(str));
        printchar(str);
    }
    
}
