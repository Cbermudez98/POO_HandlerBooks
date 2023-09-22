package controlllers;

import java.util.ArrayList;
import models.Books;

public class HandlerBook {
    public ArrayList<Books> books = new ArrayList<>();
    public void AddBook(Books book) {
        books.add(book);
    }
    
    public void RecorrerLibros() {
        for (Books book: books) {
            System.out.println(book.QuienSoy());
        }
    }
}
