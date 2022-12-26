package com.nagarro.training.librarymanagementsystem.service;

import java.util.List;

import com.nagarro.training.librarymanagementsystem.entity.Book;

public interface BookService {
	Book addBook(Book book);
	List<Book> getAllBooks();
	Book getBookById(String id);
	Book updateBookById(String id, Book book);
	void deleteBookById(String id);
}
