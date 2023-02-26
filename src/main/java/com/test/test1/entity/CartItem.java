package com.test.test1.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(exclude = {"cart"})

//@ToString
@Entity
public class CartItem {
    @Id
    @GeneratedValue
    UUID idI;
    String name;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "cart_id", insertable = false, updatable = false)
    Cart cart;
}
