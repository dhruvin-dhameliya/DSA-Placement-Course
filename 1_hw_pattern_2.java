import java.util.*;

class HW_Pattern_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter step number: ");
        int num = sc.nextInt();

        // Logic-1
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) { // num to i tracking for print space
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Logic-2
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) { // 1 to (num-i) tracking for print space
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}