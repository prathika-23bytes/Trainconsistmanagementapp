import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistManagementApp {

    // Regex patterns
    public static final String TRAIN_ID_REGEX = "TRN-\\d{4}";
    public static final String CARGO_CODE_REGEX = "PET-[A-Z]{2}";

    // Validate Train ID
    public static boolean isValidTrainID(String trainId) {
        Pattern pattern = Pattern.compile(TRAIN_ID_REGEX);
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    // Validate Cargo Code
    public static boolean isValidCargoCode(String cargoCode) {
        Pattern pattern = Pattern.compile(CARGO_CODE_REGEX);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("=== UC11 - Validate Train ID & Cargo Codes ===");
        System.out.println("========================================\n");

        // Sample inputs
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Validate Train ID
        System.out.println("Train ID: " + trainId);
        if (isValidTrainID(trainId)) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        // Validate Cargo Code
        System.out.println("\nCargo Code: " + cargoCode);
        if (isValidCargoCode(cargoCode)) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        System.out.println("\nUC11 validation completed...");
    }
}