import java.util.*;

class Exercise_Q_4 {

    void circumference_of_circle(int radius) {
        final float pi = 3.14159F;
        float ans = 2 * pi * radius;
        System.out.println("circumference of a circle is: " + ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercise_Q_4 obj = new Exercise_Q_4();

        System.out.print("Enter radius: ");
        int r = sc.nextInt();

        obj.circumference_of_circle(r);
    }
}