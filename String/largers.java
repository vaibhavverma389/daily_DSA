public class largers {
    public static void main(String[] args) {
        String name[]={"aa","vaibhav","saurabh","ayodhya","faizabad"};
        String check=name[0];
        for(int i=0;i<name.length;i++)
        {
            if(check.compareTo(name[i])<0)
            {
                check=name[i];
            }

        }
        System.out.println(check);
        
    }

}