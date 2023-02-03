public class Pattern {
    public static void main(String[] args) {
        final int NUMBER_OF_LINES = 7;
        for(int line = 1; line<=NUMBER_OF_LINES; line++){
            // print star
            for(int star = 1; star<=NUMBER_OF_LINES; star++){
                System.out.print("*");
            }
            // New Line Print
            System.out.println();
        }

    }
}
