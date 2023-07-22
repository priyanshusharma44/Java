class Employee {
    public static float base = 10000f;

    float salary() {
        return base;
    }
}

class Manager extends Employee {
    float salary() {
        return base + 20000;
    }
}

class Clerk extends Employee {
    float salary() {
        return base + 10000;
    }
}

class Main {
    void printSalary(Employee e) {
        System.out.println(e.salary());
    }

    public static void main(String[] args) {
        Main main1 = new Main();

        Employee obj1 = new Manager();
        System.out.println("Manager's Salary:");
        main1.printSalary(obj1);

        Employee obj2 = new Clerk();
        System.out.println("Clerk's Salary:");
        main1.printSalary(obj2);
    }
}
