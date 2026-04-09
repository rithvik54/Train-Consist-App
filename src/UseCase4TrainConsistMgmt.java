import java.util.*;

public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("====================================\n");

        // Create a LinkedList
        List<String> trainConsist = new LinkedList<>();

        // Add bogies in sequence
        trainConsist.add("BG101");
        trainConsist.add("BG102");
        trainConsist.add("BG103");

        System.out.println("Initial Train Consist: " + trainConsist);

        // Insert bogie at specific position
        trainConsist.add(1, "BG150"); // insert at index 1
        System.out.println("After inserting BG150 at position 1: " + trainConsist);

        // Remove bogie from front
        trainConsist.remove(0);
        System.out.println("After removing front bogie: " + trainConsist);

        // Remove bogie from rear
        trainConsist.remove(trainConsist.size() - 1);
        System.out.println("After removing last bogie: " + trainConsist);

        // Final structure
        System.out.println("\nFinal Train Structure:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}