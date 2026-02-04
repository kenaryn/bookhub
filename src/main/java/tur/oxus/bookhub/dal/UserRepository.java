package tur.oxus.bookhub.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import tur.oxus.bookhub.bo.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
