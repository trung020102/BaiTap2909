
import java.util.Scanner;

public class bai2a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Input the 1st number: "); 
    int a = scan.nextInt();
   
    System.out.print("Input the 2nd number: ");
    int b = scan.nextInt();
   
    System.out.print("Input the 3rd number: ");
    int c = scan.nextInt();
    
    int max =  (a > b) ? (a > c ? a : c):(b>c?b:c);
    System.out.println("max: " + max);
	}

}
