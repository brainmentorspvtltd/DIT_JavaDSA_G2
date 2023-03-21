import java.util.Date;
import java.util.Scanner;

class Message {
	private String msg;
	private int empId;
	private Date date;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}

class View {
	void doRegister() {
		
	}
	void doLogin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Emp ID : ");
		int id = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter Emp Password : ");
		String password = scanner.nextLine();
		
		DB db = new DB();
		//String msg = db.checkLogin(id, password);
		Message msg = db.checkLogin(id, password);
		System.out.println(msg.getEmpId());
		System.out.println(msg.getDate());
		System.out.println(msg.getMsg());
		
		scanner.close();
		
	}
}

class DB {
	Message checkLogin(int id, String pwd) {
		//String msg;
		Message msg = new Message();
		if(id == 101 && pwd.equals("1234")) {
			//msg = "Login Success...";
			msg.setMsg("Login Success...");
		}
		else {
			//msg = "Login Failed...";
			msg.setMsg("Login Failed...");
		}
		msg.setDate(new Date());
		msg.setEmpId(id);
		return msg;
	}
}

public class PassObject {

	public static void main(String[] args) {
		
		View view = new View();
		view.doLogin();

	}

}
