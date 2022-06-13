package java2_003;

public class P006 {
//#2. 세금계산 1) 단순 세금 계산, 20220414, k32_이지민, 세금은 무조건 올림을 한다!

	public static int k32_taxcal(int k32_val, int k32_rate) {	// 함수 k32_taxcal 선언, int k32_val(세전 가격), int k32_rate(세금%)
		int k32_ret;	// 정수형 변수 ret 선언

		if (((double) k32_val * (double) k32_rate / 100.0) == k32_val * k32_rate / 100) { //(실수) 세금이 (정수) 세금과 같으면
			k32_ret = k32_val * k32_rate / 100;		// 소수점 이하의 자리가 없는 것으로 세금은 세전 가격 * 세금(%) / 100
		} else {	// (실수) 세금이 (정수) 세금과 다르면 
			k32_ret = k32_val * k32_rate / 100 + 1;		// 소수점 이하가 있는 것 > 세금은 올림을 해야하므로 +1
		}
		return k32_ret;		// 계산한 세금값을 return 한다
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_val = 271;		// 세전 가격이 271원
		int k32_rate = 5;		// 세금 5퍼센트

		int k32_tax = k32_taxcal(k32_val, k32_rate);	// tax(세금)을 계산 < 함수 k32_taxcal 사용

		System.out.printf("*********************************************\n");
		System.out.printf("*           단순 세금 계산                  *\n");
		System.out.printf("실제 세금계산 : %f\n", k32_val * k32_rate / 100.0);		// 단순 세금 계산 결과 출력 (실수)

		System.out.printf("세전가격: %d 세금: %d 세포함가격: %d\n", k32_val, k32_tax, k32_val + k32_tax);	// 세전 가격, 세금, 세포함 가격 출력
		System.out.printf("*********************************************\n");
	}

}
