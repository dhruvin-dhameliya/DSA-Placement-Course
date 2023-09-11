import java.util.*;

class Insertion {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Surat");
        list.add("Ahmedabad");
        list.addLast("Kolkata"); // It's add at last position
        list.addFirst("Bangalore"); // It's add at first position
        list.add(3, "Delhi"); // It's add at 3nd index
        list.add("Chennai"); // It's add sequancial order at end

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print("|" + itr.next() + "|=>");
        }
        System.out.println("Null");

        // --------------------- MARGE LINKED LIST ----------------------------
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Apple");
        l1.add("Mango");
        l1.add("Banana");
        System.out.println("FIRST LIST: " + l1);

        LinkedList<String> l2 = new LinkedList<String>();
        l2.addFirst("Orange");
        l2.addLast("Strawberry");
        l2.add("BlackBerry");
        l1.addAll(l2);
        System.out.println("MARGE-2: " + l1);

        LinkedList<String> l3 = new LinkedList<String>();
        l3.add("Google");
        l3.add("Microsoft");
        l1.addAll(4, l3);
        System.out.println("MARGE-3: " + l1);

        l1.addFirst("Adobe");
        l1.addLast("Oracle");
        l1.add("Facebook");
        System.out.println("FINAL LIST: " + l1);
    }
}