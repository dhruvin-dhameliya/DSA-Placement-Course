import java.util.*;

class Traversals {

    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("India");
        l.add("USA");
        l.add("Canada");
        l.add("Australia");
        l.add("Japan");

        // it can traverse front to end direction
        Iterator<String> itr2 = l.iterator();
        while (itr2.hasNext()) {
            System.out.print(itr2.next() + ", ");
        }

        System.out.println();

        // it can traverse last to front direction
        Iterator<String> itr1 = l.descendingIterator();
        while (itr1.hasNext()) {
            System.out.print(itr1.next() + ", ");
        }
    }
}
