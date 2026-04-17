public class OOPSBannerApp {

    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPattern getCharacterPattern(char ch) {

        if (ch == 'O') {
            return new CharacterPattern('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            });
        }

        if (ch == 'P') {
            return new CharacterPattern('P', new String[]{
                    "****** ",
                    "*     *",
                    "*     *",
                    "****** ",
                    "*      ",
                    "*      ",
                    "*      "
            });
        }

        return new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }

    public static void printBanner(String word) {

        CharacterPattern[] letters = new CharacterPattern[word.length()];

        for (int i = 0; i < word.length(); i++) {
            letters[i] = getCharacterPattern(word.charAt(i));
        }

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < letters.length; i++) {
                line.append(letters[i].getPattern()[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        printBanner("OOPS");
    }
}