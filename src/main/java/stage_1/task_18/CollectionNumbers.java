package stage_1.task_18;

import java.util.*;

public class CollectionNumbers {
    private List<Integer> randomNumbers = new ArrayList<>();


    public void addRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomNumbers.add(random.nextInt());
        }
    }


    public void sortRandomNumbers() {
        Collections.sort(randomNumbers);
    }

    public void removeNotEvenNumberByRandomNumbers() {
        randomNumbers.removeIf(element -> (!(element % 2 == 0)));
    }

    public void printRandomNumbers() {
        for (Integer element : randomNumbers) {
            System.out.println(element);
        }
        System.out.println();
    }


}
