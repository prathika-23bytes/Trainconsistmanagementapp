import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    // Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    // Safety validation method
    public static boolean isSafetyCompliant(List<GoodsBogie> bogies) {
        return bogies.stream()
                .allMatch(b -> !b.type.equalsIgnoreCase("Cylindrical")
                        || b.cargo.equalsIgnoreCase("Petroleum"));
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("=== UC12 - Safety Compliance Check for Goods Bogies ===");
        System.out.println("========================================\n");

        // Create goods bogie list
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // Display bogies
        System.out.println("Goods Bogies:");
        for (GoodsBogie b : bogies) {
            System.out.println(b.type + " -> " + b.cargo);
        }

        // Safety check
        boolean safe = isSafetyCompliant(bogies);

        System.out.println("\nSafety Compliance Status: " + (safe ? "SAFE" : "UNSAFE"));

        System.out.println("\nUC12 safety validation completed...");
    }
}
