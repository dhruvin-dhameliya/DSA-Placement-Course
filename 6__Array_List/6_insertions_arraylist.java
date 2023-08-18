import java.util.*;

class InsertionsArrayList {

    public static void main(String[] args) {

        ArrayList<String> topCompany = new ArrayList<String>();
        topCompany.isEmpty(); // It can check if arraylist is empty
        topCompany.add("Apple");
        topCompany.add("Google");
        topCompany.add("Amazon");
        topCompany.add("Microsoft");
        topCompany.add("Facebook");
        topCompany.add("Google");

        System.out.println("Total top company is: " + topCompany.size());
        System.out.println("OLD: " + topCompany);

        System.out.println("Best Company is: " + topCompany.get(0));
        System.out.println("Last Company is: " + topCompany.get(topCompany.size() - 1));

        // Insertions elements into arraylist
        topCompany.set(2, "Adobe");
        System.out.println("NEW: " + topCompany);
        System.out.println("Total top company is: " + topCompany.size());

        // Serching elements from arraylist
        System.out.println("Google is exist: " + topCompany.contains("Google"));
        System.out.println("indexof 'Microsoft': " + topCompany.indexOf("Microsoft"));
        System.out.println("Last index of 'Google': " + topCompany.lastIndexOf("Google"));
    }
}
