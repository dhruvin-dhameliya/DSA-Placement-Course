import java.util.*;

class FectorialClass {

    // write 'public static' keyword means it can be call without create an object
    // of a class.
    public static void fectorialClac(int number) {
        if (number < 0) {
            System.out.println("Nagative number cannot calculate fectorial!");
            return;
        }
        int calc = 1;
        for (int i = number; i >= 1; i--) {
            calc *= i;
        }
        System.out.println("Your fectorial number is: " + calc);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        fectorialClac(num);
    }
}
