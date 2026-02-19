

package bookRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import bookEntity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {
}