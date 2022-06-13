package java2_003;
// java 내장 함수를 불러오기 위해 import 사용
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P009 {
// 3. 환율 계산 1) 단순 환전 계산, 2) 수수료 포함 환전 계산 
// 4. 유용한 것 2) 콤마찍기, 3) 현재일자 시간
// 20220414, k32_이지민, 정수형과 실수형을 넘나들며 계산한다. 은행은 절대로 손해를 보면 안된다. 수수료를 잊지 말고 계산하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_MyWon = 1000000;	// 환전할 돈 100만원
		double k32_MoneyEx = 1238.21;	// 달러 환율
		double k32_commission = 0.003;	// 환전 수수료 (0.3%)

	// 단순 환전 계산(수수료 없이 계산)
		int k32_usd = (int) (k32_MyWon / k32_MoneyEx);	// 전체 금액을 환율로 나눔 
														// 최종 결과를 정수형으로 만들면 버림처리가 됨(소수점 아래 자리 절삭)
		int k32_remain = (int) (k32_MyWon - k32_usd * k32_MoneyEx);		// 고객에게 돌려줄 잔돈(환전을 하고 남은 돈) > 정수형 변수 (2324.22 > 0.22는 줄 수 없다)
																		// 전체 금액 - 달러 금액(달러*환율)로 계산 
		System.out.printf("*********************************************************************************\n");
		System.out.printf("*                                수수료 없이 계산                               *\n");
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 잔돈: %d원\n", k32_MyWon, k32_usd, k32_remain);	//단순 환전 계산 결과 출력
		System.out.printf("*********************************************************************************\n");
	
	// 수수료 계산(환전할 때 수수료는 필수!)
		double k32_ComPerOne = k32_MoneyEx * k32_commission;	// 1달러당 수수료를 실수형 변수로
																// 달러 환율 * 환전 수수료
		double k32_totalcom = k32_usd * k32_ComPerOne;		// 전체 수수료는 환전한 달러 금액 * 달러당 수수료
		System.out.printf("*********************************************************************************\n");
		System.out.printf("*                                   수수료 계산                                 *\n");
		System.out.printf("총 수수료: %f원 => 미화: %d달러, 달러당 수수료: %f원\n", k32_totalcom, k32_usd, k32_ComPerOne);	// 수수료 계산 결과 출력
		System.out.printf("*********************************************************************************\n");

	// 수수료 적용 환전	
		int k32_i_totalcom;		// 오류가 발생! 다시 전체 수수료를 계산 하자
								// 먼저 달러를 다 계산하고 수수료를 빼려면 어마어마한 오차가 발생
		if (k32_totalcom != (double) ((int) k32_totalcom)) {	// (정수)전체 수수료가 (실수)전체 수수료와 다르면 
			k32_i_totalcom = (int) k32_totalcom + 1;	// (new)전체 수수료 = (정수) 전체 수수료 +1 > 은행은 손해를 볼 수 없다. 더 받아야 한다.(올림처리) 
		} else {		// (정수) 전체 수수료가 (실수)전체 수수료와 같으면 > 소수점 이하의 자리가 없는 것
			k32_i_totalcom = (int) k32_totalcom;	// (new)전체 수수료 = (정수) 전체 수수료
		}
		System.out.printf("*********************************************************************************\n");
		System.out.printf("*                                수수료 적용 환전                               *\n");
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", k32_i_totalcom, k32_usd, k32_ComPerOne);	// 수수료 적용 환전 결과 출력

		k32_remain = (int) (k32_MyWon - k32_usd * k32_MoneyEx - k32_i_totalcom);	// 잔돈을 전체 금액 - 달러 금액(달러*환율)로 계산/ 소수점 아래는 줄 수 없으므로 정수형
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 수수료청구: %d원 잔돈: %d원\n", k32_MyWon, k32_usd, k32_i_totalcom,
				k32_remain);	// 총 환전 금액 및 수수료, 잔돈 결과 출력
		System.out.printf("*********************************************************************************\n");

	// 정확한 수수료 적용 환전(잔돈이 -인 것은 말이 안된다!)	
		k32_usd = (int) (k32_MyWon / (k32_MoneyEx + k32_ComPerOne));	// (1달러당 원화금액 + 1달러당 수수료)를 갖고 실수형 계산을 해야 오차가 발생하지 않음
		k32_totalcom = k32_usd * k32_ComPerOne;		// 전체 수수료 =  (환전한 달러 * 달러당 수수료)를 실수형 계산

		if (k32_totalcom != (double) ((int) k32_totalcom)) {	// (정수)전체 수수료가 (실수)전체 수수료와 다르면 
			k32_i_totalcom = (int) k32_totalcom + 1;	// (new)전체 수수료 = (정수) 전체 수수료 +1 > 은행은 손해를 볼 수 없다. 더 받아야 한다.(올림처리) 
		} else {		// (정수) 전체 수수료가 (실수)전체 수수료와 같으면 > 소수점 이하의 자리가 없는 것
			k32_i_totalcom = (int) k32_totalcom;	// (new)전체 수수료 = (정수) 전체 수수료
		}
		System.out.printf("********************************************************************************\n");
		System.out.printf("*                            (정확한)수수료 적용환전                           *\n");
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", k32_i_totalcom, k32_usd, k32_ComPerOne);	// 정확한 수수료 적용 환전 결과 출력

		k32_remain = (int) (k32_MyWon - k32_usd * k32_MoneyEx - k32_i_totalcom);	// 잔돈을 전체 금액 - 달러 금액(달러*환율)로 계산/ 소수점 아래는 줄 수 없으므로 정수형
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 수수료 청구: %d원, 잔돈: %d원\n", k32_MyWon, k32_usd, k32_i_totalcom,
				k32_remain);		// 총 환전 금액 및 수수료, 잔돈 결과 출력
		System.out.printf("*********************************************************************************\n");
	
	// 콤마 찍기, 날짜 적용
		// 콤마 찍기(DecimalFormat 이용)
		DecimalFormat k32_df = new DecimalFormat("###,###,###,###,###");	// DecimalFormat 클래스 가져오기

		System.out.printf("*********************************************************************************\n");
		System.out.printf("*                             콤마찍기, 날짜 적용                               *\n");
		System.out.printf("총 수수료: %s원 => 미화: %s달러, 달러당 수수료: %s원\n", k32_df.format(k32_i_totalcom), k32_df.format(k32_usd),
			k32_ComPerOne); 	// df.format()을 활용해 콤마를 찍어 결과를 출력한다. (콤마를 찍으면 문자열이므로 %s)

		k32_remain = (int) (k32_MyWon - k32_usd * k32_MoneyEx - k32_i_totalcom);	// 잔돈을 전체 금액 - 달러 금액(달러*환율)로 계산/ 소수점 아래는 줄 수 없으므로 정수형
		System.out.printf("총 한화환전금액: %s원 => 미화: %s달러, 수수료 청구: %s원, 잔돈: %s원\n", k32_df.format(k32_MyWon), k32_df.format(k32_usd),
				k32_df.format(k32_i_totalcom), k32_df.format(k32_remain));	// df.format()을 활용해 콤마를 찍어 결과를 출력한다 (콤마를 찍으면 문자열이므로 %s)

		// 현재 날짜, 시간 찍기
		Calendar k32_calt = Calendar.getInstance();		// Calendar 클래스로 현재 시간을 가져옴
		SimpleDateFormat k32_sdt = new SimpleDateFormat("YYYY:MM:dd HH:mm:ss");		// SimpleDateFormat 클래스로 출력 형식 지정 
		System.out.printf("최종실행시간: %s\n", k32_sdt.format(k32_calt.getTime()));

		System.out.printf("*********************************************************************************\n");
}

}
