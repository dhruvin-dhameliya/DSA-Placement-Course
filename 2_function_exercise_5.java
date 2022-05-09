import java.util.*;

class Exercise_Q_5 {

    void votingPerson(int age) {
        System.out.print("your Age is: " + age);
        if (age >= 18) {
            System.out.println("\n--> You are eligible to Vote.");
        } else {
            System.out.println("\n--> You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Exercise_Q_5 obj = new Exercise_Q_5();

        System.out.print("Enter your age: ");
        int personAge = sc.nextInt();
        obj.votingPerson(personAge);

    }
}