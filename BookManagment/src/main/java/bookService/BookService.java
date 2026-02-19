
package bookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookEntity.BookEntity;
import bookRepository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookEntity addBook(BookEntity bookEntity) {
        return bookRepository.save(bookEntity);
    }

    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }

    public BookEntity updateBook(BookEntity bookEntity) {
        return bookRepository.save(bookEntity);
    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}