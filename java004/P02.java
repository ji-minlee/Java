package java004;

import java.util.Scanner;

public class P02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int deposit = 0, withdrawal = 0, balance = 0;
		while (true) {
			if (balance < 0) {	// 잔고 부족시 프로그램 종료
				System.out.println("Insufficient balance");
				break;
			}
			System.out.println("#Menu");
			System.out.println("1. Deposit");
			System.out.println("2. Withdrawal");
			System.out.println("Balance : " + balance + "\n");

			System.out.println("Choose the option");
			int option = sc.nextInt();

			if (option == 1) {	// 입금
				System.out.println("Enter the amount of your deposit");
				int newdeposit = sc.nextInt();
				deposit += newdeposit;
			} else if (option == 2) {	// 출금
				System.out.println("Enter the withdrawal amount");
				int newwithdrawal = sc.nextInt();
				withdrawal += newwithdrawal;
			} else {
				System.out.println("Wrong number! Choose another number");
			}
			balance = deposit - withdrawal;

			System.out.println();
		}

	}
}
