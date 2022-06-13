package java2_003;

public class P002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #1. 3) 누적하기, 20220414, k32_이지민, 누적합과 연산자 사용

		int k32_sum; 	// 정수인 변수 k32_sum을 선언

		k32_sum = 0; 	// 변수 k32_sum을 0으로 초기화

		for (int k32_i = 1; k32_i < 101; k32_i++) { 	// k32_i가 1부터 100까지 1씩 증가하면서 (for 반복문)
			k32_sum = k32_sum + k32_i; 		// k32_sum에 k32_sum + k32_i를 누적합
		}
		System.out.printf("#2-1 : %d\n", k32_sum); 	// k32_sum 을 출력
		System.out.printf("#2-2 : %d\n", k32_sum / 100); 	// k32_sum/100을 출력

		int[] k32_v = { 1, 2, 3, 4, 5 }; 	// 정수 배열 k32_v를 선언
		int k32_vSum; 	// 정수 변수 k32_vSum을 선언

		k32_vSum = 0; 	// 변수 k32_vSum을 0으로 초기화

		for (int k32_i = 0; k32_i < 5; k32_i++) { 	// k32_i가 0부터 4까지 1씩 증가하면서 (for 반복문)
			k32_vSum = k32_vSum + k32_v[k32_i];	 // k32_vSum에 k32_vSum + k32_v[k32_i]를 누적합
		}

		System.out.printf("#2-3 : %d\n", k32_vSum); 	// k32_vSum을 출력
	}

}
