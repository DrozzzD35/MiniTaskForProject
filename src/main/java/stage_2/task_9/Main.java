package stage_2.task_9;

public class Main {
    public static void main(String[] args) {
        SimplePrinter simplePrinter = new SimplePrinter();
        SmartPrinter smartPrinter = new SmartPrinter();

        simplePrinter.print("реализую класс SimplePrinter");
        System.out.println();
        smartPrinter.scan("строка scan");
        smartPrinter.print("строка print");


    }
}
