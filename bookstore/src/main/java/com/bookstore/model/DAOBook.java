package com.bookstore.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class DAOBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="title")
    private String title;
    @Column(name="author")
    private String author;
    @Column(name="category")
    private String category;
    @Column(name="is_borrowed")
    private boolean isBorrowed;
    @Column(name="quantity")
    private int quantity;
    @Column(name="user_id")
    private long userId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public int isQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public DAOBook() {
    }

    public DAOBook(long id,
                   String title,
                   String author,
                   String category,
                   boolean isBorrowed,
                   int quantity,
                   long userId) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.isBorrowed = isBorrowed;
        this.quantity = quantity;
        this.userId = userId;
    }
}