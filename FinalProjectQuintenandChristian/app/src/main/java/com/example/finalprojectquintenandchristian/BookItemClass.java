package com.example.finalprojectquintenandchristian;

public class BookItemClass {
    //variables
    private String bookTitle;
    private String author;
    private String URL;
    private Boolean isDownloaded;
    private String content;
    //couldn't figure out what i had to save the location in the book via scroll location
    //int location;
    //constructor

    public BookItemClass(String T, String A, String U)
    {
        bookTitle = T;
        author = A;
        URL = U;
    }
    //getter and setter functions
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getURL() {
        return URL;
    }

    public void setDownloaded(Boolean downloaded) {
        isDownloaded = downloaded;
    }

    public boolean getIsDownloaded(){
        return isDownloaded;
    }
}
