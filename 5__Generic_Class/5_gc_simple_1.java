class Marks<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {

        Marks<Integer> rectangle = new Marks<Integer>();
        Marks<Double> circle = new Marks<Double>();

        rectangle.add(10);
        circle.add(2.5);

        System.out.println(rectangle.get());
        System.out.println(circle.get());
    }
}