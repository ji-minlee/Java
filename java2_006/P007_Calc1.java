package java2_006;
// 메소드 오버로딩 / 20220417 / k32_이지민 / 주석은 k32_제외
public class P007_Calc1 {

	public int k32_sum (int k32_a, int k32_b) {	// 정수형 매개변수 a,b를 갖는 함수 sum 선언
		return k32_a + k32_b;	// 리턴값 : a+b
	}
	
	public int k32_sum (int k32_a, int k32_b, int k32_c) {	// 정수형 매개변수 a,b,c를 갖는 함수 sum 선언
		return k32_a + k32_b + k32_c;	// 리턴값 : a+b+c
	}
	
	public int k32_sum (int k32_a, int k32_b, int k32_c, int k32_d) {	// 정수형 매개변수 a,b,c,d를 갖는 함수 sum 선언
		return k32_a + k32_b + k32_c + k32_d;	// 리턴값 : a+b+c+d
	}
	
	public double k32_sum (double k32_a, double k32_b) {	// 실수형 매개변수 a,b를 갖는 함수 sum 선언
		return k32_a + k32_b;	// 리턴값 : a+b
	}
	
	// 위의 sum과 아래 sum은 똑같이 정의할 수 없다 > 받는 매개변수가 똑같아서 구별 불가
}
