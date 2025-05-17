package stage_1.task_21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fruits {
    Map<String, Integer> map = new HashMap<>();


    public void addMap(String string, Integer integer) {
        map.put(string, integer);
    }

    public List<String> getKeyMap() {
        return new ArrayList<>(map.keySet());
    }

    public List<Integer> getValueMap() {
        return new ArrayList<>(map.values());
    }

    public void printEntrySetMap(){
        System.out.println(map.entrySet());
    }

    public void printKeyList() {
        for (String element : getKeyMap()) {
            System.out.println("key - " + element);
        }
        System.out.println();
    }

    public void printValueList() {
        for (Integer element : getValueMap()) {
            System.out.println("value - " + element);
        }
        System.out.println();
    }

}
