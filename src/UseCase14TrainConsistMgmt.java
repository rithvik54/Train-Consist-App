import java.util.*;

public class UseCase14TrainConsistMgmt {

    // ----- CUSTOM EXCEPTION -----
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Passenger Bogie model with validation
    static class PassengerBogie {
        String name;
        int capacity;

        PassengerBogie(String name, int capacity) throws InvalidCapacityException {

            if (capacity <= 0) {
                throw new InvalidCapacityException(
                        "Invalid capacity for " + name + " (must be > 0)"
                );
            }

            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC14 - Custom Exception for Capacity Validation");
        System.out.println("====================================\n");

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            bogies.add(new PassengerBogie("BG101", 72));
            bogies.add(new PassengerBogie("BG102", 0));   // invalid
            bogies.add(new PassengerBogie("BG103", 80));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nValid Bogies:");

        for (PassengerBogie b : bogies) {
            System.out.println(b.name + " | Capacity: " + b.capacity);
        }
    }
}