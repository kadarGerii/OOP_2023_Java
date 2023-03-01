package Lab3_Extra;

public class Book {
    final private String author;
    private int numPages;
    final private String title;
    private boolean checkedOut;
    private String isbn;

    public Book(String author, int numPages, String title, boolean checkedOut, String isbn) {
        this.author = author;
        this.numPages = numPages;
        this.title = title;
        this.checkedOut = checkedOut;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setNumPages(int numPages){
        this.numPages = numPages;
    }
    public boolean isCheckedOut(){
        return this.checkedOut;
    }
    public String toString(){
        return getTitle() + " by " + getAuthor();
    }
}
