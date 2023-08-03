// In this progrm we can use WildCard (?) into generic class for a removeing different data type error.

class Employee<T extends Number> {
    String name;
    T[] salary;

    Employee(T[] salary) {
        this.salary = salary;
    }

    int totalSalary() {
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i].intValue();
        }
        return sum;
    }

    boolean compareSalary(Employee<?> emp) { // Use here wildcard
        if (totalSalary() == emp.totalSalary()) {
            return true;
        } else {
            return false;
        }
    }
}

class EmpMain {
    public static void main(String[] args) {

        Integer intSalary1[] = { 10000, 12500, 14000, 11000, 20000 };
        Employee<Integer> e1IntSalary = new Employee<Integer>(intSalary1);
        System.out.println("1st employee salary is: " + e1IntSalary);

        Integer intSalary2[] = { 11000, 14000, 10000, 20000, 12500 };
        Employee<Integer> e2IntSalary = new Employee<Integer>(intSalary2);
        System.out.println("2nd employee salary is: " + e2IntSalary);

        Float floatSalary1[] = { 9000.41F, 11500.50F, 14395.12F, 21450.22F, 30000.96F };
        Employee<Float> e3FloatSalary = new Employee<Float>(floatSalary1);
        System.out.println("3rd employee salary is: " + e3FloatSalary);

        if (e1IntSalary.compareSalary(e2IntSalary)) {
            System.out.println("=> Both employee salary are same!");
        } else {
            System.out.println("=> Both employee salary NOT same!");
        }

        // here we can compare integer & floating point Salary values
        // but can't give error case of we use above wildcard (?)
        if (e2IntSalary.compareSalary(e3FloatSalary)) {
            System.out.println("=> Both employee salary are same!");
        } else {
            System.out.println("=> Both employee salary NOT same!");
        }

    }
}