public class ReadingItem extends CISItem{
    private int wordCount;
    private String datePublished;
    private String author;

    public ReadingItem(String name, String location, String description, double price, int wordCount, String datePublished, String author){
        super(name, location, description, price);
        this.wordCount = wordCount;
        this.datePublished = datePublished;
        this.author = author;
    }

    public void setWordCount(int wordCount){
        this.wordCount = wordCount;
    }
    public int getWordCount(){
        return wordCount;
    }

    public void setDatePublished(String datePublished){
        this.datePublished = datePublished;
    }
    public String getDatePublished(){
        return datePublished;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }

}
