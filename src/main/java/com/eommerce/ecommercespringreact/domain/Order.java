package com.eommerce.ecommercespringreact.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orders_seq")
    @SequenceGenerator(name = "orders_seq", sequenceName = "orders_seq", initialValue = 6, allocationSize = 1)
    @Column(name="id")
    private Long id;
    @Column(name="total_price")
    private Double totalPrice;
    @Column(name="date")
    private LocalDate date;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="city")
    private String city;
    @Column(name="address")
    private String address;
    @Column(name="email")
    private String email;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="post_index")
    private Integer postIndex;

    @OneToMany(mappedBy ="order" ,fetch = FetchType.EAGER,cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<OrderItem> orderItems;

    public Order() {
        this.date = LocalDate.now();
        this.orderItems = new ArrayList<>();
    }
}
