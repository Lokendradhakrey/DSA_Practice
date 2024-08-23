package linkedList;

public class LinkedList {

    private Node head;
    private Node tail;

    private int size;

    public LinkedList() {
        size = 0;
    }

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            next = null;
        }

        public Node() {
            next = null;
        }
    }

    void addAtFirst(int val) {
        Node node = new Node(val);
        if (tail == null) {
            tail = head;
        }
        node.next = head;
        head = node;
        size += 1;

    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void addAtEnd(int val) {
        Node node = new Node(val);
        if (head == null) {
            addAtFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size += 1;
    }

    void addAt(int idx, int val) {
        Node node = new Node(val);
        if (idx == 0) {
            addAtFirst(val);
            size++;
            return;
        } else if (size == idx) {
            addAtEnd(val);
            size += 1;
            return;
        }
        Node temp = head;
        while (idx > 1) {
            temp = temp.next;
            idx--;
        }
        node.next = temp.next;
        temp.next = node;
        size += 1;
    }

    int deleteFirst() {
        int deletedNode = head.val;
        head = head.next;
        if(head==null){
            tail = null;
            return deletedNode;
        }
        size -= 1;
        return deletedNode;
    }
    int deleteLast(){
        if(size<=1){
           return deleteFirst();
        }
        Node temp = head;
        int deletedNode = tail.val;
        while (temp.next.next!=null){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;

        return deletedNode;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtFirst(42);
        list.addAt(0, 67);
        list.printList();
        System.out.println(list.deleteLast());
        list.printList();
    }

}
