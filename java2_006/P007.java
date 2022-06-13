package java2_006;
// 메소드 오버로딩 / 20220417 / k32_이지민 / 주석은 k32_제외
public class P007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P007_Calc1 k32_cc = new P007_Calc1();	// P007_Calc1 클래스 cc 선언
		
		System.out.printf("2개 덧셈이 호출됨 [%d]\n", k32_cc.k32_sum(1, 2));		// 2개 덧셈 결과 출력
		System.out.printf("3개 덧셈이 호출됨 [%d]\n", k32_cc.k32_sum(1, 2, 3));	// 3개 덧셈 결과 출력
		System.out.printf("4개 덧셈이 호출됨 [%d]\n", k32_cc.k32_sum(1, 2, 3, 4));	// 4개 덧셈 결과 출력
		System.out.printf("더블형 덧셈이 호출됨 [%f]\n", k32_cc.k32_sum(1.3, 2.4));	// 실수형 덧셈 결과 출력
	}

}
