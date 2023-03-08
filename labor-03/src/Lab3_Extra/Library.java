package Lab3_Extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Library {
    private final String adress;
    private final String name;
    private ArrayList<Book> books = new ArrayList<>();

    public Library(String adress, String name) {
        this.adress = adress;
        this.name = name;
        }

    public void addBook(Book books) {
        this.books.add(this.books.size(), books);
        this.books.ensureCapacity(this.books.size() + 1);
    }

    public void removeBook(Book book) {
        for (int i = 0; i < countBooks(); i++) {
            if (books.contains(book)) {
                books.remove(book);
                books.trimToSize();
            }
        }
    }

    public void checkOut(Book books) {
        books.setCheckedOut(true);
    }

    public void returnBook(Book books) {
        books.setCheckedOut(false);
    }

    int countBooks() {
        return books.size();
    }

    Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}
