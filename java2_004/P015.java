package java2_004;

// 자바 내장 함수를 불러오기 위해 import 사용
import java.text.DecimalFormat;

public class P015 {
// 칸 맞춰 인쇄 / 20220415 / k32_이지민 / 한글과 영어 칸 맞추기 / 주석에는 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k32_item = "사과"; // 문자열 변수 item을 선언하고 "사과"로 초기화
		int k32_unitPrice = 5000; // 정수형 변수 unitPrice를 선언하고 5000으로 초기화
		int k32_num = 500; // 정수형 변수 num을 선언하고 500으로 초기화
		int k32_total = 0; // 정수형 변수 total을 선언하고 0으로 초기화

		DecimalFormat k32_df = new DecimalFormat("###,###,###,###,###"); // DecimalFormat 클래스 가져와서 출력형태 지정

		System.out.printf("==========================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%10.10s\n", "품목", "단가", "수량", "합계"); // 적절한 칸을 띄워 출력하기
		System.out.printf("==========================================================\n");

		System.out.printf("%20.20s%10.10s%10.10s%12.12s\n", k32_item, k32_df.format(k32_unitPrice),
				k32_df.format(k32_num), k32_df.format(k32_unitPrice * k32_num));	// 적절한 칸을 띄워 출력하기
				//DecimalFormat을 활용해 출력 형태 지정(콤마 찍기)
		System.out.printf("==========================================================\n"); 
	}

}
