package java2_004;

public class P002 {
// switch/case문 / 20220415 / k32_이지민 / 주석에는 k32_를 생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k32_jumin = "123456-1234567";	// 문자열 jumin 선언 및 초기화
		
		switch (k32_jumin.charAt(7)) {	// jumin의 7번째 위치에 있는 문자에 대하여
			case '1' : 	// 문자가 1이면
				System.out.printf("20세기전 태어난 남자 사람\n");	// 수행문 출력
				break;
			case '2' : 	// 문자가 2이면
				System.out.printf("20세기전 태어난 여자 사람\n");	// 수행문 출력
				break;	// 해당 case문을 빠져 나감
			case '3' : 	// 문자가 3이면
				System.out.printf("20세기 후 태어난 남자 사람\n");	// 수행문 출력
				break;	// 해당 case문을 빠져 나감
			case '4' : 	//문자가 4이면
				System.out.printf("20세기 후 태어난 여자 사람\n");	// 수행문 출력
				break;	// 해당 case문을 빠져나감
			default : // 위의 case들에 해당이 안되는 경우
				System.out.printf("사람\n");	// 수행문 출력
				break;	// 해당 default문을 빠져나감
		}
	}
// 주의! 위 코드에서 문법 오류는 나지 않는다. 다만 출력이 이상함을 볼 수 있다. 
// case '1'에 break문이 없기 때문에 빠져나가지 못하고 그대로 case '2'까지 수행 후 빠져나가기 때문이다.
}
