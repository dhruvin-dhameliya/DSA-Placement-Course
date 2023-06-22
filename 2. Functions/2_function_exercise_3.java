import java.util.*;

class Exercise_Q_3 {

    public static void greaterNumber(int x, int y) {
        if (x > y) {
            System.out.println(x + " is gratter than number " + y);
        } else if (y > x) {
            System.out.println(y + " is gratter than number " + x);
        } else if (x == y) {
            System.out.println(x + " and " + y + " both are equal number.");
        } else {
            System.out.println("Invalid number!!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();

        greaterNumber(n1, n2);
    }
}