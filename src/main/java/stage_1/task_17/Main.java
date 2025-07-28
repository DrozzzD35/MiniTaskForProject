package stage_1.task_17;

public class Main {
    public static void main(String[] args) {
        CollectionNumbers collectionNumbers = new CollectionNumbers();

        collectionNumbers.addNumbers();
        collectionNumbers.addRandomNumbers();

        System.out.println("До сортировки:");
        collectionNumbers.printRandomNumbers();
        collectionNumbers.sortRandomNumbers();
        System.out.println("После сортировки:");
        collectionNumbers.printRandomNumbers();


    }
}
