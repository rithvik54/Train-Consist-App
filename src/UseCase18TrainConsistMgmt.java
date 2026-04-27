public class UseCase18TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC18 - Search Bogie ID (Linear Search)");
        System.out.println("====================================\n");

        // Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Bogie ID to search
        String searchId = "BG309";

        // Display all bogies
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // ----- LINEAR SEARCH -----
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("\nBogie ID " + searchId + " FOUND");
        } else {
            System.out.println("\nBogie ID " + searchId + " NOT FOUND");
        }
    }
}