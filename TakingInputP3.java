import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TakingInputP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scanner.nextLine();

        // Now convert name into title case
        // title case - first letter of each word is capital
        String nameArr[] = name.split(" ");
        String fullName = "";

        for(String s : nameArr) {
            name = String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1).toLowerCase();
            fullName += name + " ";
        }

        System.out.print("Enter your salary : ");
        int salary = scanner.nextInt();

        // Internationalization / Localization
        Locale locale = new Locale("en", "IN");
        // Get Currency
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        String formatSalary = nf.format(salary);

        Date date = new Date();
        // DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        // DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        // DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
        // Date with Locale
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        String dateFormat = df.format(date);

        System.out.println("Date : " + dateFormat);
        System.out.println("Welcome : " + fullName);
        System.out.println("Salary is : " + formatSalary);
        scanner.close();
    }
}
