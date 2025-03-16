// Superclass
class Book {
    // Class attributes
    protected String title;
    protected String publicationYear;

    // Constructor
    public Book(String title, String publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass
class Author extends Book{
    // Class attributes
    private String name;
    private String bio;

    // Subclass constructor
    public Author(String title, String publicationYear, String name, String bio) {
        // Calling superclass constructor
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Method to display book details with author details
    @Override
    public void displayInfo() {
        // Calling superclass displayInfo() method
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book = new Book("Alice In Wonderland", "1865");

        System.out.println("Book Details:");
        book.displayInfo();

        String authorBio = "Charles Lutwidge Dodgson, better known by his pen name Lewis Carroll, was an English author, poet, mathematician, and photographer.";
        Author bookAuthor = new Author("Alice In Wonderland", "1865", "Lewis Carroll", authorBio);

        System.out.println("Book Details with Author Details:");
        bookAuthor.displayInfo();
    }
}

/*
Output:
    Book Details:
    Title: Alice In Wonderland
    Publication Year: 1865
    Book Details with Author Details:
    Title: Alice In Wonderland
    Publication Year: 1865
    Author: Lewis Carroll
    Bio: Charles Lutwidge Dodgson, better known by his pen name Lewis Carroll, was an English author, poet, mathematician, and photographer.
 */