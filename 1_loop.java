import java.util.*;

class Loop {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int sum = 0, n;

        System.out.print("Enter number: ");
        n = sc.nextInt();

        // n natural number print program
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " + ");
            sum += i;

        }
        System.out.println("\n--> Natural number sum is: " + sum + "\n\n");

        // Print table for matamatic student
        int ans;
        for (int j = 1; j <= 10; j++) {
            ans = j * n;
            System.out.println(n + " x " + j + " = " + ans);
        }
    }

}
