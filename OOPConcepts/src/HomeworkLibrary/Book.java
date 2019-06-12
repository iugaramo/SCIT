package HomeworkLibrary;

public class Book {
    private String bookTitle;
    private int noOfPages;

    public Book(String bookTitle, int noOfPages) {
        this.bookTitle = bookTitle;
        this.noOfPages = noOfPages;

    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    @Override
    public String toString() {
        return bookTitle + "(" + noOfPages + " pages)";
    }
}