/**
 * OOPSBannerApp UC4 – OOPS Banner Application (Use Case 4)
 *
 * This class extends the functionality of Use Case 3 by rendering the banner
 * using a String array and a loop. This approach improves modularity and
 * prepares the code for further refactoring.
 *
 * @author Developer
 * @version 4.0
 */

// Hint:
// 1. Define a String array with a size equal to the number of lines in the banner
// 2. Populate each index of the array with the corresponding banner line using String.join()
// 3. Use a for-each loop to iterate through the array and print each line

public class OOPSBannerApp {

    public static void main(String[] args) {
        // Define a String array with a size equal to the number of lines in the banner
        String[] lines = new String[7];

        // Populate each index of the array with the corresponding banner line using String.join()
        lines[0] = String.join("   ", "*****", "*****", "*****", "*****");
        lines[1] = String.join("   ", "*   *", "*   *", "*   *", "*    ");
        lines[2] = String.join("   ", "*   *", "*   *", "*   *", "*    ");
        lines[3] = String.join("   ", "*   *", "*   *", "*****", "*****");
        lines[4] = String.join("   ", "*   *", "*   *", "*    ", "    *");
        lines[5] = String.join("   ", "*   *", "*   *", "*    ", "    *");
        lines[6] = String.join("   ", "*****", "*****", "*    ", "*****");

        // Use a for-each loop to iterate through the array and print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
