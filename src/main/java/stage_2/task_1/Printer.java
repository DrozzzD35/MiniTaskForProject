package stage_2.task_1;

public interface Printer {
    void print(String s);

    default void println(String s) {
        print(s + " \n");
    }


}
