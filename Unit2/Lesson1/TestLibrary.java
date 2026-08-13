package Unit2.Lesson1;

public class TestLibrary {
    public static void main(String[] args) {
        // Create a library
        Library myLibrary = new Library("Community Library", 10);
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 295, 1937);
        Book book2 = new Book("Dune", "Frank Herbert");
        Book book3 = new Book("The smallest book in history", "TheBestAuthorEver", 1);
        Book book4 = new Book("The story behind null", "HorrorGuy", 67890, 1901);
        Book book5 = new Book("Why birds should be classified as a air vehicle", "CertifiedPilot");
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);
        myLibrary.addBook(book4);
        myLibrary.addBook(book5);
        Book anotherReference = book1;
        System.out.println("Before: " + book1.getBookInfo());
        anotherReference.setPages(10);
        System.out.println("After: " + book1.getBookInfo());
        System.out.println("Before: " + book1.getBookInfo());
        anotherReference.setTitle("The Goblin");
        System.out.println("After: " + book1.getBookInfo());
        myLibrary.displayAllBooks();
        myLibrary.checkBookOut("Dune");
        myLibrary.displayAllBooks();
        System.out.println(myLibrary.findBook("null"));
        myLibrary.removeBook("history");
        myLibrary.displayAllBooks();
        myLibrary.returnBook("Dune");
        myLibrary.checkBookOut("birds");
        myLibrary.addBook(new Book("Best book ever","SuspiciousPerson"));
        System.out.println(myLibrary.findBook("vehicle").getBookInfo());
    }
}