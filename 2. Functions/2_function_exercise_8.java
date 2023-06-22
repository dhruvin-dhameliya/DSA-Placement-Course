import java.util.*;

class Exercise_Q_8 {

    public static int raisedPower(int x, int n) {
        int pow = 1;
        for (int i = 1; i <= n; i++) {
            pow *= x;
        }
        return pow;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        System.out.println(base + " to the power " + power + " is: " + raisedPower(base, power));
    }
}