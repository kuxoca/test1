package com.test.test1.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
@Entity
@EqualsAndHashCode(exclude = {"cartItems"})
public class Cart {
    @Id
    @GeneratedValue
    UUID id;
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "cart_id")
    List<CartItem> cartItems;


}
