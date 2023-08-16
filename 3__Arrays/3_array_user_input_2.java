import java.util.*;

class Quiz1 {

    Scanner sc = new Scanner(System.in);

    void loadArray(int ss) {
        int a[] = new int[ss];

        for (int i = 0; i < ss; i++) {
            System.out.println("Enter " + (i + 1) + "th number: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Length of array: " + a.length);
        System.out.println(Arrays.toString(a));
    }
}

class MainQuiz1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = sc.nextInt();

        Quiz1 obj = new Quiz1();
        obj.loadArray(size);
    }
}
