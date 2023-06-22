import java.util.*;

class ArrayUserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = sc.nextInt();

        String alfabet[] = new String[arraySize];

        // input alfabet from User
        for (int i = 0; i < arraySize; i++) {
            alfabet[i] = sc.next();
        }

        // display alfabet
        for (int i = 0; i < arraySize; i++) {
            System.out.print(alfabet[i] + "|");
        }
    }

}