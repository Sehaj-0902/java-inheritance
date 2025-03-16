// Superclass
class Person {
    // Class attributes
    protected String name;
    protected int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Subclass
class Chef extends Person implements Worker {
    // Class attributes
    private String speciality;

    // Subclass Constructor
    public Chef(String name, int id, String speciality) {
        // Calling superclass constructor
        super(name, id);
        this.speciality = speciality;
    }

    // Method to display chef details
    public void displayChefDetails() {
        super.displayDetails();
        System.out.println("Speciality: " + speciality);
    }

    // Method to display chef duties
    @Override
    public void performDuties() {
        System.out.println("Duties: Food Preparation, Recipe Development, Menu Planning");
    }

}

// Subclass
class Waiter extends Person implements Worker {
    // Class attributes
    private int numberOfOrders;

    // Subclass Constructor
    public Waiter(String name, int id, int numberOfOrders) {
        // Calling superclass constructor
        super(name, id);
        this.numberOfOrders = numberOfOrders;
    }

    // Method to display waiter details
    public void displayWaiterDetails() {
        super.displayDetails();
        System.out.println("Number of Orders: " + numberOfOrders);
    }

    // Method to display waiter duties
    @Override
    public void performDuties() {
        System.out.println("Duties: Greeting Guests, Taking Orders, Serving Food and Beverages");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Alice", 101, "Patisser");
        System.out.println("Chef Details:");
        chef.displayChefDetails();
        chef.performDuties();

        Waiter waiter = new Waiter("Charlie", 102, 5);
        System.out.println("\nWaiter Details:");
        waiter.displayWaiterDetails();
        waiter.performDuties();
    }
}

/*
Output:
    Chef Details:
    Name: Alice
    ID: 101
    Speciality: Patisser
    Duties: Food Preparation, Recipe Development, Menu Planning

    Waiter Details:
    Name: Charlie
    ID: 102
    Number of Orders: 5
    Duties: Greeting Guests, Taking Orders, Serving Food and Beverages
 */