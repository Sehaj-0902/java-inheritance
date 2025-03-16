import java.util.Scanner;

// Superclass
class Animal {
    // Class attributes
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println("Animal is making sound.");
    }
}

// Subclass
class Dog extends Animal {
    // Calling superclass constructor
    public Dog(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound() method in superclass
    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }
}

// Subclass
class Cat extends Animal {
    // Calling superclass constructor
    public Cat(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound() method in superclass
    @Override
    public void makeSound() {
        System.out.println(name + " meows.");
    }
}

// Subclass
class Bird extends Animal {
    // Calling superclass constructor
    public Bird(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound() method in superclass
    @Override
    public void makeSound() {
        System.out.println(name + " chirps.");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for dog's name and age
        System.out.print("Enter dog's name: ");
        String dogName = sc.nextLine();
        System.out.print("Enter dog's age: ");
        int dogAge = sc.nextInt();

        sc.nextLine();

        // Taking input for cat's name and age
        System.out.print("Enter cat's name: ");
        String catName = sc.nextLine();
        System.out.print("Enter cat's age: ");
        int catAge = sc.nextInt();

        sc.nextLine();

        // Taking input for bird's name and age
        System.out.print("Enter bird's name: ");
        String birdName = sc.nextLine();
        System.out.print("Enter bird's age: ");
        int birdAge = sc.nextInt();

        // Creating object of superclass
        Animal animal = new Animal("",0);
        animal.makeSound();

        // Creating objects of subclasses
        Animal dog = new Dog(dogName, dogAge);
        Animal cat = new Cat(catName, catAge);
        Animal bird = new Bird(birdName, birdAge);

        // Calling makeSound() method to show polymorphism
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}

/*
Input:
    Enter dog's name: Ace
    Enter dog's age: 3
    Enter cat's name: Cleo
    Enter cat's age: 2
    Enter bird's name: Chirpy
    Enter bird's age: 4
Output:
    Animal is making sound.
    Ace barks.
    Cleo meows.
    Chirpy chirps.
 */