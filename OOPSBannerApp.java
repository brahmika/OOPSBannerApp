/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 *
 * This class extends Use Case 5 by introducing helper methods
 * to generate banner patterns for individual characters.
 * The banner lines are assembled by invoking these methods
 * during array initialization, improving abstraction,
 * reusability, and adherence to the DRY principle.
 *
 * @author Brahmika
 * @version 6.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Initialize banner lines by invoking helper methods
        String[] lines = {
                String.join("   ", getO(0), getO(0), getP(0), getS(0)),
                String.join("   ", getO(1), getO(1), getP(1), getS(1)),
                String.join("   ", getO(2), getO(2), getP(2), getS(2)),
                String.join("   ", getO(3), getO(3), getP(3), getS(3)),
                String.join("   ", getO(4), getO(4), getP(4), getS(4)),
                String.join("   ", getO(5), getO(5), getP(5), getS(5)),
                String.join("   ", getO(6), getO(6), getP(6), getS(6))
        };

        // Render the banner using enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }

    // Helper method to generate letter O pattern
    static String getO(int row) {
        String[] o = {
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        };
        return o[row];
    }

    // Helper method to generate letter P pattern
    static String getP(int row) {
        String[] p = {
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*    ",
                "*    ",
                "*    "
        };
        return p[row];
    }

    // Helper method to generate letter S pattern
    static String getS(int row) {
        String[] s = {
                "*****",
                "*    ",
                "*    ",
                "*****",
                "    *",
                "    *",
                "*****"
        };
        return s[row];
    }
}
