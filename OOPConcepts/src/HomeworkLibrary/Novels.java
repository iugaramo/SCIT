package HomeworkLibrary;

public class Novels extends Book {
    private String typeNovel;

    public Novels(String bookTitle, int noOfPages, String typeNovel) {
        super(bookTitle, noOfPages);
        this.typeNovel = typeNovel;
    }

    public String getTypeNovel() {
        return typeNovel;
    }

    public void setTypeNovel(String typeNovel) {
        this.typeNovel = typeNovel;
    }
}


