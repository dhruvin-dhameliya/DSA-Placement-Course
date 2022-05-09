import java.util.*;

class Function_Q_1 {

    void prime_or_not(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is a Even number.");
        } else {
            System.out.println(number + " is a Odd number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        Function_Q_1 obj = new Function_Q_1();

        obj.prime_or_not(num);
    }
}
