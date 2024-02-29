package leeseunghee.study.pack.helloshop.order;

import leeseunghee.study.pack.helloshop.product.Product;
import leeseunghee.study.pack.helloshop.user.User;

public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
