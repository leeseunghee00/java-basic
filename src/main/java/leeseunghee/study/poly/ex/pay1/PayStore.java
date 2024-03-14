package leeseunghee.study.poly.ex.pay1;

public abstract class PayStore implements Pay{

    public static Pay findPayOption(final String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("newPay")) {
            return new NewPay();
        } else {
            return new DefaultPay();
        }
    }
}
