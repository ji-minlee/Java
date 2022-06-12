package java003;

import java.util.Scanner;

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String equation = sc.nextLine();
		String str1, str2, oper;
		float num1, num2;
		int cut1;
		if (equation.contains("+")) {
			cut1 = equation.lastIndexOf("+");
			str1 = equation.substring(0, cut1);
			str2 = equation.substring(cut1 + 1);
			num1 = Float.valueOf(str1);
			num2 = Float.valueOf(str2);
			float result = num1 + num2;
			System.out.println(result);
		} else if (equation.contains("-")) {
			cut1 = equation.lastIndexOf("-");
			str1 = equation.substring(0, cut1);
			str2 = equation.substring(cut1 + 1);
			num1 = Float.valueOf(str1);
			num2 = Float.valueOf(str2);
			float result = num1 - num2;
			System.out.println(result);
		} else if (equation.contains("*")) {
			cut1 = equation.lastIndexOf("*");
			str1 = equation.substring(0, cut1);
			str2 = equation.substring(cut1 + 1);
			num1 = Float.valueOf(str1);
			num2 = Float.valueOf(str2);
			float result = num1 * num2;
			System.out.println(result);
		} else if (equation.contains("/")) {
			cut1 = equation.lastIndexOf("/");
			str1 = equation.substring(0, cut1);
			str2 = equation.substring(cut1 + 1);
			num1 = Float.valueOf(str1);
			num2 = Float.valueOf(str2);
			float result = num1 / num2;			
			System.out.println(result);
		}
	}
}