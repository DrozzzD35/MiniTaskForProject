package stage_1.task_17;

import java.util.*;

public class CollectionNumbers {
    private Integer[] number;
    private List<Integer> randomNumbers;

    public void addNumbers() {
        number = new Integer[20];
        Random random = new Random();
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt();
        }
    }

    public void addRandomNumbers() {
        randomNumbers = Arrays.asList(number);
    }

    public void sortRandomNumbers() {
        Collections.sort(randomNumbers);
    }

    public void printRandomNumbers() {
        for (Integer element : randomNumbers) {
            System.out.println(element);
        }
        System.out.println();
    }


}
