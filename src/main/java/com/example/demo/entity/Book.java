package com.example.demo.entity;

public class Book {
    private Integer BookId;
    private String BookName;
    private double BookPrice;
    private String BookAuthor;

    public Book() {
    }

    public Book(Integer bookId, String bookName, double bookPrice, String bookAuthor) {
        BookId = bookId;
        BookName = bookName;
        BookPrice = bookPrice;
        BookAuthor = bookAuthor;
    }

    public Integer getBookId() {
        return BookId;
    }

    public void setBookId(Integer bookId) {
        BookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public double getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(double bookPrice) {
        BookPrice = bookPrice;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookId=" + BookId +
                ", BookName='" + BookName + '\'' +
                ", BookPrice=" + BookPrice +
                ", BookAuthor='" + BookAuthor + '\'' +
                '}';
    }
}