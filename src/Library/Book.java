package src.Library;

public class Book {
    private String title;
    private String author;
    private int numPages;

    @Override
    public String toString(){
        return "Titulo: " + this.title + ", Author:" +  this.author + ", Pages:"+ numPages;
    }

    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getNumPages(){
        return this.numPages;
    }

}