package java2_006;
// 클래스의 정의 / 20220417 / k32_이지민 / 주석은 k32_제외
public class P004 {

		int k32_limit_up_floor = 10;	// 최상위층 정수 변수 선언 및 10으로 초기화
		int k32_limit_down_floor = 0;	// 최하위층 정수 변수 선언 및 0으로 초기화 
		int k32_floor = 1;	// 현재층 정수 변수 선언 및 1로 초기화
		
		String k32_help;	// 문자열 변수 help 선언
		
		void k32_up() {	// 엘리베이터가 올라감
			if (k32_floor == k32_limit_up_floor) {	// 현재층이 최상위층일 때
				k32_help = "마지막 층입니다.";	// 문자열 "마지막 층입니다"
			} else {	// 현재층이 최상위층이 아니면
				k32_floor++;	// 현재층 1 증가
				k32_help = String.format("%d층입니다", k32_floor);	// 문자열 "현재층(숫자)입니다"
			}
		}
		
		void k32_down() {	// 엘리베이터가 내려감
			if (k32_floor == k32_limit_down_floor) {	// 현재층이 최하위층일 때
				k32_help = "처음 층입니다";	// 문자열 "처음 층입니다"
			} else {	// 현재층이 최하위층이 아니면
				k32_floor--;	// 현재층 1 감소
				k32_help = String.format("%d층입니다", k32_floor);	// 문자열 "현재층(숫자)입니다"
			}
			
		}
	}


