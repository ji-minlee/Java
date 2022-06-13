package java2_003;

public class P007 { 
//#2. 세금계산 2) 소비자가 세금 계산, 20220414, k32_이지민, 세전가격 = 소비자가격 / (1 + 세율)
	public static int k32_netprice(int k32_price, double k32_rate) {	// k32_netprice 함수 선언(세전 가격)
		return (int) (k32_price / (1 + k32_rate)); //정수형 세전 가격 값 리턴 (소비자가격 / (1+세율))
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_price = 1234;	// 소비자가격 정수형 변수 선언
		double k32_taxRate = 0.1;	// 세율 실수형 변수 선언(0.1)
		
		int k32_netprice = k32_netprice(k32_price, k32_taxRate);	// 세전 가격 정수형 변수 < 함수 사용
		int k32_tax = k32_price - k32_netprice;		// 세금 = 소비자가 -  세전 가격
		
		System.out.printf("*******************************************************\n");
		System.out.printf("*            소비자가, 세전가격, 세금 계산            *\n");
		System.out.printf(" 소비자가격: %d, 세전가격: %d, 세금: %d\n", k32_price, k32_netprice, k32_tax);	// 소비자가, 세전가격, 세금 결과 출력
		System.out.printf("*******************************************************\n");
	}

}
