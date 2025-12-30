import java.util.Scanner;

class demo{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter password");
		try {
		String pass = scan.nextLine();
		
		if(pass.length() < 8) {
			System.out.println("Password must have at least 8 characters ");
		} else if(!pass.matches(".*[A-Z].*")) {
			System.out.println("Password must have at least one upper case");
		} else if(!pass.matches(".*\\d.*")) {
			System.out.println("Password must have one digit");
		}
			System.out.println("Password enterd");
		} catch(Exception e) {
			System.out.println("Error "+ e);
		}
		scan.close();
	}	
}