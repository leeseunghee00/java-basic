package leeseunghee.study.poly.ex.pay1;

public class PayMain1 {

    public static void main(String[] args) {

        final PayService payService = new PayService();

        // kakao 결제
        final String payOption1 = "kakao";
        final int amount1 = 5000;

        payService.processPay(payOption1, amount1);

        // naver 결제
        final String payOption2 = "naver";
        final int amount2 = 10000;

        payService.processPay(payOption2, amount2);

        // 잘못된 결제 수단 선택
        final String payOption3 = "bad";
        final int amount3 = 15000;

        payService.processPay(payOption3, amount3);

        // newPay 결제
        final String payOption4 = "newPay";
        final int amount4 = 20000;

        payService.processPay(payOption4, amount4);
    }
}
