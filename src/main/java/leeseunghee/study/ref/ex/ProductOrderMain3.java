package leeseunghee.study.ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력해 주세요: ");

        final int num = scanner.nextInt();
        scanner.nextLine();

        final ProductOrder[] orders = new ProductOrder[num];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i+1) + "번째 주분 정보를 입력하세요.");

            System.out.print("상품 이름: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();     // 입력 버퍼를 지우기 위함

            orders[i] = createOrder(productName, price, quantity);
        }

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
