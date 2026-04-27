import java.util.*;

public class UseCase17TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC17 - Sort Bogie Names using Arrays.sort()");
        System.out.println("====================================\n");

        // Create array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "AC 3 Tier"
        };

        // Display before sorting
        System.out.println("Before Sorting:");
        for (String name : bogieNames) {
            System.out.println(name);
        }

        // Sort using built-in method
        Arrays.sort(bogieNames);

        // Display after sorting
        System.out.println("\nAfter Sorting (Alphabetical Order):");
        for (String name : bogieNames) {
            System.out.println(name);
        }
    }
}
