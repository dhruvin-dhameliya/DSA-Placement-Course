class Array1 {

    public static void main(String[] args) {

        int size = 5;
        int marks[] = new int[size]; // Method-1 declare Array

        marks[0] = 45;
        marks[1] = 50;
        marks[2] = 31;
        marks[3] = 48;
        marks[4] = 36;

        for (int i = 0; i < size; i++) { // Print Array
            System.out.println(marks[i]);
        }

        // -------------------------------------------------------------------------------------------------------
        System.out.println();

        String friend[] = { "Om", "Jay", "Ravi", "Kevin", "Krishna" }; // Method-2 declare Array

        for (int i = 0; i < size; i++) { // Print Array
            System.out.println(friend[i]);
        }
    }
}