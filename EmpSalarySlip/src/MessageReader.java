import java.util.ResourceBundle;

public class MessageReader {
	ResourceBundle rb;
	public MessageReader() {
		rb = ResourceBundle.getBundle("messages");
	}
	
	public String getValue(String key) {
		return rb.getString(key);
	}
}
