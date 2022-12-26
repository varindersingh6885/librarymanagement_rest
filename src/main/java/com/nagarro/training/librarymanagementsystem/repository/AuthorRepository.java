package com.nagarro.training.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.training.librarymanagementsystem.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
