package Task2;

import java.util.*;

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

        System.out.println("Map original "+originalMap);
        System.out.println("Deque copiat "+deque);
    }
}
