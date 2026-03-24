import java.util.*;

public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        // Display Welcome banner
        System.out.println("====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================\n");

        // Create dynamic list to store bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist info
        System.out.println("Train initialized successfully...");
        System.out.println("Number of bogies: " + trainConsist.size());

        // Display current state
        System.out.println("Current train consist: " + trainConsist);
    }
}