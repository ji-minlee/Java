package java2_006;
//클래스 만들기 / 20220417 / k32_이지민 / 주석에서 k32_생략
import java.text.SimpleDateFormat;
import java.util.Date;

public class P013_InputData {
	int k32_Person;		// 정수형 변수 선언
	int [] k32_i;		// 정수형 배열 선언
	String [] k32_name;	// 문자열 배열 선언
	int [] k32_kor;		// 정수형 배열 선언
	int [] k32_eng;		// 정수형 배열 선언
	int [] k32_math;		// 정수형 배열 선언
	int [] k32_sum;		// 정수형 배열 선언
	double [] k32_avg;	// 실수형 배열 선언
	
	P013_InputData(int k32_iPerson) {	//받아온 인원수 크기만큼의
		k32_i = new int[k32_iPerson];	// 정수형 배열 생성
		k32_name = new String[k32_iPerson];	// 문자열 배열 생성
		k32_kor = new int[k32_iPerson];	// 정수형 배열 생성
		k32_eng = new int[k32_iPerson];	// 정수형 배열 생성
		k32_math = new int[k32_iPerson];	// 정수형 배열 생성
		k32_sum = new int[k32_iPerson];	// 정수형 배열 생성
		k32_avg = new double[k32_iPerson];	// 실수형 배열 생성
		k32_Person = k32_iPerson;	//인원 수 저장
	}
	
	//k32_을 붙이면 중복이라 여기선 생략
	public void k32_SetDate(int i, String name, int kor, int eng, int math) {
		k32_i[i] = i;	// 받아온 번호 배열에 입력
		k32_name[i] = name;	// 받아온 이름 배열에 입력
		k32_kor[i] = kor;	// 받아온 국어 점수 배열에 입력
		k32_eng[i] = eng;	// 받아온 영어 점수 배열에 입력
		k32_math[i] = math;	// 받아온 수학 점수 배열에 입력
		k32_sum[i] = kor + eng + math;	//총합 계산해 배열에 입력
		k32_avg[i] = k32_sum[i] / 3.0;	//평균 계산해 배열에 입력
	}
	
	public int k32_subjectSum(int[] k32_intArr) {	//정수형 배열을 받아와서 과목별 합을 구해주는 메소드 생성
		int k32_sum = 0;	//합을 담을 정수형 변수 선언 및 초기화
		
		for (int k32_i = 0; k32_i < k32_intArr.length; k32_i++) {//과목의 성적 수만큼 반복 (for문)
			k32_sum += k32_intArr[k32_i];	//배열을 돌면서 모든 성적을 더해준다
		}
		return k32_sum;	//이후 합한 값을 리턴한다(정수형)
	}
	
	
	public double k32_avgSum(double[] k32_doubleArr) {//실수형 배열을 받아와서 평균의 합을 구하는 메소드 생성
		double k32_sum = 0;	//평균의 합을 받는 실수형 변수 선언
		
		for (int k32_i = 0; k32_i < k32_doubleArr.length; k32_i++) {	//평균의 수만큼 반복(for문)
			k32_sum += k32_doubleArr[k32_i];	//각 평균 다 더해주기
		}
		return k32_sum;	//평균을 합한 값을 리턴(실수형)
	}
	
	// 39pg ReportSheet, 클래스 만들기
	public double k32_subjectAvg(int[] k32_intArr) {	//정수형 배열을 받아와서 과목별 합의 평균을 구해주는 메소드 생성
		int k32_sum = 0;	//합을 받을 정수형 변수 선언
		
		for (int k32_i = 0; k32_i < k32_intArr.length; k32_i++) {	// 인원수 만큼 반복 (for문)			
			k32_sum += k32_intArr[k32_i];	// 배열을 돌면서 더한다
		}
		return ((double) k32_sum) / k32_Person;	//실수형으로 리턴 위해 앞에 형변환
	}
	
	
	public double k32_avgAvg(double[] k32_doubleArr) {	//실수형 배열을 받아와서 학생들의 평균의 평균을 구해주는 메소드 생성
		double k32_sum = 0;	//실수형 변수 선언, 합할 용도로 사용
		
		for (int k32_i = 0; k32_i < k32_doubleArr.length; k32_i++) {	// 인원수 만큼 반복 (for문)
			k32_sum += k32_doubleArr[k32_i];	//배열을 돌면서 값을 모두 더한다.
		}
		return k32_sum / k32_Person;	//인원수로 나눠 평균의 평균을 구해 리턴한다 (실수형)
	}
		
	public String k32_printDate() {	//날짜를 문자열로 반환하는 메소드 선언, import는 상단에 있다.
		//시간을 받아오면 출력할 포멧, 4자리연도 월 일 24시 시간 분 초
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss");
		
		Date k32_time = new Date();	//Date 함수를 time으로 쓰겠다고 선언
				
		String k32_time1 = format1.format(k32_time);	//받아온 시간을 포멧에 맞게 변경해서 선언한 time1에 입력
		
		return k32_time1;	//위 포멧에 맞춰진 문자열형 날짜 리턴
	}
}
