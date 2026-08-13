package Unit2.Lesson1;
public class Library {
    private String name;
    private Book[] books;
    private int bookCount;
    /* Completely useless code
    public Book GetBookObjByTitle(String title){
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().contains(title)&&books[i]!=null) {
                return books[i];
            }
        }
        System.err.println("Book object with mentioned title not found. Returning first book object...");
        return books[0];
    }
    */
    public int GetBookLocationByTitle(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) continue;
            if (books[i].getTitle().contains(title)) {
                return i;
            }
        }
        System.err.println("No book containing that title. Try a different search query.");
        return -1;
    }
    public Library(String name, int maxBooks) {
        this.name = name;
        this.books = new Book[maxBooks];
        this.bookCount = 0;
    }
    public boolean addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            return true;
        } else {
            System.out.println("Library is full. Cannot add more books.");
            return false;
        }
    }
    public boolean removeBook(String title) {
        if (GetBookLocationByTitle(title) != -1) {
            int location = GetBookLocationByTitle(title);
            books[location] = null;
            System.out.println("Book #" + location + " has been removed!");
            return true;
        } else {
            return false;
        }
    }
    public String findBook(String title) {
        if (GetBookLocationByTitle(title) != -1) {
            return books[GetBookLocationByTitle(title)].getTitle();
        } else {
            System.err.println("No book found with given title.");
            return "Error 404";
        }
    }
    public void checkBookOut(String title) {
        if (GetBookLocationByTitle(title) != -1) {
            int location = GetBookLocationByTitle(title);
            if (books[location].getCheckoutStatus() == false) {
                books[location].setCheckoutStatus(true);
                System.out.println("Book checked out successfully.");
            } else {
                System.err.println("Book was already checked out. Nothing has been changed.");
            }
        } else {
            System.err.println("No book with title found. Nothing has been changed.");
        }
    }
    public void returnBook(String title) {
        if (GetBookLocationByTitle(title) != -1) {
            int location = GetBookLocationByTitle(title);
            if (books[location].getCheckoutStatus() == true) {
                books[location].setCheckoutStatus(false);
                System.out.println("Book returned successfully.");
            } else {
                System.err.println("Book was already returned. Nothing has been changed.");
            }
        } else {
            System.err.println("No book with title found. Nothing has been changed.");
        }
    }
    public void displayAllBooks() {
        System.out.println("All books in " + name + ":");
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) continue;
            System.out.println("Book #" + i + ":\n -> " + books[i].getBookInfo() + "\n -> Checked out: " + books[i].getCheckoutStatus());
        }
    }
}