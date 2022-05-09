import java.util.*;

class Function_Q_2 {

    void prinTable(int number) {
        for (int i = 1; i <= 10; i++) {
            int ans = number * i;
            System.out.println(number + " x " + i + " = " + ans);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        Function_Q_2 obj = new Function_Q_2();

        obj.prinTable(num);
    }
}
