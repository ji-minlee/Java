package java005;

import java.util.Scanner;

public class P04 {

	static String formula, operation;
	static Float num1, num2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P04 p04 = new P04();
		p04.formulation();

		p04.cutformulation();

		p04.operate(operation, num1, num2);

	}

	public void formulation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the formula (ex. 3*7)");
		formula = sc.next();
	}

	public void cutformulation() {
		int cut;
		String[] operationArr = { "+", "-", "*", "/" };
		for (int i = 0; i < operationArr.length; i++) {
			if (formula.contains(operationArr[i])) {
				cut = formula.lastIndexOf(operationArr[i]);
				num1 = Float.valueOf(formula.substring(0, cut));
				num2 = Float.valueOf(formula.substring(cut + 1));
				operation = operationArr[i];
			}
		}
	}

	public void operate(String operation, Float num1, Float num2) {
		if (operation.equals("+")) {
			addition(num1, num2);
		} else if (operation.equals("-")) {
			subtraction(num1, num2);
		} else if (operation.equals("*")) {
			multiplication(num1, num2);
		} else if (operation.equals("/")) {
			division(num1, num2);
		} else {
			System.out.println("Please input another formula");
		}
	}

	public static void addition(Float num1, Float num2) {
		Float sum = (num1 + num2);
		System.out.println(sum);
	}

	public static void subtraction(Float num1, Float num2) {
		Float subtract = (num1 - num2);
		System.out.println(subtract);
	}

	public static void multiplication(Float num1, Float num2) {
		Float multiple = (num1 * num2);
		System.out.println(multiple);
	}

	public static void division(Float num1, Float num2) {
		if (num2 != 0) {
			Float divide = (num1 / num2);
			System.out.println(divide);
		} else {
			System.out.println("Input another number");
		}
	}

}
