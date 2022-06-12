package java012;

import java.util.Scanner;

public class P002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input the current date (ex:20220427)");
		String date = sc.nextLine();
		
		System.out.println("Please input the birthday (ex:20220427)");
		String birth = sc.nextLine();
		
		int koreanAge, internationalAge;
		
		koreanAge = Integer.parseInt(date.substring(0, 4)) - Integer.parseInt(birth.substring(0, 4)) + 1;
		
		if (Integer.parseInt(date.substring(4)) <= Integer.parseInt(birth.substring(4))) {
			internationalAge = Integer.parseInt(date.substring(0, 4)) - Integer.parseInt(birth.substring(0, 4)) - 1;
		} else {
			internationalAge = Integer.parseInt(date.substring(0, 4)) - Integer.parseInt(birth.substring(0, 4));
		}		
		
		System.out.println(koreanAge + " years old in Korean age");
		System.out.println(internationalAge + " years old in international age");
	}

}
