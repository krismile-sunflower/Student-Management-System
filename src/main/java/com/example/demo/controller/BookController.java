package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@CrossOrigin(allowCredentials = "true")

public class BookController {


    @Autowired
    BookService bookService;

    @GetMapping("/getAll")
    public List<Book> queryAllBook(){
        return bookService.queryAllBook();
    }

    
    @GetMapping("/getOne")
    public List<Book> queryById(Integer id){
        return (List<Book>) bookService.queryById(12345);
    }

    @PostMapping("/add")
    public int addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

}
