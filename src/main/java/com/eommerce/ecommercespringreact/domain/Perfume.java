package com.eommerce.ecommercespringreact.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
    @Table(name = "perfume")
    @Getter
    @Setter
    public class Perfume {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @SequenceGenerator(name = "perfume_id_seq", sequenceName = "perfume_id_seq", initialValue = 109, allocationSize = 1)
        @Column(name="id")
        private Long id;
        @Column(name="perfume_title")
        private String perfumeTitle;
        @Column(name="perfumer")
        private String perfumer;
        @Column(name="year")
        private Integer year;
        @Column(name="country")
        private String country;
        @Column(name="perfume_gender")
        private String perfumeGender;
        @Column(name="fragrance_top_notes")
        private String fragranceTopNotes;
        @Column(name="fragrance_middle_notes")
        private String fragranceMiddleNotes;
        @Column(name="fragrance_base_notes")
        private String fragranceBaseNotes;
        @Column(name="description")
        private String description;
        @Column(name="filename")
        private String filename;
        @Column(name="price")
        private Integer price;
        @Column(name="volume")
        private String volume;
        @Column(name="type")
        private String type;
        @Column(name="perfume_rating")
        private Double perfumeRating;

        @OneToMany
        private List<Review> reviews;
    }

