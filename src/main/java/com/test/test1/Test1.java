package com.test.test1;

import com.test.test1.entity.Cart;
import com.test.test1.entity.CartItem;
import com.test.test1.repo.CartRepo;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Test1 {
    private final CartRepo cartRepo;

    public Test1(CartRepo cartRepo) {
        this.cartRepo = cartRepo;
    }

    @PostConstruct
    void test() {
        Cart cart = new Cart();
        CartItem cartItem = new CartItem();

        List<CartItem> cartItems = new ArrayList<>();
        cartItems.add(cartItem);
        cartItems.add(new CartItem());

        cart.setCartItems(cartItems);
        cartRepo.save(cart);
        Cart cart1 = cartRepo.findById(cart.getId()).get();
        System.out.println("cart to save: " + cart.getCartItems().get(0).getCart());
        System.out.println("cart to save: " + cart.getCartItems().get(1).getCart());
        System.out.println("cart from DB: " + cart1.getCartItems().get(0).getCart());
        System.out.println("cart from DB: " + cart1.getCartItems().get(1).getCart());
    }
}
