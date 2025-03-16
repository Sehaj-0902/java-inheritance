// Superclass
class Employee {
    // Class attributes
    protected String name;
    protected int id;
    protected double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Salary: Rs " + salary);
    }
}

// Subclass
class Manager extends Employee {
    // Class attributes
    private int teamSize;

    // Calling superclass constructor
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Method to display manager details
    @Override
    public void displayDetails() {
        System.out.println("Manager Details:");
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    // Class attributes
    private String programmingLanguage;

    // Calling superclass constructor
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Method to display developer details
    @Override
    public void displayDetails() {
        System.out.println("Developer Details:");
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    // Class attributes
    private String skills;

    // Calling superclass constructor
    public Intern(String name, int id, double salary, String skills) {
        super(name, id, salary);
        this.skills = skills;
    }

    // Method to display intern details
    @Override
    public void displayDetails() {
        System.out.println("Intern Details:");
        super.displayDetails();
        System.out.println("Skills: " + skills);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Employee manager = new Manager("Alice", 101, 70000, 4);
        Employee developer = new Developer("Sehaj", 102, 60000, "Java");
        Employee intern = new Intern("Charlie", 103, 40000, "DSA");

        // Calling displayDetails() method to display details
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}

/*
Output:
    Manager Details:
    Employee Name: Alice
    Employee Id: 101
    Employee Salary: Rs 70000.0
    Team Size: 4
    Developer Details:
    Employee Name: Sehaj
    Employee Id: 102
    Employee Salary: Rs 60000.0
    Programming Language: Java
    Intern Details:
    Employee Name: Charlie
    Employee Id: 103
    Employee Salary: Rs 40000.0
    Skills: DSA
 */