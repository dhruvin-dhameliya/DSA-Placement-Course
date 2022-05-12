import java.util.*;

class Exercise_Q_7 {
    public static void main(String args[]) {

        int positive = 0, negative = 0, zeros = 0;

        System.out.print("Press 1 to continue & 0 to stop: ");
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        while (inputNum == 1) {
            System.out.print("Enter your number: ");
            int num = sc.nextInt();
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeros++;
            }

            System.out.print("\nPress 1 to continue & 0 to stop: ");
            inputNum = sc.nextInt();
        }

        System.out.println("Positives total number: " + positive);
        System.out.println("Negatives total number: " + negative);
        System.out.println("Zeros total number: " + zeros);
    }
}