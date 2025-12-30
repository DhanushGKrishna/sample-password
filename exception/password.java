import java.util.Scanner;
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message){
        super(message);
    }
}
public class password{
    public static void validpass(String pass) throws InvalidPasswordException{
        if(pass.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 character");
        } else if(!pass.matches(".*[A-Z].*")){
            throw new InvalidPasswordException("Password must contain at least one upper case");
        } else if(!pass.matches(".*\\d.*")){
            throw new InvalidPasswordException("Password must containe at least one digit");
        } else{
            System.out.println("Password is valid!");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter your password");
            String pass = scan.nextLine();

            validpass(pass);
        } catch (InvalidPasswordException e) {
            System.out.println("Error: " +e.getMessage());
        }
        scan.close();
    }
}
