
package bookController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import bookEntity.BookEntity;
import bookService.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public BookEntity addBook(@RequestBody BookEntity bookEntity) {
        return bookService.addBook(bookEntity);
    }

    @GetMapping
    public List<BookEntity> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PutMapping
    public BookEntity updateBook(@RequestBody BookEntity bookEntity) {
        return bookService.updateBook(bookEntity);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
        return "Book deleted successfully";
    }
}