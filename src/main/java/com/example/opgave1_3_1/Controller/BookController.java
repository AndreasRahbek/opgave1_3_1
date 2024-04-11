package com.example.opgave1_3_1.Controller;

import com.example.opgave1_3_1.Model.Author;
import com.example.opgave1_3_1.Model.Book;
import com.example.opgave1_3_1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String showBooks(Model model){
        model.addAttribute("books", bookService.findAllBooks());
        return "books";
    }
    @GetMapping("/addBook")
    public String addBookForm(Model model){
        Book book = new Book();
        Author author = new Author();
        book.setAuthor(author);
        model.addAttribute("author",book.getAuthor());
        model.addAttribute("book", book);
        return "addBook";
    }
    @PostMapping("/addBook")
    public String addBookSubmit(Book book){
        bookService.addBook(book);
        return "redirect:/";

    }
}
