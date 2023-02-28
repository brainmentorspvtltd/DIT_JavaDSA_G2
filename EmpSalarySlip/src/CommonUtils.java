public class CommonUtils {
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
}
