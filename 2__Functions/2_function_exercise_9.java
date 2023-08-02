import java.util.*;

class Exercise_Q_9 {

    // Logic-1 (Function-1)
    public static void greatest_Common_Divisor(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.printf("GCD of " + a + " and " + b + " is: " + gcd);
    }

    // Logic-2 (Function-2)
    public static void gCD(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }
        System.out.printf("GCD is: " + n2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        greatest_Common_Divisor(num1, num2); // function-1 is call
        gCD(num1, num2); // function-2 is call
    }
}