package java005;

import java.util.Scanner;

public class P06 {

	
		// TODO Auto-generated method stub
		
		
		static double num1, num2;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			P06 p06 = new P06();
			
			String formulation = formulation();
			

			String operation = cutformulation(formulation);

			double result = operate(operation, num1, num2);

			System.out.println(result);
		}

		public static String formulation() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please input the formula (ex. 3*7)");
			String formula = sc.next();
			return formula;
		}

		public static String cutformulation(String formulationResult) {
			int cut;
			String operation = "";
			String[] operationArr = { "+", "-", "*", "/" };
			for (int i = 0; i < operationArr.length; i++) {
				if (formulationResult.contains(operationArr[i])) {
					cut = formulationResult.lastIndexOf(operationArr[i]);
					num1 = Double.valueOf(formulationResult.substring(0, cut));
					num2 = Double.valueOf(formulationResult.substring(cut + 1));
					operation = operationArr[i];
					
				}
			
			}
			return operation;
		}

		public static double operate(String operation, double num1, double num2) {
			double result = 0;
			if (operation.equals("+")) {
				result = addition(num1, num2);
			} else if (operation.equals("-")) {
				result = subtraction(num1, num2);
			} else if (operation.equals("*")) {
				result = multiplication(num1, num2);
			} else if (operation.equals("/")) {
				result = division(num1, num2);
			} else {
				System.out.println("Please input another formula");
			}
			return result;
		}
		

		public static double addition(double num1, double num2) {
			double sum = (num1 + num2);
			return sum;
		}

		public static double subtraction(double num1, double num2) {
			double subtract = (num1 - num2);
			return subtract;
		}

		public static double multiplication(double num1, double num2) {
			double multiple = (num1 * num2);
			return multiple;
		}

		public static double division(double num1, double num2) {
			double result = 0;
			if (num2 != 0) {
				double divide = (num1 / num2);
				return divide;
			} else {
				System.out.println("Input another number");
			}
			return result;
		}
		

}
