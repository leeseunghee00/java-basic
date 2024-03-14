package leeseunghee.study.poly.ex.pay1;

public class PayService {

    public void processPay(final String option, final int amount) {

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        final Pay pay = PayStore.findPayOption(option);

        if (pay.pay(amount)) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
