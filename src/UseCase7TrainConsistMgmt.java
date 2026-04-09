import java.util.*;

public class UseCase7TrainConsistMgmt {

    // Inner Bogie class
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
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("====================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("BG101", 72));
        bogies.add(new Bogie("BG102", 64));
        bogies.add(new Bogie("BG103", 80));
        bogies.add(new Bogie("BG104", 60));

        // Sort using Comparator (ascending order)
        bogies.sort(new Comparator<Bogie>() {
            @Override
            public int compare(Bogie b1, Bogie b2) {
                return b1.capacity - b2.capacity;
            }
        });

        // Display sorted bogies
        System.out.println("Bogies sorted by capacity:\n");

        for (Bogie b : bogies) {
            System.out.println("Bogie: " + b.name + " | Capacity: " + b.capacity);
        }
    }
}