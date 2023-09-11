class GenClass1<T> {

    Node head;

    class Node {
        T data;
        Node next;

        Node() {
            data = null;
            next = null;
        }

        Node(T data) {
            this.data = data;
            next = null;
        }
    }

    GenClass1() {
        head = new Node();
    }

    public void insertFisrt(T data) {
        Node newNode = new Node(data);
        newNode.next = this.head.next;
        this.head.next = newNode;
    }

    public void insertEnd(T data) {
        Node newNode = new Node(data);
        newNode.next = null;
        Node temp = this.head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void displaySLL() {
        Node currNode = this.head.next;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print("|" + currNode.data + "|=>");
            currNode = currNode.next;
        }
        System.out.print("Null \n");
    }

    public void deleteFisrt() {
        Node temp = head.next;
        head.next = temp.next;
    }

    public void deleteEnd() {
        Node temp = head, prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }

    public void deleteSpecific(T data) {
        Node temp = head.next, prev = null;
        while (temp.next != null) {
            if (temp.data == data) {
                prev.next = temp.next;
                break;
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
    }

    public Node removeNode(Node n) {
        Node curr = n;
        Node next = n.next;
        Node prev = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = prev;
        return next;
    }

    public void reverseSSL() {
        Node currNode = head.next;
        removeNode(currNode);
    }
}

class GenMain {
    public static void main(String[] args) {
        GenClass1<Integer> obj = new GenClass1<Integer>();

        System.out.println("\n# Insert last node");
        obj.insertEnd(10);
        obj.insertEnd(20);
        obj.insertEnd(30);
        obj.insertEnd(40);
        obj.displaySLL();

        System.out.println("\n# Insert first node");
        obj.insertFisrt(11);
        obj.insertFisrt(22);
        obj.displaySLL();

        System.out.println("\n# Delete first node: ");
        obj.deleteFisrt();
        obj.displaySLL();

        System.out.println("\n# Delete End node: ");
        obj.deleteEnd();
        obj.displaySLL();

        System.out.println("\n# Delete specific node: ");
        obj.deleteSpecific(20);
        obj.displaySLL();

        System.out.println("\n# Reverse Linked list: ");
        obj.reverseSSL();
        obj.displaySLL();
    }
}
