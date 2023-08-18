import java.util.*;

class SimpleArrayList {

    public static void main(String[] args) {

        // Only string can stored in array-list
        ArrayList<String> list_1 = new ArrayList<String>();
        list_1.add("Appple");
        list_1.add("Banana");
        list_1.add("Mango");
        list_1.add("Cherry");
        list_1.add("Orange");
        System.out.println("String:-> " + list_1);

        // Only integer can stored in array-list
        ArrayList<Integer> list_2 = new ArrayList<Integer>();
        list_2.add(11);
        list_2.add(22);
        list_2.add(33);
        list_2.add(44);
        list_2.add(55);
        System.out.println("\nInteger:-> " + list_2);

        // Mix datatype can stored in array-list
        ArrayList list_3 = new ArrayList();
        list_3.add("Hello!");
        list_3.add(2023);
        list_3.add(51.44);
        list_3.add(62.579F);
        System.out.println("\nMix:-> " + list_3);

        // ----------------------------------------

        // Create a collection with existing array-list

        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(10);
        aList.add(20);
        aList.add(30);

        // Above existing array-list can copy into below array-list,
        // than append next new elements
        ArrayList<Integer> bList = new ArrayList<Integer>(aList);
        bList.add(40);
        bList.add(50);
        bList.add(60);

        System.out.println("\n" + aList);
        System.out.println(bList);
    }
}
