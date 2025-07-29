package stage_2.task_10;

public class Main {
    public static void main(String[] args) {

        OrderService orderService = new OrderService(new PaypalGateway());
        orderService.getHi();
        

    }
}
