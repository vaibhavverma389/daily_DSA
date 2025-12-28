package linklist;

public class linkList {

    // ================= NODE CLASS =================
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ================= HEAD & TAIL =================
    static Node head = null;
    static Node tail = null;

    // ================= ADD FIRST =================
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // ================= ADD LAST =================
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // ================= SIZE =================
    public static int size(Node head) {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    // ================= CYCLE DETECTION =================
    public static boolean detectCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // ================= REMOVE CYCLE =================
    public static void removeCycle(Node head) {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            return;
        }

        // Step 2: Find start of cycle
        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove cycle
        if (prev != null) {
            prev.next = null;
        }
    }

    public static void zigzag(Node head) {
        // Find middle
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second
        Node prev = null;
        Node curr = slow.next;
        slow.next = null;

        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // mixing
        Node left = head;
        Node right = prev;

        while (left != null && right != null) {
            Node nextLeft = left.next;
            Node nextRight = right.next;

            left.next = right;
            right.next = nextLeft;

            left = nextLeft;
            right = nextRight;
        }
    }

    // ================= PRINT LIST =================
    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ================= MAIN =================
    public static void main(String[] args) {

        linkList ll = new linkList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // ll.addLast(6)
        // 
        printList(head);
        zigzag(head);
        printList(head);

     
       
    }
}
