import java.util.*;

class Predef {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Apple");
        list.add("Google");
        list.add("Microsoft");
        list.add("Amazon");
        list.add("Oracle");

        // normal printing
        for (int i = 0; i < 5; i++) {
            System.out.print("|" + list.get(i) + "|=>");
        }
        System.out.print("Null\n\n");

        // print linked list using Iterators
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print("|" + itr.next() + "|=>");
        }
        System.out.print("Null\n\n");
    }
}