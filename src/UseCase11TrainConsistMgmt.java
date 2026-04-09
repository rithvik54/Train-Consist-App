import java.util.*;
import java.util.regex.*;

public class UseCase11TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC11 - Validate Train ID & Cargo Code");
        System.out.println("====================================\n");

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "[A-Z]{3}-[A-Z]{2}";

        // Validate inputs
        boolean isTrainValid = Pattern.matches(trainPattern, trainId);
        boolean isCargoValid = Pattern.matches(cargoPattern, cargoCode);

        // Display results
        if (isTrainValid && isCargoValid) {
            System.out.println("\n✅ Valid Input!");
        } else {
            System.out.println("\n❌ Invalid Input!");

            if (!isTrainValid) {
                System.out.println("Invalid Train ID format!");
            }

            if (!isCargoValid) {
                System.out.println("Invalid Cargo Code format!");
            }
        }

        scanner.close();
    }
}