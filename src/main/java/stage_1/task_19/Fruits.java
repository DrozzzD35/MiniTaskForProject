package stage_1.task_19;

import java.util.HashMap;
import java.util.Map;

public class Fruits {
    private Map<String, Integer> map = new HashMap<>();


    public void addMap(String string, Integer integer) {
        map.put(string, integer);
    }

    public void printMap() {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " шт");
        }
    }

}
