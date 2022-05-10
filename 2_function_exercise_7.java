import java.util.*;

class Exercise_Q_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int stNum = sc.nextInt();

        System.out.print("Enter ending number: ");
        int endNum = sc.nextInt();

        int positive = 0, negative = 0, zero = 0;

        for (int i = stNum; i <= endNum; i++) {

            if (i > 0) {
                System.out.print(i + ", ");
                positive++;
            }
            if (i < 0) {
                System.out.print(i + ", ");
                negative++;
            }
            if (i == 0) {
                System.out.print(i + ", ");
                zero++;
            }
        }
        System.out.println("\nPositivecount = " + positive);
        System.out.println("Negativecount = " + negative);
        System.out.println("zerocount = " + zero);
    }
}