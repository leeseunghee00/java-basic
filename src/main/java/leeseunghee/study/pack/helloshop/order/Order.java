package leeseunghee.study.pack.helloshop.order;

import leeseunghee.study.pack.helloshop.product.Product;
import leeseunghee.study.pack.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
