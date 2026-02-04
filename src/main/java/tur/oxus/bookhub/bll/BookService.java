package tur.oxus.bookhub.bll;

import tur.oxus.bookhub.bo.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    List<Book> loadAllBooks();
    void updateBook(long bookId);
    void removeBook(long bookId);
}
