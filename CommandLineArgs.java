public class CommandLineArgs {
    public static void main(String[] args) {
        // String firstName = args[0];
        // String lastName = args[1];
        // String fullName = firstName + " " + lastName;
        // System.out.println("Welcome " + fullName);

        // Type casting
        // Wrapper Class - Integer, Long, Byte
        int fnum = Integer.parseInt(args[0]);
        int snum = Integer.parseInt(args[1]);
        int result = fnum + snum;
        System.out.println("Result is : " + result);

    }
}
