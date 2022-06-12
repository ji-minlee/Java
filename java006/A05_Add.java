package java006;

import java.util.Scanner;

public class A05_Add {
	public static float inputNum = 0, result = 0;
	public static int firstUnit = 0, secondUnit = 0;

	public void printMenu() {
		System.out.println("# Unit");
		System.out.println("1. cm\n2. m\n3. mm\n4. km\n5. mile");
		System.out.println("Input two unit");
	}

	public void inputUnit() {
		Scanner sc = new Scanner(System.in);
		firstUnit = sc.nextInt();
		secondUnit = sc.nextInt();
	}

	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		inputNum = sc.nextInt();
	}

	public void calUnit() {
		if (firstUnit == 1) {
			cmUnit(secondUnit);
		} else if (firstUnit == 2) {
			mUnit(secondUnit);
		} else if (firstUnit == 3) {
			mmUnit(secondUnit);
		} else if (firstUnit == 4) {
			kmUnit(secondUnit);
		} else if (firstUnit == 5) {
			mileUnit(secondUnit);
		} else {
			System.out.println("Wrong Number");
		}
	}

	public void cmUnit(int secondUnit) {
		if (secondUnit == 1) {
			result = inputNum;
		} else if (secondUnit == 2) {
			result = inputNum / 100;
		} else if (secondUnit == 3) {
			result = inputNum * 10;
		} else if (secondUnit == 4) {
			result = inputNum / 100000;
		} else if (secondUnit == 5) {
			result = (float) (inputNum * 6.2137e-6);
		} else {
			System.out.println("Wrong Number");
		}
	}

	public void mUnit(int secondUnit) {
		if (secondUnit == 1) {
			result = inputNum * 100;
		} else if (secondUnit == 2) {
			result = inputNum;
		} else if (secondUnit == 3) {
			result = inputNum * 1000;
		} else if (secondUnit == 4) {
			result = inputNum / 1000;
		} else if (secondUnit == 5) {
			result = (float) (inputNum * 0.000621);
		} else {
			System.out.println("Wrong Number");
		}
	}

	public void mmUnit(int secondUnit) {
		if (secondUnit == 1) {
			result = inputNum / 10;
		} else if (secondUnit == 2) {
			result = inputNum / 1000;
		} else if (secondUnit == 3) {
			result = inputNum;
		} else if (secondUnit == 4) {
			result = (float) (inputNum * 1e-6);
		} else if (secondUnit == 5) {
			result = (float) (inputNum * 6.2137e-7);
		} else {
			System.out.println("Wrong Number");
		}
	}

	public void kmUnit(int secondUnit) {
		if (secondUnit == 1) {
			result = inputNum * 100000;
		} else if (secondUnit == 2) {
			result = inputNum * 1000;
		} else if (secondUnit == 3) {
			result = inputNum * 1000000;
		} else if (secondUnit == 4) {
			result = inputNum;
		} else if (secondUnit == 5) {
			result = (float) (inputNum * 0.621371);
		} else {
			System.out.println("Wrong Number");
		}
	}

	public void mileUnit(int secondUnit) {
		if (secondUnit == 1) {
			result = (float) (inputNum * 1690934.4);
		} else if (secondUnit == 2) {
			result = (float) (inputNum * 1609.344);
		} else if (secondUnit == 3) {
			result = inputNum * 1609344;
		} else if (secondUnit == 4) {
			result = (float) (inputNum * 1.609344);
		} else if (secondUnit == 5) {
			result = inputNum;
		} else {
			System.out.println("Wrong Number");
		}
	}

	public void printResult() {
		System.out.println(result);
	}

}