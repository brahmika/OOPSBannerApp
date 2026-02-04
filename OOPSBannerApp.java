/**
 * OOPSBannerApp UC8 – OOPS Banner Application (Use Case 8)
 *
 * This class extends Use Case 7 by using the Java Collections Framework.
 * Character banner patterns are stored in a HashMap where each character
 * maps to its corresponding ASCII banner pattern.
 * The banner is dynamically assembled using nested loops and StringBuilder.
 *
 * @author Brahmika
 * @version 8.0
 */
import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Build character pattern map
        Map<Character, String[]> patternMap = buildCharacterPatternMap();

        // Message to render
        String message = "OOPS";

        // Render banner
        displayBanner(message, patternMap);
    }

    /**
     * Builds and returns a HashMap containing banner patterns
     * for supported characters.
     *
     * @return a map of characters to their banner patterns
     */
    static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        map.put('P', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*    ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                "*****",
                "*    ",
                "*    ",
                "*****",
                "    *",
                "    *",
                "*****"
        });

        return map;
    }

    /**
     * Displays the banner for a given message using
     * the provided character pattern map.
     *
     * @param message the message to display as a banner
     * @param patternMap the character-to-pattern map
     */
    static void displayBanner(String message, Map<Character, String[]> patternMap) {

        // Outer loop iterates through banner rows
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            // Inner loop iterates through characters of the message
            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);

                String[] pattern = patternMap.get(ch);
                lineBuilder.append(pattern[row]);

                if (i < message.length() - 1) {
                    lineBuilder.append("   ");
                }
            }

            System.out.println(lineBuilder);
        }
    }
}
