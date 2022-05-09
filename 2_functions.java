import java.util.*;

class FunctionProgram {

    // function-1
    void twoNumAddition(int a, int b) { // function declaration
        int sum = a + b;
        System.out.print("You sum is: " + sum);
        return; // it can be write optional
    }

    // function-2
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

        FunctionProgram obj = new FunctionProgram(); // create class objects

        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();

        obj.twoNumAddition(n1, n2); // function-1 call

        System.out.print("\n\nEnter your age: ");
        int personAge = sc.nextInt();
        obj.votingPerson(personAge); // function-2 call

    }
}