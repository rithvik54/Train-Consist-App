import java.util.*;

public class UseCase15TrainConsistMgmt {

    // ----- CUSTOM RUNTIME EXCEPTION -----
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ----- GOODS BOGIE MODEL -----
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("====================================\n");

        List<GoodsBogie> goodsList = new ArrayList<>();

        try {
            // Safe cargo
            goodsList.add(assignCargo("Open", "Coal"));

            // Unsafe cargo (will throw exception)
            goodsList.add(assignCargo("Closed", "Explosives"));

            // This may not execute if exception occurs above
            goodsList.add(assignCargo("Tank", "Oil"));

        } catch (CargoSafetyException e) {
            System.out.println("Safety Error: " + e.getMessage());
        } finally {
            System.out.println("\nProcess completed (finally block executed)");
        }

        // Display safe assignments
        System.out.println("\nAssigned Goods Bogies:");
        for (GoodsBogie g : goodsList) {
            System.out.println(g.type + " -> " + g.cargo);
        }
    }

    // ----- VALIDATION METHOD -----
    public static GoodsBogie assignCargo(String type, String cargo) {

        // Rule: Explosives not allowed in Closed bogie
        if (type.equalsIgnoreCase("Closed") && cargo.equalsIgnoreCase("Explosives")) {
            throw new CargoSafetyException(
                    "Explosives cannot be assigned to Closed bogie!"
            );
        }

        return new GoodsBogie(type, cargo);
    }
}
}