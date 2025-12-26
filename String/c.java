public class c {
    // substring in java
    public static String subString(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "HI i am vaibhav verma i am from ayodhya";
        String str1 = str.substring( 21, 39);
        String substr = subString(str, 0, 21);
        System.out.println(substr);
        System.out.println(str1);
    }
}
