import java.util.Scanner;

class mash {

    public int sum (int num1, int num2 ){
        int result = num1 + num2;
        return result;
    }

    public static void main(String[] args){
        mash obj = new mash();
       Scanner scan = new Scanner(System.in); 
       System.out.println("Enter the number: ");
        int c = scan.nextInt();
        int d = scan.nextInt();

        int mm = obj.sum(c, d);
        System.out.println("The result is "+ mm);
        scan.close();

    }
    
    
}

