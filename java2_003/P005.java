package java2_003;

public class P005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #1 6) 소수점 자리의 반올림, 버림 처리, 20220414, k32_이지민, 정수형과 실수형을 넘나들며 처리
		// # 정수형 변수일 때
		int k32_MyVal = 14 / 5; 	// 정수형 변수 k32_MyVal을 선언
		System.out.printf("#5-1 : %d\n", k32_MyVal); 	// 14/5는 2.8이지만, 정수형 변수이므로 2 출력

		double k32_MyValF; // 실수형 변수 선언

		// # 실수형 변수, 정수로 계산식
		k32_MyValF = 14 / 5; // 실수형 변수를 선언했지만, 정수로 계산식을 세움
		System.out.printf("#5-2 : %f\n", k32_MyValF); // 2.000000 (실수형 계산이 되지는 않고 정수형 계산 후 출력만 실수형으로)

		// # 실수형 변수, 실수로 계산식
		k32_MyValF = 14.0 / 5; // 실수형 변수 선언, 실수로 계산식을 세움
		System.out.printf("#5-3 : %f\n", k32_MyValF); // 실수로 계산이 되어 출력(2.800000)

		// # 실수형 변수, 실수로 계산식
		k32_MyValF = (14.0) / 5 + 0.5; // 실수형 변수 선언, 실수로 계산식을 세움
		System.out.printf("#5-4 : %f\n", k32_MyValF); // 실수로 계산이 되어 출력 (3.300000)

		// # 실수형 변수, 실수로 계산식, 정수 선언
		k32_MyValF = (int) ((14.0) / 5 + 0.5); // 실수형 변수에 실수로 계산식을 세움, but 정수 선언을 함(int)
		System.out.printf("#5-5 : %f\n", k32_MyValF); // 정수로 계산(출력형태만 실수형) (3.000000)
	}

}
