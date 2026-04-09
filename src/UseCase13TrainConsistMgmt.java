import java.util.*;
import java.util.stream.*;

public class UseCase13TrainConsistMgmt {

    // Bogie model
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("====================================\n");

        // Create large dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Type" + i, i % 100));
        }

        // -------- LOOP APPROACH --------
        long startLoop = System.nanoTime();

        int totalCapacityLoop = 0;
        for (Bogie b : bogies) {
            totalCapacityLoop += b.capacity;
        }

        long endLoop = System.nanoTime();

        // -------- STREAM APPROACH --------
        long startStream = System.nanoTime();

        int totalCapacityStream = bogies.stream()
                .mapToInt(b -> b.capacity)
                .sum();

        long endStream = System.nanoTime();

        // Results
        System.out.println("Total Capacity (Loop): " + totalCapacityLoop);
        System.out.println("Total Capacity (Stream): " + totalCapacityStream);

        System.out.println("\nExecution Time:");
        System.out.println("Loop Time: " + (endLoop - startLoop) + " ns");
        System.out.println("Stream Time: " + (endStream - startStream) + " ns");
    }
}