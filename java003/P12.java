package java003;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#Temperature Converter");
		System.out.println("1.Celsius -> Fahrenheit");
		System.out.println("2.Fahrenheit -> Celsius");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose the option");
		int choice = scan.nextInt();
		
		float inputTemperature = scan.nextFloat();
		float convertTemperature = 0;
		
		switch (choice) {
		case 1:
			convertTemperature = (float) (inputTemperature * 1.8 + 32);
			break;
		case 2:
			convertTemperature = (float) ((inputTemperature-32) / 1.8);
			break;
		}
		String resultTemperature = String.format("%.2f", convertTemperature);
		System.out.println("Convert Temperature " + resultTemperature);
	}

}
