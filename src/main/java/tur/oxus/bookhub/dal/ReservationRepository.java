package tur.oxus.bookhub.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import tur.oxus.bookhub.bo.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
