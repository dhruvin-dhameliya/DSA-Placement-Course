import java.util.*;

class Exercise_Q_10 {

    // Logic-2 (Function-1)
    public static void fibonacciSeries(int n) {
        int add, n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < n; i++) {
            add = n1 + n2;
            System.out.print(add + " ");
            n1 = n2;
            n2 = add;
        }
    }

    // Logic-2 (Function-2)
    public static void fiboSeries(int number) {
        int x = 0, y = 1;
        System.out.print(x + " ");
        if (number > 1) {
            for (int i = 2; i <= number; i++) {
                System.out.print(y + " ");
                int temp = y;
                y = x + y;
                x = temp;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ending number: ");
        int num = sc.nextInt();

        fibonacciSeries(num); // function-1 is call
        fiboSeries(num); // function-2 is call
    }
}