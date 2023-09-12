import java.util.*;

class Deletion {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Apple");
        ll.add("Google");
        ll.add("Microsoft");
        ll.add("Facebook");
        ll.add("Oracle");
        System.out.println("Original: " + ll);

        // you can remove element using index or object value.
        ll.remove("Facebook");
        ll.remove(1);
        System.out.println("Remove: " + ll);

        LinkedList<String> l2 = new LinkedList<String>();
        l2.add("ZOHO");
        l2.add("TCS");
        l2.add("IBM");

        // marge two linked-lists
        ll.addAll(l2);
        System.out.println("Marge: " + ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println("Remove 1st & last: " + ll);

        // here only list-2 elements are deleted from list-1
        ll.removeAll(l2);

        ll.add("Google");
        ll.add("Facebook");
        ll.add("Microsoft");

        ll.removeFirstOccurrence("Google");
        ll.removeLastOccurrence("Microsoft");

        System.out.println("Final: " + ll);

        // all the elements are clears, linked-list is empty
        ll.clear();

        System.out.println("Empty: " + ll);
    }
}