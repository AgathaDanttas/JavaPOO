package src.Library;

import java.util.*;

public class Library {
    private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public boolean addBook(Book book){
        return books.add(book);
    }
    public boolean removeBook(String title){
        return books.removeIf(book -> book.getTitle().equals(title));
    }

    public Book findBookByTitle(String title){
        for(Book book: books){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
       return null;
    }

    public List<Book> listBooks(){
        return new ArrayList<>(books);
    }

}
