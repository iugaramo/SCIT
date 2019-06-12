package HomeworkLibrary;

public class ArtAlbums extends Book{
    private String paperQuality;

    public ArtAlbums(String bookTitle, int noOfPages, String paperQuality) {
        super(bookTitle, noOfPages);
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }
}
