package tur.oxus.bookhub.bll;

import tur.oxus.bookhub.bo.Review;

import java.util.List;

public interface ReviewService {
    void addReview(Review review);
    List<Review> loadAllReviews();
    void updateReview(long reviewId);
    void removeReview(long reviewId);
}
