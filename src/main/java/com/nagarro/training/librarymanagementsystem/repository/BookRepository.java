package com.nagarro.training.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.training.librarymanagementsystem.entity.Book;

public interface BookRepository extends JpaRepository<Book, String> {
}
