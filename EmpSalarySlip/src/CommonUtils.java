import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class CommonUtils {
	
	Locale locale;
	public CommonUtils(String lang, String country) {
		locale = new Locale(lang, country);
	}
	
	public String formatValue(String name) {
		//name = "rAm ShARmA";
		String nameArr[] = name.split(" ");
		//{"rAm", "ShARmA"}
		String fullName = "";
		
		for(String s : nameArr) {
			//s = "rAm"
			char firstChar = s.charAt(0);
			// firstChar = 'r'
			String firstLetter = String.valueOf(firstChar); // type cast char into string
			fullName += firstLetter.toUpperCase() + s.substring(1).toLowerCase() + " ";
		}
		return fullName;
	}
	
	public String formatDate() {
		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, locale);
		String formatted_date = df.format(date);
		return formatted_date;
	}
	
	public String formatSalary(double salary) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		return nf.format(salary);
	}
	
}
