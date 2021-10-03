package com.eommerce.ecommercespringreact.domain;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_item_seq")
    @SequenceGenerator(name = "order_item_seq", sequenceName = "order_item_seq", initialValue = 12, allocationSize = 1)
    @Column(name="id")
    private Long id;
    @Column(name="amount")
    private Long amount;
    @Column(name="quantity")
    private Long quantity;

    @OneToOne
    @JoinColumn(name="perfume_id")
    private Perfume perfume;

    @ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="order_id")
    private  Order order;
}
