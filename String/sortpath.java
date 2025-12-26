public class sortpath {
    public static float getpath(String path)
    {
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++)
         {
            char a=path.charAt(i);
            if(a=='N')
            {
                y++;
            }
            else if(a=='S')
            {
                y--;
            }
            else if(a=='E')
            {
                x++;
            }
            else if(a=='W')
            {
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {
        String path="WNEENESENN";
        System.out.println(getpath(path));
        
    }
    
}
