package recusion;

public class duplicate {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        int idx = 0;
        boolean[] map = new boolean[26];
        removeDuplicate("lucknow ayodhya tarun faizabad verma mathura vaibhav ", idx, result, map);
    }

    public static void removeDuplicate(String str, int idx,StringBuilder newStr, boolean[] map) {

        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        
        if (currChar == ' ') {
            newStr.append(currChar);
            removeDuplicate(str, idx + 1, newStr, map);
            return;
        }

        int charIndex = currChar - 'a';

        if (map[charIndex]) {
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            map[charIndex] = true;
            newStr.append(currChar);
            removeDuplicate(str, idx + 1, newStr, map);
        }
    }
}
