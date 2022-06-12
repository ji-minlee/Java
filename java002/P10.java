package java002;
import java.util.Scanner;
public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String text = "car";
		if (sentence.toUpperCase().contains("CAR") || sentence.toLowerCase().contains("car")) {
			System.out.println("car is included in the input string");
		} else {
			System.out.println("car is not included in the input string");
		}
	}

}
