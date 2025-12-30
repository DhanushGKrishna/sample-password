import java.util.Scanner;

public class demo2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();

        if(n > 0){
            System.out.println("The number " + n + " is positive");
        } else{
            System.out.println("The number "+ n + " is negative");
        }

        scan.close();
    }
}