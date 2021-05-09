package com.bookstore.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class DAOUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String role;
    @OneToMany
    @JoinColumn(name="user_id")
    private List<DAOBook> bookList;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<DAOBook> getBookList() { return bookList; }

    public void setBookList(List<DAOBook> bookList) { this.bookList = bookList; }

}