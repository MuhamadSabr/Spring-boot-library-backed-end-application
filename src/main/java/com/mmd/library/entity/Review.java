package com.mmd.library.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "review")
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "user_email")
    String userEmail;

    @Column(name = "review_date")
    LocalDate reviewDate;

    double rating;

    @Column(name = "book_id")
    Long bookId;

    @Column(name = "review_description")
    String reviewDescription;

    public Review() {}

    public Review(String userEmail, LocalDate reviewDate, double rating, Long bookId, String reviewDescription) {
        this.userEmail = userEmail;
        this.reviewDate = reviewDate;
        this.rating = rating;
        this.bookId = bookId;
        this.reviewDescription = reviewDescription;
    }
}
