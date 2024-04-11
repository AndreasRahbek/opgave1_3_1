package com.example.opgave1_3_1.service;

import com.example.opgave1_3_1.Model.Author;
import com.example.opgave1_3_1.Model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {
    private ArrayList<Book> books = new ArrayList<>();
    private Book book= new Book("Java development", "1234", new Author("John Doe", "American"));
    private Book book1 = new Book("Spring framework", "5678", new Author("Jane Roe", "British"));


    public ArrayList<Book> findAllBooks(){
        books.add(book);
        books.add(book1);
        return books;
    }
    public void addBook(Book book){
        books.add(book);
    }
    }
