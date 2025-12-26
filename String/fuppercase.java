public class fuppercase {
    public static String tUpperCase(String st){
        StringBuilder sb=new StringBuilder("");
        sb.append(st.charAt(0));
        for(int i=1;i<st.length();i++){
            char ch=st.charAt(i);
            if(st.charAt(i)==' ' && i<st.length()-1){
                sb.append(ch);
                i++;
                sb.append(Character.toUpperCase(st.charAt(i)));
            }
            else{
                sb.append(ch);
            }  
        }
        return sb.toString();  
    }

    public static String covert(String str)
    {
        String ans="";
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            ans+=str.charAt(i);
            if(count>1)
            {
                ans+=count.toString();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // String str="i am vaibhav verma";
        // System.out.println(tUpperCase(str));
        String str="aaabbccccdd";
        System.out.println(covert(str));
    }
    
}
