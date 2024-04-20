package poly.ex.pay1;

public abstract class PayStore {
    public static Pay givePayment(String payOption) {
        if (payOption.equals("kakao")) {
            return new KaKaoPay();
        } else if (payOption.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
