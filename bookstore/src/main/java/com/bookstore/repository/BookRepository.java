package com.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.model.DAOBook;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<DAOBook, Long> {
    public DAOBook findByTitle(String title);
    public DAOBook findByCategory(String category);
    public ArrayList<DAOBook> findByIs_borrowed(boolean borrowed);
}
