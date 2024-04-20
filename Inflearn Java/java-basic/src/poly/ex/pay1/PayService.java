package poly.ex.pay1;

public class PayService {

    public void processPay(String payOption, int amount) {
        Pay pay = PayStore.givePayment(payOption);
        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
