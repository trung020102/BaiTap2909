import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Input the 1st number: "); 
    int number1 = scan.nextInt();
   
    System.out.print("Input the 2nd number: ");
    int number2 = scan.nextInt();
   
    System.out.print("Input the 3rd number: ");
    int number3 = scan.nextInt();
    
    int Max = (number1 > number2) ? number1 : number2;
    Max = ( Max > number3 ) ? Max : number3;
    System.out.println("Max: " + Max);
    
    

    }

	}
