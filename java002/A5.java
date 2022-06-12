package java002;
import java.util.Scanner;
public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int inputnumber = scanner.nextInt();
		
		for(int i = 0; i < inputnumber; i++) {				// make a line
			for(int j = 1; j <= i; j++) {		// make a blank
				System.out.print(" ");
			} for(int k = 2*inputnumber-1; k >= (2*i+1); k--) {			// make a degree with star
				System.out.print("*");
			}
			System.out.println("");			// change line
		}
		
		
	}

}
