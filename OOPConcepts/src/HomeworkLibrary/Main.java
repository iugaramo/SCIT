package HomeworkLibrary;

public class Main {
    public static void main(String[] args) {

        BookLibrary library = new BookLibrary();
        Book book1= new Book("Crime and Punishment Vol 1",100);
        Book book2= new Book("Crime and Punishment Vol 2",200);



        library.listBooks();

        library.addBook(book1);
        library.addBook(book2);
        library.listBooks();

        library.deleteBook("Inexistent Title"); // should print "book was not found..."
        library.listBooks();

        library.deleteBook("Crime and Punishment Vol 1");
        library.listBooks();

    }
}
