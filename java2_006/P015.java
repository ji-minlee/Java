package java2_006;
//성적 집계표 출력(다수 페이지) / 20220417 / k32_이지민 / 주석에는 k32_생략
public class P015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_iPerson = 60;		// 총 인원수 입력, 정수형, 200명
		int k32_onePagePerson = 30;	// 한페이지당 보여줄 인원수 입력, 정수형, 30명
		//생성자, k32_iPerson, k32_onepagePerson를 변수로 받는 메소드 선언, k32_inData로 사용
		P015_InputData k32_inData = new P015_InputData(k32_iPerson, k32_onePagePerson);
		
		String k32_time1 = k32_inData.k32_printDate();	//현재시간 설정해둔 포멧에 맞게 출력해서 문자열에 입력
		//정수형 배열, 총 몇페이지(200)가 나오며, 각 페이지마다 몇명이 표시될지 담는다. {30, 30, 30, 30, 30, 30, 20} 형태로 담길 예정
		int[] k32_personGroupArray = k32_inData.k32_perPagePerson();
		
		for (int k32_i = 0; k32_i < k32_personGroupArray.length; k32_i++) {//총 페이지수 만큼 반복 (for문)
			// 각 페이지 별로 시작하는 숫자를 리턴, 현재 몇번째 for문인지(k32_i)를 변수로 받는다. 1페이지 0, 2페이지 30 .. 마지막 180
			int k32_startNumber = k32_inData.k32_currentStartNumber(k32_i);
			
			for (int k32_j = 0; k32_j < k32_personGroupArray[k32_i]; k32_j++) { // 해당 페이지의 인원수 만큼 반복 (for문) 평소에 30번, 마지막은 20번 반복
				String k32_name = String.format("이지%03d", (k32_startNumber + k32_j + 1));	//문자열 이름생성, 1번부터 시작이라 + 1
				//랜덤 함수는 0이상 ~ 1미만의 double형 수를 무작위로 생성, 0부터 100사이를 만들기위해 곱하기 100실시
				int k32_kor = (int)(Math.random() * 100);	// 국어점수 만들기, 실수형 > 정수형으로 형변환
				int k32_eng = (int)(Math.random() * 100);	// 영어점수 만들기, 실수형 > 정수형으로 형변환
				int k32_math = (int)(Math.random() * 100);	// 수학점수 만들기, 실수형 > 정수형으로 형변환
				// 위에서 생성한 값들을 받는 다른 클래스의 메소드로 보냄, 숫자에 1더한 이유는 1번부터 시작이기 때문이다.
				k32_inData.k32_SetDate(k32_startNumber + k32_j + 1, k32_name,k32_kor,k32_eng,k32_math);
			}
			
			System.out.printf("PAGE: %d       출력일자 :"  + k32_time1 + "\n", k32_i + 1);	//현재 페이지(0이라 + 1)와 날짜를 출력한다.
			System.out.println("=================================================");
			System.out.printf("%-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s\n","번호","이름","국어","영어","수학","총점","평균");	//구분 출력
			System.out.println("=================================================");
			
			
			for (int k32_k = 0; k32_k < k32_personGroupArray[k32_i]; k32_k++) {// 해당 페이지의 인원수 만큼 반복 (for문) 평소에 30번, 마지막은 20번 반복
				// k32_k + k32_startNumber는 페이지 시작번호 + 내가 페이지에서 몇번째, 그럼 누적 번호가 된다.1부터 30, 30 ~ 60 .. 180 ~ 200으로 늘어남
				// 성적배열에서 내 성적을 꺼내온다. 배열이여서 +1은 안했으며, 각 배열의 크기는 200이다.
				System.out.printf("%03d %5.5s  %3d     %3d    %3d    %3d    %.2f\n",
						k32_inData.k32_i[k32_k + k32_startNumber], k32_inData.k32_name[k32_k + k32_startNumber],
						k32_inData.k32_kor[k32_k + k32_startNumber], k32_inData.k32_eng[k32_k + k32_startNumber],
						k32_inData.k32_math[k32_k + k32_startNumber], k32_inData.k32_sum[k32_k + k32_startNumber],
						k32_inData.k32_avg[k32_k + k32_startNumber]);
			}
			System.out.println("=================================================");
			
			System.out.println("현재페이지");
			//현재 페이지의 과목별 성적합을 보여준다. k32_inData 클래스에서 k32_curSubjectSum 메소드에 k32_i(몇 페이지)와 각 성적의 배열을 보내주고, 과목별 성적합을 리턴.
			//평균은 실수형이기 때문에 k32_curAveSum의 메소드 따로 생성
			System.out.printf("%-2.2s         %4d   %4d   %4d   %4d   %.2f\n", "합계",k32_inData.k32_curSubjectSum(k32_i, k32_inData.k32_kor),
					k32_inData.k32_curSubjectSum(k32_i, k32_inData.k32_eng), k32_inData.k32_curSubjectSum(k32_i, k32_inData.k32_math),
					k32_inData.k32_curSubjectSum(k32_i, k32_inData.k32_sum), k32_inData.k32_curAvgSum(k32_i, k32_inData.k32_avg));
			
			//현재 페이지의 과목별 평균을 보여준다. k32_inData 클래스에서 k32_cursubjectAve 메소드에 k32_i(몇 페이지)와 각 성적의 배열을 보내주고, 과목별 평균을 리턴.
			//평균은 실수형이기 때문에 k32_curaveAvg의 메소드 따로 생성
			System.out.printf("%-2.2s        %4.2f  %4.2f  %4.2f  %4.2f   %.2f\n", "평균",k32_inData.k32_cursubjectAvg(k32_i, k32_inData.k32_kor),
					k32_inData.k32_cursubjectAvg(k32_i, k32_inData.k32_eng), k32_inData.k32_cursubjectAvg(k32_i, k32_inData.k32_math),
					k32_inData.k32_cursubjectAvg(k32_i, k32_inData.k32_sum), k32_inData.k32_curaveAvg(k32_i, k32_inData.k32_avg));
			
			System.out.println("=================================================");
			
			//지금까지 페이지의 과목별 성적합을 보여준다. k32_inData 클래스에서 k32_totalSubjectSum 메소드에 k32_i(몇 페이지)와 각 성적의 배열을 보내주고, 과목별 성적합을 리턴.
			//평균은 실수형이기 때문에 k32_totalAveSum의 메소드 따로 생성
			System.out.println("누적페이지");
			System.out.printf("%-2.2s        %4d    %4d   %4d   %4d   %.2f\n", "합계",k32_inData.k32_totalSubjectSum(k32_i, k32_inData.k32_kor),
					k32_inData.k32_totalSubjectSum(k32_i, k32_inData.k32_eng), k32_inData.k32_totalSubjectSum(k32_i, k32_inData.k32_math),
					k32_inData.k32_totalSubjectSum(k32_i, k32_inData.k32_sum), k32_inData.k32_totalAvgSum(k32_i, k32_inData.k32_avg));
			
			//지금까지 페이지의 과목별 평균을 보여준다. k32_inData 클래스에서 k32_totalsubjectAve 메소드에 k32_i(몇 페이지)와 각 성적의 배열을 보내주고, 과목별 평균을 리턴.
			//평균은 실수형이기 때문에 k32_totalaveAve의 메소드 따로 생성
			System.out.printf("%-2.2s       %4.2f   %4.2f   %4.2f  %4.2f   %.2f\n\n\n", "평균",k32_inData.k32_totalsubjectAvg(k32_i, k32_inData.k32_kor),
					k32_inData.k32_totalsubjectAvg(k32_i, k32_inData.k32_eng), k32_inData.k32_totalsubjectAvg(k32_i, k32_inData.k32_math),
					k32_inData.k32_totalsubjectAvg(k32_i, k32_inData.k32_sum), k32_inData.k32_totalaveAvg(k32_i, k32_inData.k32_avg));
			
		}
	}

}
