package java003;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#Current Converter");
		System.out.println("1.South Korean Won -> United States Dollar");
		System.out.println("2.United States Dollar -> South Korean Won");
		System.out.println("3.South Korean Won -> Europen Union Euro");
		System.out.println("4.Europen Union Euro -> South Korean Won");
		System.out.println("5.South Korean Won -> Japanese Yen");
		System.out.println("6.Japanese Yen -> South Korean Won");

		Scanner scan = new Scanner(System.in);
		System.out.println("Choose the option");
		int choice = scan.nextInt();
		System.out.println("Input Money");
		float inputMoney = scan.nextFloat();
		float convertMoney = 0;
		

		switch (choice) {
		case 1:
			convertMoney = (float) (inputMoney / 1220.8);
			break;
		case 2:
			convertMoney = (float) (inputMoney * 1220.8);
			break;
		case 3:
			convertMoney = (float) (inputMoney / 1340.4);
			break;
		case 4:
			convertMoney = (float) (inputMoney * 1340.4);
			break;
		case 5:
			convertMoney = (float) (inputMoney / 987.26);
			break;
		case 6:
			convertMoney = (float) (inputMoney * 987.26);
			break;
		}
		String resultMoney = String.format("%.2f", convertMoney);
		System.out.println("Convert Money " + resultMoney);
	}

}
