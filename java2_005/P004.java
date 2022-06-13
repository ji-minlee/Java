package java2_005;
// 사용한 import 목록
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P004 {
//영수증 출력(1) / 20220418 / k32_이지민 / 주석에는 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_Price = 33000;	// 주문 합계 액은 정수 변수로 선언 , 33000원으로 초기화
		int k32_netPrice, k32_taxPrice;		// 세전가격, 세금 정수 변수로 선언
		double k32_taxRate = 0.1;	// 실수형 변수 세율 선언 및 0.1로 초기화 (10%)
		
		k32_netPrice = k32_netPrice(k32_Price, k32_taxRate);	// 세전 가격을 함수를 호출해 구한다. 
		k32_taxPrice = k32_Price - k32_netPrice; 	// 세금은 소비자가격 - 세전 가격
				
		DecimalFormat k32_df = new DecimalFormat("###,###,###,###,###");	// DecimalFormat 클래스 가져오기, 형태 지정하기
		Calendar k32_calt = Calendar.getInstance();		// Calendar 클래스로 현재 시간을 가져옴
		SimpleDateFormat k32_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");		// SimpleDateFormat 클래스로 출력 형식 지정 
		//영수증 출력 (교안의 내용 참조), 칸에 맞춰 출력하기
		System.out.println("신용승인");
		System.out.println("단말기 : 2N68665898             전표번호 : 041218"); 
		System.out.println("가맹점 : 한양김치찌개");
		System.out.println("주  소 : 경기 성남시 분당구 황새울로351번길 10 ,");
		System.out.println("1층");
		System.out.println("대표자 : 유창신");
		System.out.println("사업자 : 752-53-00558                TEL :7055695");
		System.out.println("---------------------------------------------------");
		System.out.printf("금  액 : 		 		 "+k32_df.format(k32_netPrice)+"원\n");	// 세전 가격을 콤마 찍어 칸에 맞춰 출력
		System.out.printf("부가세 : 		 		  "+k32_df.format(k32_taxPrice)+"원\n");	// 세금을 콤마 찍어 칸에 맞춰 출력
		System.out.printf("합  계 : 				 "+k32_df.format(k32_Price)+"원\n");	// 소비자가격을 콤마 찍어 칸에 맞춰 출력
		System.out.println("---------------------------------------------------");
		System.out.println("우리카드");
		System.out.println("카드번호 : 5387-20**-****-4613(S)          일시불");
		System.out.println("거래일시 : " + k32_sdt.format(k32_calt.getTime()));		// 현재 시각을 형태에 맞게 칸에 맞춰 출력
		System.out.println("승인번호 : 70404427");
		System.out.println("거래번호 : 357734873739");
		System.out.println("매입 : 비씨카드사      가맹 : 720068568");
		System.out.println("알림 : EDC매출표");
		System.out.println("문의 : TEL)1544-4700");
		System.out.println("---------------------------------------------------");
		System.out.println("                 * 감사합니다 *");
		System.out.println("                              표준V2.08_20200212");
	}
	
	public static int k32_netPrice(int k32_Price, double k32_taxRate) { // 세전 가격을 구하는 함수 선언(매개변수 2개 > 정수형 소비자가격, 실수형 세율)
		return (int) (k32_Price * 10 / (1 + k32_taxRate) /10);	// 리턴값 : 소비자가격 * 10 / (1+세율) / 10 > 세금은 무조건 올림
		
	}

}
