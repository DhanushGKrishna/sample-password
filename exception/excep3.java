import java.util.Scanner;
import java.util.InputMismatchException;
class excep3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two number for division");
       try{
            int a = scan.nextInt();
            int b = scan.nextInt();
            int sum = (a/b);
            System.out.println("The final result is: " + sum);
        } catch(ArithmeticException e){
            System.out.println("Number can't divided");
        } catch(InputMismatchException e){
            System.out.println("Input is not valid ");
        }
        scan.close();
    }
}