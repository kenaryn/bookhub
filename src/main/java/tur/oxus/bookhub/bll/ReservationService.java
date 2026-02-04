package tur.oxus.bookhub.bll;

import tur.oxus.bookhub.bo.Reservation;

import java.util.List;

public interface ReservationService {
    void addReservation(Reservation reservation);
    List<Reservation> loadAllReservations();
    void updateReservation(long reservationId);
    void removeReservation(long reservationId);
}
