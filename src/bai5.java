import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input floating-point number: ");
    double number1 = scanner.nextDouble();
    System.out.println("Inout floating-point another number: ");
    double number2 = scanner.nextDouble();
    if(Math.round(number1*1000)/1000== Math.round(number2*1000)/1000) {
    	System.out.println("They are same");
    }
    else {
		System.out.println("They are differrent");
	}
	}

}
