package java012;

import java.util.Scanner;
import java.util.stream.Stream;

public class P001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("0이나 1로 이루어진 4자리 숫자를 입력하세요");
		String input1 = sc.nextLine();

		System.out.println("0이나 1로 이루어진 4자리 숫자를 입력하세요");
		String input2 = sc.nextLine();

		System.out.println("0이나 1로 이루어진 4자리 숫자를 입력하세요");
		String input3 = sc.nextLine();

		String arr[] = { input1, input2, input3 };

		int resultArr[] = new int[4];

		String result = "";
		int count = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].substring(j, j+1).equals("0")) {
					resultArr[j] = resultArr[j] + 1;
					count++;
				}
			}
			if (count == 4) {
				result = "Pass";
			}
			count = 0;
		}

		if (!result.equals("Pass")) {
			for (int i = 0; i < 4; i++) {
				if (resultArr[i] == 3) {
					result = "Pass";
					break;
				} else if (resultArr[i] != 4) {
					result = "Fail";
				}
			}
		}

		System.out.println(result);

	}

}
