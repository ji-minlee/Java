package java002;
import java.util.Scanner;

public class P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input number(base10) : ");
		int inputnumber = scan.nextInt();
		
		int convertnumber0 = (inputnumber/9)%3;
		int convertnumber3 = (inputnumber/3)%3;
		int convertnumber9 = (inputnumber%3);
				
		
		System.out.printf("Convert number(base3) : %d%d%d", convertnumber0, convertnumber3, convertnumber9);
		
		
	}

}
