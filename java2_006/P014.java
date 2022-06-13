package java2_006;
//성적 집계표 출력(1페이지) / 20220417 / k32_이지민 / 주석에는 k32_생략
public class P014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_iPerson = 30;	//정수형 변수 선언 및 30으로 초기화
		
		P013_InputData k32_inData = new P013_InputData(k32_iPerson);	//다른 클래스를 k32_inData로 선언
		
		
		String k32_time1 = k32_inData.k32_printDate();	//현재시간 설정해둔 포멧에 맞게 출력해서 문자열에 입력
		
		for (int k32_i = 0; k32_i < k32_iPerson; k32_i++) {	//총 인원수 만큼 반복 (for문)
			String k32_name = String.format("이지%02d", k32_i);	//문자열 이름생성 (이지 + 넘버 형태)
			//랜덤 함수는 0이상 ~ 1미만의 double형 수를 무작위로 생성, 0부터 100사이를 만들기위해 곱하기 100실시
			int k32_kor = (int)(Math.random() * 100);	// 국어점수 만들기, 실수형 > 정수형으로 형변환
			int k32_eng = (int)(Math.random() * 100);	// 영어점수 만들기, 실수형 > 정수형으로 형변환
			int k32_math = (int)(Math.random() * 100);	// 수학점수 만들기, 실수형 > 정수형으로 형변환
			// 위에서 생성한 값들을 받는 다른 클래스의 메소드로 보냄
			k32_inData.k32_SetDate(k32_i,k32_name,k32_kor,k32_eng,k32_math);	
		}
		


		System.out.println("           출력일자 :"  + k32_time1);	// 출력일자를 상단에 출력
		System.out.println("================================================");
		System.out.printf("%-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s\n","번호","이름","국어","영어","수학","총점","평균");	// 결과 출력 상단 메뉴바
		System.out.println("================================================");
		
		for (int k32_i = 0; k32_i < k32_iPerson; k32_i++) {	//총 인원수 만큼 반복 (for문)
			// 선언한 클래스에서 배열에 담아진 성적을 for문을 통해 출력 (인원별 성적과 총합, 평균이 한줄로 출력)
			System.out.printf("%03d %5.5s  %3d     %3d    %3d     %3d   %.2f\n",
					k32_i + 1, k32_inData.k32_name[k32_i], k32_inData.k32_kor[k32_i], k32_inData.k32_eng[k32_i],
					k32_inData.k32_math[k32_i], k32_inData.k32_sum[k32_i], k32_inData.k32_avg[k32_i]);
		}
		System.out.println("===============================================");
		//과목별 총합을 보여주기위해 다른클래스의 매소드에 과목별 점수 배열을 입력값으로 입력하고, 결과를 리턴받아 포멧에 맞게 출력한다.
		System.out.printf("%-2.2s        %3d    %3d    %3d    %4d  %.2f\n", "합계",k32_inData.k32_subjectSum(k32_inData.k32_kor),
				k32_inData.k32_subjectSum(k32_inData.k32_eng), k32_inData.k32_subjectSum(k32_inData.k32_math),
				k32_inData.k32_subjectSum(k32_inData.k32_sum), k32_inData.k32_avgSum(k32_inData.k32_avg));
		//과목별 평균을 보여주기위해 다른클래스의 매소드에 과목별 점수 배열을 입력값으로 입력하고, 결과를 리턴받아 포멧에 맞게 출력한다.
		System.out.printf("%-2.2s       %3.2f   %3.2f   %3.2f   %3.2f  %.2f\n", "평균",k32_inData.k32_subjectAvg(k32_inData.k32_kor),
				k32_inData.k32_subjectAvg(k32_inData.k32_eng), k32_inData.k32_subjectAvg(k32_inData.k32_math),
				k32_inData.k32_subjectAvg(k32_inData.k32_sum), k32_inData.k32_avgAvg(k32_inData.k32_avg));
	}

}
