package com.eommerce.ecommercespringreact.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name="review")
public class Review {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="author")
    private String author;
    @Column(name="message")
    private String message;
    @Column(name="rating")
    private Integer rating;
    @Column(name="date")
    private LocalDate date;

}
