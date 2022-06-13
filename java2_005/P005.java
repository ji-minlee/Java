package java2_005;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class P005 {
//영수증 출력(2) / 20220418 / k32_이지민 / 주석에서는 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k32_itemName1 = "퓨어에어 비말차단용마스크(최고급형)";	// 제품명1을 문자열 변수로 선언 및 초기화
		String k32_itemCode1 = "1031615";	// 제품코드1을 문자열 변수로 선언 및 초기화
		int k32_price1 = 30000;	// price1을 정수형 변수로 선언 및 초기화
		int k32_amount1 = 8;	// amount1을 정수형 변수로 선언 및 초기화
		int k32_total1 = k32_price1 * k32_amount1;	// 제품1의 합계를 정수형 변수로 선언 

		String k32_itemName2 = "슬라이드식명찰(가로형)(100호)";	// 제품명2를 문자열 변수로 선언 및 초기화
		String k32_itemCode2 = "1008152";	// 제품코드2를 문자열 변수로 선언 및 초기화
		int k32_price2 = 1000;	// price2를 정수형 변수로 선언 및 초기화
		int k32_amount2 = 10;	// amount2를 정수형 변수로 선언 및 초기화
		int k32_total2 = k32_price2 * k32_amount2;	// 제품2의 합계를 정수형 변수로 선언

		String k32_itemName3 = "매직흡착 인테리어후크(알루미늄타입)"; // 제품명3을 문자열 변수로 선언 및 초기화
		String k32_itemCode3 = "1020800";	// 제품코드3을 문자열 변수로 선언 및 초기화
		int k32_price3 = 2000;	// price3을 정수형 변수로 선언 및 초기화
		int k32_amount3 = 50;	// amount3을 정수형 변수로 선언 및 초기화
		int k32_total3 = k32_price3 * k32_amount3;	// 제품3의 합계를 정수형 변수로 선언 

		int k32_totalSum = k32_total1 + k32_total2 + k32_total3;	// 총 합을 정수형 변수로 선언 (제품1, 2, 3의 합계를 더함)
		int k32_netPrice, k32_taxPrice;	// 정수형 변수로 세전 가격, 세금을 선언
		double k32_taxRate = 0.1;	// 실수형 변수로 세율을 선언 및 0.1로 초기화 (10%)

		k32_netPrice = k32_netPrice(k32_totalSum, k32_taxRate);	// 세전 가격을 세전가격을 구하는 함수로 구함
		k32_taxPrice = k32_totalSum - k32_netPrice;	// 세금은 총 합계에서 세전 가격을 뺀 것으로 구함

		DecimalFormat k32_df = new DecimalFormat("###,###,###,###,###");	// DecimalFormat 클래스 가져오기, 형태 지정하기
		Calendar k32_calt = Calendar.getInstance();		// Calendar 클래스로 현재 시간을 가져옴
		SimpleDateFormat k32_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");		// SimpleDateFormat 클래스로 출력 형식 지정 
		//영수증 출력 , 칸에 맞추기
		System.out.println("               \"국민가게, 다이소\"");
		System.out.println("(주)아성다이소_분당서현점");
		System.out.println("전화:031-702-6016");
		System.out.println("본사:서울 강남구 남부순환로 2748 (도곡동)");
		System.out.println("대표:박정부,신호섭 213-81-52063");
		System.out.println("매장:경기도 성남시 분당구 분당로53번길 11 (서현");
		System.out.println("동)");
		System.out.println("================================================");
		System.out.println("          소비자중심경영(CCM) 인증기업");
		System.out.println("        ISO 9001 품질경영시스템 인증기업");
		System.out.println("================================================");
		System.out.printf("          교환/환불 14일(%s)이내,\n", k32_returnDate());	// returnDate를 구하는 함수로 14일 후를 구해 출력
		System.out.println("(전자)영수증, 결제카드 지참 후 구입매장에서 가능");
		System.out.println("        포장/가격 택 훼손시 교환/환불 불가");
		System.out.println("          체크카드 취소 시 최대 7일 소요");
		System.out.println("================================================");
		System.out.printf("[POS 1058231]               %8s\n", k32_sdt.format(k32_calt.getTime()));	// 현재 시간을 지정된 형태로 출력
		System.out.println("================================================");
		System.out.printf("%s%8s%5s%8s\n", k32_subStrByte(k32_itemName1, 26), k32_df.format(k32_price1), 
				k32_df.format(k32_amount1), k32_df.format(k32_total1)); // 칸과 형태에 맞게 제품명, 단가, 갯수, 합계 출력
		System.out.printf("[%s]\n", k32_itemCode1);	// 제품 코드 출력
		System.out.printf("%s%8s%5s%8s\n", k32_subStrByte(k32_itemName2, 26), k32_df.format(k32_price2),
				k32_df.format(k32_amount2), k32_df.format(k32_total2));	// 칸과 형태에 맞게 제품명, 단가, 갯수, 합계 출력
		System.out.printf("[%s]\n", k32_itemCode2);	// 제품 코드 출력
		System.out.printf("%s%8s%5s%8s\n", k32_subStrByte(k32_itemName3, 26), k32_df.format(k32_price3),
				k32_df.format(k32_amount3), k32_df.format(k32_total3));	// 칸과 형태에 맞게 제품명, 단가, 갯수, 합계 출력
		System.out.printf("[%s]\n", k32_itemCode3);	// 제품 코드 출력
		System.out.printf("              과세합계            %13s\n", k32_df.format(k32_netPrice));	// 세전가격을 형태에 맞게 출력
		System.out.printf("                부가세            %13s\n", k32_df.format(k32_taxPrice));	// 세금을 형태에 맞게 출력
		System.out.println("------------------------------------------------");
		System.out.printf("판매합계                          %13s\n", k32_df.format(k32_totalSum));	// 총 합 (소비자가격)을 형태에 맞게 출력
		System.out.println("================================================");
		System.out.printf("신용카드                          %13s\n", k32_df.format(k32_totalSum));	// 총 합 (소비자가격)을 형태에 맞게 출력	
		System.out.println("------------------------------------------------");
		System.out.println("우리카드                       538720**********");	
		System.out.printf("승인번호 77982843(0)          승인금액 %8s\n", k32_df.format(k32_totalSum));	// 총 합 (소비자가격)을 형태에 맞게 출력
		System.out.println("================================================");
		System.out.printf("         %10s 분당서현점\n", k32_sdt.format(k32_calt.getTime()));	// 현재 시간을 지정된 형태로 출력
		System.out.println("상품 및 기타 문의 : 1522-4400");
		System.out.println("멤버십 및 샵다이소 관련 문의 : 1599-2211");
		System.out.println("       ||||||||||||||||||||||||||||||||||");
		System.out.println("               2112820610158231");
		System.out.println("------------------------------------------------");
		System.out.println("◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서");
		System.out.println("  회원가입 후 다양한 혜택을 누려보세요! ◈");

	}
	
	public static String k32_subStrByte(String k32_str, int k32_cutlength) { // 바이트 단위로 자르는 함수를 선언(매개변수2>문자열 변수(변경할 문자열), 정수형 변수(바이트 크기)
		StringBuffer k32_subStr = new StringBuffer(k32_cutlength);	//StringBuffer 선언 (문자열을 추가하거나 변경할 때 주로 사용하는 자료형) 
		for (int k32_i = k32_cutlength - k32_str.getBytes().length; k32_i <= k32_cutlength; k32_i++) {	// 정수형 변수 i가 cutlength - str.getBytes().length부터 cutlength까지
			k32_str = k32_str + " ";	// 남은 칸만큼 blank 추가										// 1씩 증가하며 반복(for문)
		}

		int k32_nCount = 0;		// 정수형 변수 nCount 선언 및 0으로 초기화
		for (char k32_ch : k32_str.toCharArray()) {	// 문자열 str을 char형 배열로 바꾸면서
			k32_nCount += String.valueOf(k32_ch).getBytes().length;	// nCount에 ch를 문자열로 바꾼 후 바이트의 크기를 구한 것 누적합
			if (k32_nCount > k32_cutlength)	// nCount가 cutlength보다 크면 
				break;	// 그만한다 (중지)
			k32_subStr.append(k32_ch);	// 크지 않으면 subStr에 ch를 추가한다(add)

		}
		  if(k32_subStr.toString().getBytes().length == 19) {	//subStr의 바이트 크기가 19일 때
			  k32_subStr.append(" ");	// blank를 추가한다
           }
		return k32_subStr.toString();	// 리턴값 : subStr
	}

	public static int k32_netPrice(int k32_totalSum, double k32_taxRate) {	//세전 가격을 구하는 함수 선언(매개변수 2개 > 정수형 소비자가격, 실수형 세율)
		return (int) (k32_totalSum / (1 + k32_taxRate));	// 리턴값 : 소비자가격 / (1+세율) > 세금은 무조건 올림

	}

	public static String k32_returnDate() {	// 교환/환불 가능일자를 구하는 메소드를 선언
		Calendar k32_cal = Calendar.getInstance();	// Calendar 클래스로 현재 시간을 가져옴
		k32_cal.setTime(new Date());	// 현재 시간 setTime 형식으로 지정
		SimpleDateFormat k32_df = new SimpleDateFormat("MM월dd일"); 	// SimpleDateFormat 클래스로 출력 형식 지정 
		k32_cal.add(Calendar.DATE, 14);	// 현재 시간의 날짜에 14일 더한다
		String k32_returnDate = k32_df.format(k32_cal.getTime());	// 14일을 더한 날짜를 returnDate문자열로 선언 및 초기화
		return k32_returnDate;	// 리턴값 : returnDate

	}
}
