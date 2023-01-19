public class DynamicCLI {
    public static void main(String[] args) {

        // if(args.length == 2) {
        //     int fnum = Integer.parseInt(args[0]);
        //     int snum = Integer.parseInt(args[1]);
        //     int result = fnum + snum;
        //     System.out.println("Result is : " + result);
        // }
        // else {
        //     System.out.println("Invalid Input...");
        // }

        int sum = 0;
        for(int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum is : " + sum);
    }
}
