import java.util.*;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printData() {
        System.out.println("Name: " + name + "\tAge: " + age);
    }
}

class UserDefine {
    public static void main(String[] args) {
        // 5 can indicate a 5 data can be stored.
        ArrayList<Person> list = new ArrayList<Person>(5);

        list.add(new Person("Dhruvin", 21));
        Person p1 = new Person("Ravi", 30);
        list.add(p1);
        list.add(new Person("Pooja", 18));
        list.add(p1); // duplicat value can be allowed to add
        list.add(new Person("Janvi", 24));

        list.forEach(p -> p.printData());

        // get values from specific index
        System.out.println("\nName: " + list.get(2).name);
    }
}
