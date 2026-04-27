public class UseCase20TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC20 - Defensive Search Validation");
        System.out.println("====================================\n");

        // Create bogie array (empty scenario)
        String[] bogieIds = {};

        // Search key
        String searchId = "BG101";

        try {
            // ----- FAIL-FAST VALIDATION -----
            if (bogieIds.length == 0) {
                throw new RuntimeException("No bogies available to search!");
            }

            // ----- SEARCH LOGIC -----
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }

            // Display result
            if (found) {
                System.out.println("Bogie ID " + searchId + " FOUND");
            } else {
                System.out.println("Bogie ID " + searchId + " NOT FOUND");
            }

        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }
}
