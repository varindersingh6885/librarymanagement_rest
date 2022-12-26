package com.nagarro.training.librarymanagementsystem.service;

import java.util.List;

import com.nagarro.training.librarymanagementsystem.entity.Author;

public interface AuthorService {
	Author saveAuthor(Author author);
	List<Author> getAllAuthors();
	Author getAuthorById(int id);
	Author updateAuthorById(int id, Author author);
	void deleteAuthorById(int id);
}
