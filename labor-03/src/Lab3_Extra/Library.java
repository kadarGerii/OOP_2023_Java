package Lab3_Extra;

import java.util.Arrays;
import java.util.Collections;

public class Library extends Book{
    private String adress;
    private String name;
    Book[] books;

    public Library(String adress, Book[] books, String name, String author, int numPages, String title, boolean checkedOut, String isbn) {
        super(author, numPages, title, checkedOut, isbn);
        this.adress = adress;
        this.books = books;
        this.name = name;
    }
    public void sortByAuthorAndPages(){
        Arrays.sort(books);
    }
    public void addBook(Book books){
        
    }
}
