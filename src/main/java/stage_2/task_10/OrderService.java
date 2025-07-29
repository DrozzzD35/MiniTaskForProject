package stage_2.task_10;

public class OrderService {
    private PaymentGateway gateway;

    public OrderService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void getHi(){
        gateway.welcome();
    }
}
