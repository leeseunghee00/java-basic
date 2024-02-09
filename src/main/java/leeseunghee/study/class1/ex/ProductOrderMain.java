package leeseunghee.study.class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {

        final ProductOrder[] productOrders = new ProductOrder[3];

        final ProductOrder po1 = new ProductOrder();

        po1.productName = "두부";
        po1.price = 2000;
        po1.quantity = 2;
        productOrders[0] = po1;

        final ProductOrder po2 = new ProductOrder();

        po2.productName = "김치";
        po2.price = 5000;
        po2.quantity = 1;
        productOrders[1] = po2;

        final ProductOrder po3 = new ProductOrder();

        po3.productName = "콜라";
        po3.price = 1500;
        po3.quantity = 2;
        productOrders[2] = po3;

        int totalAmount = 0;

        for (ProductOrder order : productOrders) {
            System.out.println("상품 이름: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            totalAmount += order.price * order.quantity;
        }

        System.out.println("총 가격: " + totalAmount);
    }
}
