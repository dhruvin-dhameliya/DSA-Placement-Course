import java.util.*;

class Exercise_Q_2 {

    public static int oddNumberSum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
                result += i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n1 = sc.nextInt();

        System.out.println("\nOdd number sum is: " + oddNumberSum(n1));
    }
}