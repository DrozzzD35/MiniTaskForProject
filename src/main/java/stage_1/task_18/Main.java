package stage_1.task_18;

public class Main {
    public static void main(String[] args) {
        CollectionNumbers collectionNumbers = new CollectionNumbers();

        collectionNumbers.addRandomNumbers();
        collectionNumbers.printRandomNumbers();
        collectionNumbers.sortRandomNumbers();
        collectionNumbers.removeNotEvenNumberByRandomNumbers();
        System.out.println("После удаления нечётных чисел");
        collectionNumbers.printRandomNumbers();


    }
}
