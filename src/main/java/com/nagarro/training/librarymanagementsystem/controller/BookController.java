package com.nagarro.training.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.training.librarymanagementsystem.entity.Book;
import com.nagarro.training.librarymanagementsystem.service.impl.BookServiceImpl;

@RestController()
@RequestMapping("/library.management/api/v1/books")
public class BookController {
	private BookServiceImpl bookServiceImpl;

	public BookController(BookServiceImpl bookServiceImpl) {
		super();
		this.bookServiceImpl = bookServiceImpl;
	}
	
	@PostMapping("")
	public ResponseEntity<Book> addBook(@RequestBody Book book){
		return new ResponseEntity<Book>(bookServiceImpl.addBook(book), HttpStatus.OK);
	}
	
	@GetMapping("")
	public List<Book> getAllBooks(){
		return bookServiceImpl.getAllBooks();
	}
	
	@GetMapping("{id}")
	public Book getBookById(@PathVariable("id") String id) {
		return bookServiceImpl.getBookById(id);
	}
	
	@PutMapping("{id}")
	public Book updateBookById(@PathVariable("id") String bookId, @RequestBody Book book) {
		return bookServiceImpl.updateBookById(bookId, book);
	}
	
	@DeleteMapping("{id}")
	public void deleteBookById(@PathVariable("id") String bookId) {
		bookServiceImpl.deleteBookById(bookId);
	}

}
