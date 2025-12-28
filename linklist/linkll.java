package linklist;

import java.util.LinkedList;

public class linkll {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        System.out.println(ll);
        ll.addFirst(1);
        System.out.println(ll);
    }
    
}
