/**
 * OOPSBannerApp UC7 – OOPS Banner Application (Use Case 7)
 *
 * This class extends Use Case 6 by introducing an inner static class
 * to encapsulate a character and its corresponding banner pattern.
 * The banner is rendered by retrieving pattern data from stored mappings,
 * improving encapsulation, abstraction, and object-oriented design.
 *
 * @author Brahmika
 * @version 7.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create CharacterPatternMap objects for O, P, and S
        CharacterPatternMap oPattern = new CharacterPatternMap(
                'O',
                new String[]{
                        "*****",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*****"
                }
        );

        CharacterPatternMap pPattern = new CharacterPatternMap(
                'P',
                new String[]{
                        "*****",
                        "*   *",
                        "*   *",
                        "*****",
                        "*    ",
                        "*    ",
                        "*    "
                }
        );

        CharacterPatternMap sPattern = new CharacterPatternMap(
                'S',
                new String[]{
                        "*****",
                        "*    ",
                        "*    ",
                        "*****",
                        "    *",
                        "    *",
                        "*****"
                }
        );

        // Store patterns in an array of objects
        CharacterPatternMap[] patterns = {
                oPattern, oPattern, pPattern, sPattern
        };

        // Build banner lines using StringBuilder
        String[] bannerLines = new String[7];

        for (int row = 0; row < 7; row++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (int i = 0; i < patterns.length; i++) {
                lineBuilder.append(patterns[i].getPattern()[row]);

                if (i < patterns.length - 1) {
                    lineBuilder.append("   ");
                }
            }
            bannerLines[row] = lineBuilder.toString();
        }

        // Render the banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * Inner static class that encapsulates a character
     * and its corresponding banner pattern.
     */
    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructs a CharacterPatternMap object.
         *
         * @param character the character to be represented
         * @param pattern   the 7-line banner pattern for the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character represented by this object.
         *
         * @return the character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the banner pattern for the character.
         *
         * @return an array of strings representing the pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }
}
