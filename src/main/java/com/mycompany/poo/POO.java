package com.mycompany.poo;

import controlllers.HandlerBook;
import models.Books;
import models.Comic;


public class POO {

    public static void main(String[] args) {
        HandlerBook handler = new HandlerBook();
        Books book = new Books(1, "Lala", "Chanchito feliz");
        Comic comic = new Comic(1, "Lala", "Chanchito feliz", 50);
        handler.AddBook(book);
        handler.AddBook(comic);
        handler.RecorrerLibros();
    }
}
