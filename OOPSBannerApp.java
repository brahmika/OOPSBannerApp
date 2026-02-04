/**
 * OOPSBannerApp UC5 – OOPS Banner Application (Use Case 5)
 *
 * This class extends Use Case 4 by declaring and initializing the banner
 * lines in a single statement using inline array initialization.
 * The String.join() method is used directly inside the array initializer
 * to reduce verbosity while maintaining clarity and alignment.
 *
 * @author Developer
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize the String array in a single statement
        String[] lines = {
                String.join("   ", "*****", "*****", "*****", "*****"),
                String.join("   ", "*   *", "*   *", "*   *", "*    "),
                String.join("   ", "*   *", "*   *", "*   *", "*    "),
                String.join("   ", "*   *", "*   *", "*****", "*****"),
                String.join("   ", "*   *", "*   *", "*    ", "    *"),
                String.join("   ", "*   *", "*   *", "*    ", "    *"),
                String.join("   ", "*****", "*****", "*    ", "*****")
        };

        // Use a for-each loop to iterate through the array and print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
