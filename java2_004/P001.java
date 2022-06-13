package java2_004;

public class P001 {
// if문 / 20220415 / k32_이지민 / if문의 기본 형태 익히기 // 주석에는 k32_를 생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_score = 93;	// 정수형 변수 score 선언 및 0으로 초기화
		int k32_num = 0;	// 정수형 변수 num 선언 및 0으로 초기화
		
		if (k32_score > 60) {	// score가 60보다 클 때, 
			System.out.println("합격입니다.");	// 수행문 출력
		}
		
		if (k32_score > 60) {	// score가 60보다 클 때, 
			System.out.println("합격입니다.");	// 수행문 출력
		} else {	// score가 60이하 일 때
			System.out.println("불합격입니다.");	// 수행문 출력
		}
		
		if (k32_num > 0) {	// num이 0보다 클 때, 
			System.out.println("양수입니다.");	// 수행문 출력
		} else if (k32_num < 0) {	// num이 0보다 작을 때
			System.out.println("음수입니다");	// 수행문 출력
		} else {	// 위의 두 조건식을 만족하지 않을 때
			System.out.println("영입니다.");	// 수행문 출력
		}
		
		if (k32_score >= 90) {	// score가 90 이상 일 때 
			System.out.println("A등급");	// 수행문 출력
		} else if (k32_score >= 80 && k32_score < 90) {	// score가 80이상 90미만일 때
			System.out.println("B등급");	// 수행문 출력
		} else if (k32_score >= 70 && k32_score < 80) {	// score가 70이상 80미만일 때
			System.out.println("C등급");	// 수행문 출력
		} else {	// 위의 4 조건식을 모두 만족하지 않을 때 (score가 69이하일 때)
			System.out.println("F등급");	// 수행문 출력
		}
	}

}
