package stage_2.task_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        double startTimeArrayList = System.nanoTime();
        for (int i = 0; i <= 10000; i++) {
            arrayList.addFirst(i);
        }
        double endTimeArrayList = System.nanoTime();
        double resultArrayList = endTimeArrayList - startTimeArrayList;
        System.out.println("ArrayList записывает 10 тыс элементов за " + resultArrayList);


        double startTimeLinkedList = System.nanoTime();
        for (int i = 0; i <= 10000; i++) {
            linkedList.addFirst(i);
        }
        double endTimeLinkedList = System.nanoTime();
        double resultLinkedList = endTimeLinkedList - startTimeLinkedList;
        System.out.println("LinkedList записывает 10 тыс элементов за " + resultLinkedList);


    }
}
