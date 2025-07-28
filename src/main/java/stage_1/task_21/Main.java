package stage_1.task_21;

public class Main {
    public static void main(String[] args) {
        Fruits fruits = new Fruits();

        fruits.addMap("Яблоки", 5);
        fruits.addMap("Киви", 16);
        fruits.addMap("Бананы", 12);
        fruits.addMap("Груши", 7);
        fruits.addMap("Мандарины", 11);
        fruits.addMap("Апельсины", 18);

        fruits.printKeyList();
        fruits.printValueList();
        fruits.printEntrySetMap();


    }
}
