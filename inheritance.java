class Employee {
    int salary = 45000;
}

class Programmer extends Employee {
    int bonus = 1000;
}

public class Main {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Salary: " + p.salary);
        System.out.println("Bonus: " + p.bonus);
    }
}