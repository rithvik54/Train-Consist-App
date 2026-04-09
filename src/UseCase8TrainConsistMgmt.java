import java.util.*;
import java.util.stream.*;

public class UseCase8TrainConsistMgmt {

    // Reusing Bogie model from UC7
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
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("====================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("BG101", 72));
        bogies.add(new Bogie("BG102", 64));
        bogies.add(new Bogie("BG103", 80));
        bogies.add(new Bogie("BG104", 60));

        // Filter bogies with capacity >= 70
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity >= 70)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("Bogies with capacity >= 70:\n");

        for (Bogie b : filteredBogies) {
            System.out.println("Bogie: " + b.name + " | Capacity: " + b.capacity);
        }
    }
}