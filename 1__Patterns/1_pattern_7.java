import java.util.*;

class Pattern_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter step number: ");
        int num = sc.nextInt();
        // Logic-1
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n");
        // Logic-2
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num - i + 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}