import java.util.*;

public class UseCase12TrainConsistMgmt {

    // Goods Bogie model
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
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("====================================\n");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Closed", "Food"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Closed", "Chemicals"));
        goodsBogies.add(new GoodsBogie("Open", "Petrol"));

        // Safety rules:
        // Chemicals & Petrol must be in Closed type

        System.out.println("Checking Safety Compliance:\n");

        for (GoodsBogie g : goodsBogies) {

            boolean isSafe = true;

            if ((g.cargo.equalsIgnoreCase("Chemicals") ||
                    g.cargo.equalsIgnoreCase("Petrol")) &&
                    !g.type.equalsIgnoreCase("Closed")) {

                isSafe = false;
            }

            // Display result
            System.out.println("Type: " + g.type +
                    " | Cargo: " + g.cargo +
                    " | Status: " + (isSafe ? "SAFE ✅" : "NOT SAFE ❌"));
        }
    }
}