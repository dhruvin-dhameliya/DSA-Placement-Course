class Students<T extends Number> {

    String name;
    T[] marks;

    Students(T[] marks) {
        this.marks = marks;
    }

    double totalMarks() {
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i].doubleValue();
        }
        return sum;
    }

    boolean compareMarks(Students<T> cmp) {
        if (totalMarks() == cmp.totalMarks()) {
            return true;
        } else {
            return false;
        }
    }
}

class StudentMainClass {
    public static void main(String[] args) {

        // there are two integer student markes
        Integer intMarks1[] = { 41, 38, 47, 40, 50 };
        Students<Integer> s1IntMark = new Students<Integer>(intMarks1);
        System.out.println("Integer total marks: " + s1IntMark.totalMarks());

        Integer intMarks2[] = { 41, 38, 47, 40, 50 };
        Students<Integer> s2IntMark = new Students<Integer>(intMarks2);
        System.out.println("Integer total marks: " + s2IntMark.totalMarks());

        // stored floating point base markes
        Float floatMark[] = { 32.41F, 49.21F, 22.56F, 35.00F, 42.47F };
        Students<Float> s3FloatMark = new Students<Float>(floatMark);
        System.out.println("Floating total marks: " + s3FloatMark.totalMarks());

        // stored double base markes
        Double doubleMark[] = { 25.00, 36.11, 48.65, 50.00, 31.45 };
        Students<Double> s4DoubleMark = new Students<Double>(doubleMark);
        System.out.println("Double total marks: " + s4DoubleMark.totalMarks());

        // Now we compare a student mark
        if (s1IntMark.compareMarks(s2IntMark)) { // No error: case of same data types use
            System.out.println("Both are same marks!");
        } else {
            System.out.println("Different marks!");
        }

        // Error: case of different data types use
        /* if (s3FloatMark.compareMarks(s4DoubleMark)) {
            System.out.println("Both are same marks!");
        } else {
            System.out.println("Different marks!");
        } */

    }
}