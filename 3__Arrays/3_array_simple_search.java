import java.util.*;

class ArraySimpleSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = sc.nextInt();

        int numberArray[] = new int[arraySize];

        // input Number from User
        for (int i = 0; i < arraySize; i++) {
            numberArray[i] = sc.nextInt();
        }

        // display all Number
        for (int i = 0; i < arraySize; i++) {
            System.out.print(numberArray[i] + "|");
        }

        // search number in Array (Linear Search)
        System.out.print("\nEnter number for Search: ");
        int searchNum = sc.nextInt();

        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == searchNum) {
                System.out.print("Number found at index: " + i);
            }
        }
    }
}
