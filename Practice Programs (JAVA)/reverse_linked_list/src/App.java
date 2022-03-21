public class App {
    public static void main(String[] args) throws Exception {
        LinkedList llist = new LinkedList();
        llist.addNode(5);
        llist.addNode(8);
        llist.addNode(1);
        llist.addNode(6);
        llist.addNode(3);
        System.out.println("List Before Reversing -: ");
        llist.printList();
        llist.reverseList();
        System.out.println();
        System.out.println("List After Reversing -: ");
        llist.printList();
    }
}

class LinkedList {
    static Node head = null, tail = null;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void addNode(int data) {
        if (head == null) {
            Node newNode = new Node(data);
            head = newNode;
            tail = head;
        } else {
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;
        }
    }

    void printList() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
    }

    void reverseList() {
        if (head == null || head.next == null) {
            return;
        }
        Node ptr1 = head, ptr2 = tail;
        while (ptr1 != ptr2) {
            ptr1.data = ptr1.data ^ ptr2.data;
            ptr2.data = ptr1.data ^ ptr2.data;
            ptr1.data = ptr1.data ^ ptr2.data;

            ptr1 = ptr1.next;
            Node temp = head;
            if (ptr1 == ptr2) {
                break;
            }
            while (temp.next != ptr2) {
                temp = temp.next;
            }
            ptr2 = temp;
        }
    }
}
