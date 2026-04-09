import java.util.*;

public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("====================================\n");

        // LinkedHashSet preserves insertion order and avoids duplicates
        Set<String> formation = new LinkedHashSet<>();

        // Add bogies (including duplicates)
        formation.add("BG101");
        formation.add("BG102");
        formation.add("BG103");
        formation.add("BG104");

        formation.add("BG102"); // duplicate
        formation.add("BG101"); // duplicate

        // Display final formation
        System.out.println("Final Train Formation (No duplicates, Ordered):");

        for (String bogie : formation) {
            System.out.println(bogie);
        }
    }
}