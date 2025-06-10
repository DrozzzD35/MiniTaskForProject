package stage_1.task_27;

public class Main {
    public static void main(String[] args) throws DivisionByZeroException {
        System.out.println(divide(123, 5));
        System.out.println(divide(123, 3));
        System.out.println(divide(123, 0));
    }


    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Ошибка. Деление на ноль не допускается");
        }
        return a / b;

    }

}
