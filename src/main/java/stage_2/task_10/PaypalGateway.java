package stage_2.task_10;

public class PaypalGateway implements PaymentGateway{
    @Override
    public void welcome() {
        System.out.println("Приветствую");
    }
}
