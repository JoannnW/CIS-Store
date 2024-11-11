public class Magazine extends ReadingItem{
    private String coverStoryTitle;
    private String printDate;
    public Magazine(String name, String location, String description, double price, int wordCount, String datePublished, String author, String coverStoryTitle, String printDate){
        super(name, location, description, price, wordCount, datePublished, author);
        this.coverStoryTitle = coverStoryTitle;
        this.printDate = printDate;
    }

    public void setCoverStoryTitle(String coverStoryTitle) {
        this.coverStoryTitle = coverStoryTitle;
    }

    public String getCoverStoryTitle() {
        return coverStoryTitle;
    }

    public void setPrintDate(String printDate) {
        this.printDate = printDate;
    }

    public String getPrintDate() {
        return printDate;
    }
}
