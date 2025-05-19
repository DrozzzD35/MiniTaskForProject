package stage_1.task_27;

public class Main {
    public static void main(String[] args) {
        divide(123, 0);
    }


    public static void divide(int a, int b) throws ArithmeticException {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException ex) {
            System.out.println("Ошибка. Деление на 0 невозможно");
        }
        System.out.println("Продолжение программы");

    }

}
