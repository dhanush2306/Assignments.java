package DAY7ASSIGNMENT5;
abstract class Employee {
    int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    abstract double calculateSalary();
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
class FullTimeEmployee extends Employee {

    double monthlySalary;

    FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee {

    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
public class Task2{
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(101, "Alice", 50000);
        Employee e2 = new PartTimeEmployee(102, "Bob", 80, 300);

        e1.display();
        System.out.println("Salary: " + e1.calculateSalary());

        System.out.println();

        e2.display();
        System.out.println("Salary: " + e2.calculateSalary());
    }
}