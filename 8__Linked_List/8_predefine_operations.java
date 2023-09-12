import java.util.*;

class Operation {
    public static void main(String[] args) {
        LinkedList<Integer> mark = new LinkedList<Integer>();
        mark.add(65);
        mark.add(40);
        mark.add(98);
        mark.add(100);
        mark.add(75);
        System.out.println("Marks list: " + mark);

        // it can chack elements is contain in listor not
        boolean status = mark.contains(98);
        if (status) {
            System.out.println("98 mark is contains.");
        } else {
            System.out.println("Don't contains 98 mark.");
        }

        System.out.println("Total list size is: " + mark.size());

        System.out.println("1st index element: " + mark.get(1));

        // chnage existing elements with index
        mark.set(4, 50);
        System.out.println("After chnage: " + mark);
    }
}