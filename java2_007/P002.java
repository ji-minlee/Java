package java2_007;

import java.text.DecimalFormat;

public class P002 {
//고정길이에서 필드 추출 정리 / 20220420 / k32_이지민 / 주석에는 k32_생략 / substring 활용 / 상투과자, 자일로스, 동원양반
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] k32_OneRec = {	// 5강의 이마트 영수증의 내용을 가져온 후, 임의로 오류를 만든다. (합계의 가격을 일부러 틀리게 만든다)
				  "  해피홈 SAFE365  1,500,000   2 3,000,000",
				  "  (G)LH원형유리화     6,900   1     6,900",
				  "  상투과자E           5,980   1     6,200",
				  "  더블링 나일론       3,300   1     3,300",
				  "  해피홈 SAFE 핸      5,500   2    11,000",
				  "  농심 신라면120g     3,360   1     3,360",
				  "* (대)국내산삼겹      6,610   1     6,610",
				  "  오뚜기 진비빔면     2,750   1     2,750",
				  "* GAP 죽장사과 4-    10,800   1    10,800",
				  "* 순 유기농 바나      4,980   1     4,980",
				  "  피코크 탄두리     248,000  10 2,480,000",
				  "  (달콤)순살닭강      7,920   1     7,920",
				  "  DZ주니어양말3족     4,980   1     4,980",
				  "  DZ주니어양말3족     4,980   1     4,980",
				  "  프리미엄생연어      7,130   1     7,130",
				  "  피코크 들깨미역     3,980   1     3,980",
				  "* 남양 맛있는우유     4,480   1     4,480",
				  "  녹차원흑당시럽1     4,980   1     4,980",
				  "  진라면소컵(매)6     3,210   1     3,210",
				  "  케라시스 앰플       6,950   1     6,950",
				  "  푸르밀 미숫가루     2,980   2     5,960",
				  "  자일로스갈색설      1,990   1     3,000",
				  "  CJ 비비고칩 20G     1,980   1     1,980",
				  "  피코크 들깨미역     3,980   1     3,980",
				  "  흑원당 말차 밀      4,480   1     4,480",
				  "* 1+ 등급란 10개      9,480   2    18,960",
				  "  동원양반볶음김      7,980   1     5,000",
				  "  [트레비]레몬300       850 500   425,000",
				  "  듀라셀 디럭스      15,200   1    15,200",
				  "* 파머스픽 밤 고     10,980   1    10,980",
				  "  [바이오퍼블릭]     98,000 100 9,800,000",
				  "* [냉동][태국]노     12,800   1    12,800"};
		
		DecimalFormat k32_df = new DecimalFormat("###,###,###,###");	// 숫자에 콤마 찍기 > 가격은 콤마를 찍어줘야 보기 쉽다
		
		for (int k32_i = 0; k32_i < k32_OneRec.length; k32_i++) {	// 항목의 개수만큼 1씩 증가하며 반복 (for문)
			//System.out.print(k32_OneRec[k32_i].length() + " ");
			String k32_sumstr = k32_OneRec[k32_i].substring(k32_OneRec[k32_i].length()-10, k32_OneRec[k32_i].length()) + " ";	// 합계부분 문자열 자르고 뒤에 한칸 추가			
			String k32_numberstr = k32_OneRec[k32_i].substring(k32_OneRec[k32_i].length()-14, k32_OneRec[k32_i].length()-10) + " ";		// 수량 부분 문자열 자르고 뒤에 한칸 추가
			String k32_pricestr = k32_OneRec[k32_i].substring(k32_OneRec[k32_i].length()-24, k32_OneRec[k32_i].length()-14) + " ";	// 단가 부분 문자열 자르고 뒤에 한칸 추가
			String k32_errorstr = k32_OneRec[k32_i].substring(0, k32_OneRec[k32_i].length()-10) + " ";	// 오류 확인 위해 처음 ~ 합계 부분 앞까지 자르기
			int k32_sum = Integer.parseInt(k32_sumstr.replaceAll(",","").trim());	// 합계부분 문자열 ',' 제거 후 공백 자르기
			int k32_number = Integer.parseInt(k32_numberstr.trim());	// 수량 부분 문자열 ',' 제거 후 공백 자르기
			int k32_price = Integer.parseInt(k32_pricestr.replaceAll(",", "").trim());	// 단가 부분 문자열 ',' 제거 후 공백 자르기
			
			if (k32_sum != k32_price * k32_number) {	// 합계가 단가 * 수량과 같지 않으면
				System.out.println("******************************************");
				System.out.printf("오류[%s]\n", k32_OneRec[k32_i]);		// 오류 출력
				System.out.printf("수정[%s%9s]\n", k32_errorstr, k32_df.format(k32_price * k32_number));	// 오류부분 올바로 수정해 출력
				System.out.println("******************************************");
				
				
			}
		}
		
	}
		
}

