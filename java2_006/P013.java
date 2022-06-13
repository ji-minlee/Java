package java2_006;
//클래스 만들기 / 20220417 / k32_이지민 / 주석에서 k32_생략
public class P013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_iPerson = 10;	//정수형 변수로 인원수 선언 및 10으로 초기화
		
		P013_InputData k32_inData = new P013_InputData(k32_iPerson);	//다른 클래스를 k32_inData로 선언
		
		for (int k32_i = 0; k32_i < k32_iPerson; k32_i++) {	// 사람 수 만큼 반복 (for문)
			String k32_name = String.format("이지%02d", k32_i);	//문자열 이름생성 (이지 + 넘버 형태)
			//랜덤 함수는 0이상 ~ 1미만의 double형 수를 무작위로 생성, 0부터 100사이를 만들기위해 곱하기 100실시
			int k32_kor = (int)(Math.random() * 100);	// 국어점수 만들기, 실수형 > 정수형으로 형변환
			int k32_eng = (int)(Math.random() * 100);	// 영어점수 만들기, 실수형 > 정수형으로 형변환
			int k32_math = (int)(Math.random() * 100);	// 수학점수 만들기, 실수형 > 정수형으로 형변환
			// 위에서 생성한 값들을 받는 다른 클래스의 메소드로 보냄
			k32_inData.k32_SetDate(k32_i,k32_name,k32_kor,k32_eng,k32_math);	
		}
		
		for (int k32_i = 0; k32_i < k32_iPerson; k32_i++) {	// 받은 인원수 만큼 반복 (for문)
			// 번호, 다른 클래스에서 선언된 배열에서 필요한 값, 양식에 맞춰서 결과 출력(학생별 성적, 총점, 평균)
			System.out.printf("번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n",
					k32_i, k32_inData.k32_name[k32_i], k32_inData.k32_kor[k32_i], k32_inData.k32_eng[k32_i],
					k32_inData.k32_math[k32_i], k32_inData.k32_sum[k32_i], k32_inData.k32_avg[k32_i]);
		}
	}

}
