import java.util.*;

class DeletionAarrayList {

    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("C");
        languages.add("C++");
        languages.add("Java");
        languages.add("Python");
        languages.add("Kotlin");
        languages.add("Php");
        languages.add("Swift");

        System.out.println("ORIGINAL: " + languages);

        // remove specific elements
        languages.remove(5);
        System.out.println("After 5th removal: " + languages);

        boolean status = languages.remove("C++");
        System.out.println("C++ is removed: " + status);

        ArrayList<String> script = new ArrayList<String>();
        script.add("JavaScript");
        script.add("Python");
        script.add("TypeScript");
        script.add("Golang");

        // remove all elements from only script arraylist
        script.removeAll(script);
        System.out.println("After script removal: " + languages);
    }

}
