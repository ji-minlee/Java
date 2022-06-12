package java002;
import java.util.Scanner;

public class P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Input Paid Money : ");
		int paidmoney = scan.nextInt();

		System.out.println(("Input Total Money : "));
		int totalmoney = scan.nextInt();

		int changemoney = paidmoney - totalmoney;

		System.out.println("\nChange Money : " + changemoney);

		System.out.println("10000 - " + changemoney / 10000);
		System.out.println("5000 - " + (changemoney % 10000) / 5000);
		System.out.println("1000 - " + (changemoney % 5000) / 1000);
		System.out.println("500 - " + (changemoney % 5000 % 1000) / 500);
		System.out.println("100 - " + (changemoney % 5000 % 1000 % 500) / 100);
		System.out.println("50 - " + (changemoney % 5000 % 1000 % 500 % 100) / 50);
		System.out.println("10 - " + (changemoney % 5000 % 1000 % 500 % 100 % 50) / 10);
	}

}
