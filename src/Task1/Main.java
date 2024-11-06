package Task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> originalMap = new HashMap<>();

        originalMap.put("Ion","IT");
        originalMap.put("Ana","HR");
        originalMap.put("Vasile","Manager");
        originalMap.put("Elena","IT");
        originalMap.put("Petru","SI");

        Map<String, String> copyMap = new HashMap<>();
        for (Map.Entry<String,String> map : originalMap.entrySet()){
            copyMap.put(map.getKey(), map.getValue());

        }

        System.out.println("Map original "+originalMap);
        System.out.println("Map copiat "+copyMap);

    }
}
