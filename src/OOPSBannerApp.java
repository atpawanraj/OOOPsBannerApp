public class OOPSBannerApp {

    // Method for letter O
    public static String[] getOPattern() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Method for letter P
    public static String[] getPPattern() {
        return new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };
    }

    // Method for letter S
    public static String[] getSPattern() {
        return new String[]{
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Loop through 7 rows
        for(int i = 0; i < 7; i++) {

            System.out.println(
                String.join(" ",
                    o[i],   // O
                    o[i],   // O again
                    p[i],   // P
                    s[i]    // S
                )
            );
        }
    }
}