import javax.swing.JOptionPane;

public class SwitchCase {
	public static void main(String[]args){
		String Role = JOptionPane.showInputDialog("Enter group from Guest, Administrator, Faculty, Staff, or Student");
		switch(Role) {
		case "Guest":
			System.out.println("Welcome " + Role);
			break;
		case "Administrator":
			System.out.println("Welcome " + Role);
			break;
		case "Faculty":
			System.out.println("Welcome " + Role);
			break;
		case "Staff":
			System.out.println("Welcome " + Role);
			break;
		case "Student":
			System.out.println("Welcome " + Role);
			break;
		default:
			System.out.println("Please restart and enter valid group");
		}
	}
}
