package stage_2.task_1;

public class ConsolePrinter implements Printer {

    @Override
    public void print(String s) {
        System.out.println("реализация метода print");
    }

    @Override
    public void println(String s) {
        Printer.super.println(s);
    }
}
