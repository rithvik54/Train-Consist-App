import java.util.*;

public class UseCase16TrainConsistMgmt {

    // Passenger Bogie model
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
        System.out.println("UC16 - Sort Bogies using Bubble Sort");
        System.out.println("====================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("BG101", 72));
        bogies.add(new Bogie("BG102", 50));
        bogies.add(new Bogie("BG103", 80));
        bogies.add(new Bogie("BG104", 60));

        // Display before sorting
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // ----- BUBBLE SORT -----
        int n = bogies.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (bogies.get(j).capacity > bogies.get(j + 1).capacity) {
                    // swap
                    Bogie temp = bogies.get(j);
                    bogies.set(j, bogies.get(j + 1));
                    bogies.set(j + 1, temp);
                }
            }
        }

        // Display after sorting
        System.out.println("\nAfter Sorting (Ascending by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
    }
}