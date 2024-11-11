public class Book extends ReadingItem{
    String isbn;
    String edition;
    String title;

    public Book(String name, String location, String description, double price, int wordCount, String datePublished, String author, String isbn, String edition, String title){
        super(name, location, description, price, wordCount, datePublished, author);
        this.isbn = isbn;
        this.edition = edition;
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getEdition() {
        return edition;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
