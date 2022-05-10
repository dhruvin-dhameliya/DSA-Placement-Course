import java.util.*;

class Exercise_Q_10 {

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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ending number: ");
        int num = sc.nextInt();

        fibonacciSeries(num);
    }
}