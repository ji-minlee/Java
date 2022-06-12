package java004;

import java.util.Arrays;
import java.util.Scanner;

public class P01 {
	
	static int N, wantSum;
	static int[] result;
	static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input dice number");
		N = sc.nextInt();
		System.out.println("Please input sum");
		wantSum = sc.nextInt();
		result = new int[N]; // 결과값을 저장할 배열
		int diceNum = 0;

		Calculate(diceNum);

	}

	public static void Calculate(int diceNum) {
		if (diceNum == N) { // N번째 주사위에 도달
			for (int i = 0; i < N; i++) { // 모든 주사위의 값을 더함
				sum += result[i];
			}
			if (sum == wantSum) { // 주사위의 값의 합이 원하는 합과 같을 시 출력
				System.out.println(Arrays.toString(result));
				return;
			} else {
				sum = 0;
			}
		} else {
			for (int i = 1; i <= 6; i++) {
				result[diceNum] = i; // n번 주사위에 i 값 부여
				diceNum = diceNum + 1; // n+1번 주사위로 넘어감

				Calculate(diceNum); // n+1번 주사위에 대하여 재귀호출

				diceNum = diceNum - 1; // 다시 n번 주사위로 돌아옴
				result[diceNum] = 0; // 기존값으로 되돌림
			}
		}
	}
}
