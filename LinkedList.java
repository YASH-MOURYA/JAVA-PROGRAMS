// import java.util.*;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head; // link
        head = newNode;
    }

    public void addlast(int data) {
        if (head == null) {
            head = tail = new Node(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println(" ll is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addfirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removefirst() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Iterative Search
    public int itrsearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Recursive Search
    public int recSearch(int key) {
        return helper(head, key);
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    // Reverse a Linked-list
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    // Remove Nth node from End
    public void deleteNthFromEnd(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != head) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next; // remove first
            return;
        }
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String arga[]) {
        LinkedList ll = new LinkedList();
        // ll.head=new Node(1);
        // ll.head.next=new Node(2);
        // ll.print();
        ll.addfirst(1);
        ll.addfirst(2);
        // ll.print();
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        // ll.deleteNthFromEnd(5);

        // ll.print();
        // ll.addlast(4);
        // ll.print();
        // ll.addlast(5);
        // ll.add(2, 9);
        // ll.removefirst();
        // ll.print();
        // System.out.println(ll.size);
        // ll.removelast();
        // ll.print();
        // ll.print();
        // System.out.println(ll.recSearch(9));
        // System.out.println(ll.recSearch(10));
        ll.reverse();
        ll.print();
        ll.deleteNthFromEnd(3);
        ll.print();

    }
}
