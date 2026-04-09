import java.util.*;
import java.util.stream.*;

public class UseCase10TrainConsistMgmt {

    // Reusing Bogie model
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC10 - Aggregate Capacity Using reduce()");
        System.out.println("====================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Display bogies
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " | Capacity: " + b.capacity);
        }

        // Aggregate total capacity using reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)     // extract capacity
                .reduce(0, (a, b) -> a + b); // sum all

        System.out.println("\nTotal Train Capacity: " + totalCapacity);
    }
}