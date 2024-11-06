package Task4;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Map<String, String> originalMap = new HashMap<>();

        originalMap.put("Ion","IT");
        originalMap.put("Ana","HR");
        originalMap.put("Vasile","Manager");
        originalMap.put("Elena","IT");
        originalMap.put("Petru","SI");


        Queue<Map<String, String>> deque = new ArrayDeque<>();

        for (Map.Entry<String, String> entry : originalMap.entrySet()){
            Map<String,String> tempMap = new HashMap<>();
            tempMap.put(entry.getKey(),entry.getValue());
            deque.offer(tempMap);

        }
        Map<String, String> copyMap = new HashMap<>();

        for (Map<String, String> map : deque){
            for (Map.Entry<String, String> entry : map.entrySet()) {
                copyMap.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println("Map original "+originalMap);
        System.out.println("Deque copiat din Map "+deque);
        System.out.println("Map copiat din  Deque "+copyMap);




    }
}
