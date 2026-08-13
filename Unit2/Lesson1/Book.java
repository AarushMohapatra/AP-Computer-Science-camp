package Unit2.Lesson1;

public class Book {
    private String title, author;
    private int pages, yearPublished;
    private boolean isCheckedOut;
    public Book(String title, String author, int pages, int yearPublished) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.yearPublished = yearPublished;
        this.isCheckedOut = false;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
        this.yearPublished = 2026;
        this.isCheckedOut = false;
    }
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.pages = 0;
        this.yearPublished = yearPublished;
        this.isCheckedOut = false;
    }
    /*public Book(String title, String author, int pages) { Commented out to not cause errors
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.yearPublished = 2026;
        this.isCheckedOut = false;
    }*/
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPages() {
        return pages;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public boolean getCheckoutStatus() {
        return isCheckedOut;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    public void setCheckoutStatus(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }
    public String checkOut() {
        if (isCheckedOut) {
            return "Error: The book '" + title + "' is already checked out.";
        } else {
            isCheckedOut = true;
            return "The book '" + title + "' has been checked out successfully.";
        }
    }
    public String returnBook() {
        if (isCheckedOut) {
            isCheckedOut = false;
            return "The book '" + title + "' has been returned successfully!";
        } else {
            return "Error: '" + title + "' has been already returned.";
        }
    }
    public String getBookInfo() {
        return "Book details: '" + title + "', by " + author + ", published in " + yearPublished + " with " + pages + " pages.";
    }
}