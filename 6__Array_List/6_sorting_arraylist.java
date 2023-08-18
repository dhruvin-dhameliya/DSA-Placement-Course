import java.util.*;

class SortingArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(42);
        num.add(11);
        num.add(35);
        num.add(97);
        num.add(68);

        System.out.println("BEFORE: " + num);
        // collection methods can be use for sorting
        Collections.sort(num);
        System.out.println("AFTER: " + num);

        List<String> country = new ArrayList<String>();
        country.add("India");
        country.add("America");
        country.add("Canada");
        country.add("UK");
        country.add("Germany");

        System.out.println("ORIGINAL: " + country);

        // this sort method is a arraylist method, & Comparator methods is must required
        country.sort(new Comparator<String>() {
            @Override
            public int compare(String c1, String c2) {
                return c1.compareTo(c2);
            }
        });

        System.out.println("SORTED: " + country);

        // ---------------- Array list to Array ----------------------------
        ArrayList<Float> f1 = new ArrayList<Float>();
        f1.add(14.32F);
        f1.add(30.99F);
        f1.add(78.47F);
        f1.add(90.00F);
        f1.add(5.11F);

        System.out.println("\nArraylist: " + f1);

        // here ArrayList can convert into Array, must be use wrapper class
        Float arr[] = new Float[f1.size()];
        arr = f1.toArray(arr);

        System.out.print("Array: [");
        for (float i : arr) {
            System.out.print(i + ", ");
        }
        System.out.print("]");
    }
}
