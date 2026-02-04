package tur.oxus.bookhub.bll;

import tur.oxus.bookhub.bo.Loan;

import java.util.List;

public interface LoanService {
    void addLoan(Loan loan);
    List<Loan> loadAllLoans();
    void update(long loanId);
    void removeLoan(long loanId);
}
