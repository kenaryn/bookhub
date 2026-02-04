package tur.oxus.bookhub.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import tur.oxus.bookhub.bo.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
