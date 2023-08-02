class GenericClass<T extends Number> {

    T[] tArray;

    public GenericClass(T[] tArray) {
        this.tArray = tArray;
    }

    double averageMarks() {
        double sum = 0.0;
        for (int i = 0; i < tArray.length; i++) {
            sum += tArray[i].doubleValue();
        }
        return sum / tArray.length;
    }

}

class DemoMainClass {
    public static void main(String[] args) {

        Integer intArray[] = { 11, 22, 30, 48, 50 };
        GenericClass<Integer> intData = new GenericClass<Integer>(intArray);

        double result = intData.averageMarks();
        System.out.println("Your average marks: " + result);
    }
}
