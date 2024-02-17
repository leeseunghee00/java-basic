package leeseunghee.study.ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {

        final ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrders(orders);

        int totalAmount = getTotalAmount(orders);

        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(
            final String productName,
            final int price,
            final int quantity
    ) {
        final ProductOrder order = new ProductOrder();

        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(final ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품 이름: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(final ProductOrder[] orders) {
        int totalAmount = 0;

        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }

        return totalAmount;
    }
}
