package java2_003;

public class P008 {
//#2. 세금계산  3) 영수증 형태 출력하기, 20220414, k32_이지민
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] k32_item = {"포켓몬빵", "초코송이", "치토스", "포카칩", "쿠크다스"};	// 문자열 배열로 내가 좋아하는 과자 선언
		int[] k32_price = {1000, 2000, 3000, 2500, 1450};	// 정수형 배열로 과자의 단가 선언
		int[] k32_amount = {10, 2, 1, 3, 5};	// 정수형 배열로 과자 구매 수량 선언
		double k32_taxRate = 0.1;	// 실수형 변수로 세금rate 선언
		int k32_totalSum = 0;	// 정수형 변수로 총합(지불 금액) 선언
		
		System.out.printf("*************************************************\n");	// 아래에서 결과를 출력한다. (칸을 맞추기!)
		System.out.printf("                 <내가 산 과자들>               \n");	
		System.out.printf(" 항목              단가         수량      합계\n");
		for (int k32_i = 0; k32_i < k32_item.length; k32_i++) {	// k32_i가 0부터 정수형 배열 k32_item의 길이(마지막)까지 1씩 증가할 때 (for 반복문)
			int k32_sum = k32_price[k32_i] * k32_amount[k32_i];		// 정수형 변수 합계, 과자의 단가 배열과 과자 구매 수량 배열에서 각각 상응하는 것을 곱한다. 
			k32_totalSum = k32_totalSum + k32_sum;		// 총합(지불금액)은 합계를 누적한다. 
			System.out.printf("%-5s\t   %3d\t\t %2d\t %5d\n", k32_item[k32_i], k32_price[k32_i], k32_amount[k32_i], k32_sum);	// 칸을 맞추면서 결과를 출력한다
		}																									// 과자 종류, 단가, 수량, 합계 배열 순서에 맞게 출력 
		System.out.printf("*************************************************\n");
		System.out.printf("지  불  금  액 : \t%22d\n", k32_totalSum);		// 지불금액을 출력한다. (칸 맞추기)
		
		int k32_totalNetPrice = (int) (k32_totalSum / (1+k32_taxRate));		// 과세금액을 정수형 변수로 선언, 지불금액에서 (1+세율)을 나눈다 (세금은 올림!)(형 변환에 주의)
		System.out.printf("과  세  금  액 : \t%22d\n", k32_totalNetPrice);	// 과세금액을 출력한다
		int k32_tax = k32_totalSum - k32_totalNetPrice;		// 세금을 정수형 변수로 선언, 세금 = 지불금액 - 과세금액
		System.out.printf("세          금 : \t%22d\n", k32_tax);	// 세금을 출력한다
	}

}
