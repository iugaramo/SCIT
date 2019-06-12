package HomeworkLibrary;



public class BookLibrary {


    private Book[] library;


    public BookLibrary() {

        library = new Book[0];
    }

    public void listBooks() {
        String result = "The library contains the following books: [";

        for (int i = 0; i < library.length; i++) {
            if( i != 0 ) {

                result = result + ",";
            }
            result = result + " " + library[i].getBookTitle();
        }

        result = result + "]";

        System.out.println(result);
    }

    public void addBook(Book newBook) {

        Book[] newLibrary = new Book[library.length + 1];


        for (int i = 0; i < library.length; i++) {
            newLibrary[i] = library[i];
        }


        newLibrary[newLibrary.length - 1] = newBook;


        this.library = newLibrary;
    }

    public void deleteBook(String bookTitle) {

        int bookAtIndex = -1;
        for (int i = 0; i < library.length; i++) {
            if( bookTitle.equals( library[i].getBookTitle() ) ) {
                bookAtIndex = i;

                break;
            }
        }

        if(bookAtIndex == -1) {

            System.out.println("The book [" + bookTitle + "] was not found in the library.");

            return;
        }

        Book[] newLibrary = new Book[library.length - 1];


        int indexInNewArray = 0;
        for (int i = 0; i < library.length; i++) {
            if(i != bookAtIndex) {
                newLibrary[indexInNewArray] = library[i];
                indexInNewArray++;
            }
        }


        this.library = newLibrary;
    }
}
