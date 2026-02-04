package tur.oxus.bookhub.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import tur.oxus.bookhub.bo.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
