package tur.oxus.bookhub.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import tur.oxus.bookhub.bo.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
