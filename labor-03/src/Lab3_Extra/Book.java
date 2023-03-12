package Lab3_Extra;

import java.util.Objects;

public class Book {
    final private String author;
    private int numPages;
    final private String title;
    private boolean checkedOut;
    private String isbn;

    public Book(String author, String title) {
        this.author = author;
        this.numPages = 0;
        this.title = title;
        this.checkedOut = false;
        this.isbn = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
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
