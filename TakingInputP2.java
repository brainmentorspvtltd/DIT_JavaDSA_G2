import java.util.Scanner;

public class TakingInputP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your ID : ");
        int id = scanner.nextInt();

        // this line will eat the \n from scanner before
        scanner.nextLine();

        System.out.println("Enter your name : ");
        // scanner.nextLine() - takes input in String type of data
        // it reads input till \n
        String name = scanner.nextLine();
        
        // scanner.next() - takes input in String type of data
        // it will read input before space
        // String name = scanner.next();

        // convert name into proper case
        // get first character
        char firstLetter = name.charAt(0);
        // type case character data type into String
        String firstChar = String.valueOf(firstLetter);
        firstChar = firstChar.toUpperCase();

        // Now we convert the remaining name into lower case and append that 
        // with first character
        name = firstChar + name.substring(1).toLowerCase();


        System.out.println("Enter your age : ");
        byte age = scanner.nextByte();

        System.out.println("Welcome : " + name);
        System.out.println("ID is : " + id);
        System.out.println("Age is : " + age);
        scanner.close();
    }
}
