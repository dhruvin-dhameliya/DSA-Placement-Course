// Find the maximum & minimum number in an array of integers. 

import java.util.*;

class HW_Array_1 {

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
            System.out.print(numberArray[i] + ", ");
        }

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] < min) {
                min = numberArray[i];
            }
            if (numberArray[i] > max) {
                max = numberArray[i];
            }
        }
        System.out.print("\n Minimum number in Array is: " + min);
        System.out.print("\n Maximum number in Array is: " + max);
    }
}
