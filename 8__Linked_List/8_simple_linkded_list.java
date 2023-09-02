import java.util.Scanner;

class SLL {
    class Node {
        int data;
        Node next;

        Node(int info) {
            data = info;
            next = null;
        }
    }

    Node first = null, last = null, temp = null, curr = null;

    public void createNode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter node value: ");
        int value = sc.nextInt();
        temp = new Node(value);
    }

    public void createSSL() {
        createNode();
        if (first == null) {
            first = temp;
            last = temp;
        } else {
            last.next = temp;
            last = temp;
        }
    }

    public void displaySLL() {
        curr = first;
        while (curr != null) {
            System.out.print("|" + curr.data + "|=>");
            curr = curr.next;
        }
        System.out.print("Null");
    }

    public void insertLast() {
        createNode();
        last.next = temp;
        last = temp;
        displaySLL();
    }

    public void insertFisrt() {
        createNode();
        temp.next = first;
        first = temp;
        displaySLL();
    }

    public void insertSpecific() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position for INSERT node: ");
        int pos = sc.nextInt();

        createNode();
        curr = first;
        for (int i = 1; i < pos - 1; i++) {
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        displaySLL();
    }

    public void deleteLast() {
        curr = first;
        Node prev = null;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        displaySLL();
    }

    public void deleteFist() {
        first = first.next;
        displaySLL();
    }

    public void deleteSpecific() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position for DELETE node: ");
        int pos = sc.nextInt();
        curr = first;
        for (int i = 1; i < pos - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        displaySLL();
    }
}

class RunSLL {
    public static void main(String[] args) {
        SLL obj = new SLL();

        for (int i = 0; i < 5; i++) {
            obj.createSSL();
        }
        obj.displaySLL();

        System.out.println("\n\n# Insert last");
        obj.insertLast();
        System.out.println("\n\n# Insert fisrt");
        obj.insertFisrt();
        System.out.println("\n\n# Insert specific location");
        obj.insertSpecific();

        System.out.println("\n\n# Delete last");
        obj.deleteLast();
        System.out.println("\n\n# Delete fisrt");
        obj.deleteFist();
        System.out.println("\n\n# Delete specific location");
        obj.deleteSpecific();
    }
}
