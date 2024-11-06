package Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> originalMap = new HashMap<>();

        originalMap.put("Ion","IT");
        originalMap.put("Ana","HR");
        originalMap.put("Vasile","Manager");
        originalMap.put("Elena","IT");
        originalMap.put("Petru","SI");


        Stack<Map<String, String>> stack = new Stack<>();

        for (Map.Entry<String, String> entry : originalMap.entrySet()){
            Map<String,String> tempMap = new HashMap<>();
            tempMap.put(entry.getKey(),entry.getValue());
            stack.push(tempMap);

        }

        System.out.println("Map original "+originalMap);
        System.out.println("Stack copiat "+stack);
    }
}
