import java.util.*;

public class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("====================================\n");

        // HashMap stores key -> value pairs
        Map<String, Integer> capacityMap = new HashMap<>();

        // Insert bogie capacities
        capacityMap.put("BG101", 72);
        capacityMap.put("BG102", 64);
        capacityMap.put("BG103", 80);
        capacityMap.put("BG104", 60);

        // Display all bogie capacities
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie ID: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Example lookup
        System.out.println("\nCapacity of BG102: " + capacityMap.get("BG102"));
    }
}