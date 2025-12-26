public class b {

    public static void sortpath(String str)
    {
        int a=0;
        int b=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='W')
            {
                a++;
            }
            else if (str.charAt(i)=='N') {
                b++;
                
            } 
            else if (str.charAt(i)=='E') {
                a--;
            }
            else
            {
                b--;
            }
           
        }
        int c=a*a + b*b;
        float d=(float)Math.sqrt(c);

        System.out.println(d);
    }
    public static void main(String[] args) {
        String str = "WWWNWESSSSSSNNN";
        sortpath(str);
    }
    
}
