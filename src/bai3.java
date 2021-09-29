import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    
    System.out.print(" Input number: ");
    float number = scan.nextFloat();
    if(number == 0) {
    	System.out.println("Zero");
    }
    else if (number > 0) {
		System.out.println("positive");
		if (number > 0 && number < 1 ) {
			System.out.println("small");
		}
		if (number >= 1000000) {
			System.out.println("large");
		}
	}
    else {
		System.out.println("hegative");
	}
	}

}
