package java003;

import java.util.Calendar;
import java.util.Scanner;

public class P06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		Scanner scanner = new Scanner(System.in);
		int inputYear = scanner.nextInt();
		int inputMonth = scanner.nextInt();

		calendar.set(inputYear, inputMonth - 1, 1); // 입력받은 월의 1일로 세팅
													// month는 0이 1월이므로 -1을 해준다

		int end = calendar.getActualMaximum(Calendar.DATE); // 해당 월 마지막 날짜
		int day = calendar.get(Calendar.DAY_OF_WEEK); // 해당 날짜의 요일(1:sun ~ 7:sat)

		System.out.println();
		System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat");

		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 1; j < day; j++) {
					System.out.print("     ");
				}
			}
			if (i < 10) { // 한자릿수일 경우 공백 추가해 줄 맞추기
				System.out.print(" ");
			}
			System.out.print("  " + i + " ");
			if (day % 7 == 0) { // 한 줄에 7일씩 출력
				System.out.println();
			}
			day++;
		}

	}
}
