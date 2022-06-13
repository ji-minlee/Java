package java2_006;
//성적 집계표 출력(다수 페이지) / 20220417 / k32_이지민 / 주석에는 k32_생략
import java.text.SimpleDateFormat;
import java.util.Date;

public class P015_InputData {
	int k32_totalPerson;	// 총 인원수 정수형 변수 선언
	int k32_pgPerson;	// 페이지 당 인원수 정수형 변수 선언
	int [] k32_i;	// 사람 번호 정수형 배열 선언
	String [] k32_name;	// 사람 이름 문자열 배열 선언
	int [] k32_kor;	// 국어성적 정수형 배열 선언
	int [] k32_eng;	// 영어성적 정수형 배열 선언
	int [] k32_math;	// 수학성적 정수형 배열 선언
	int [] k32_sum;	// 학생의 국영수 합 정수형 배열 선언
	double [] k32_avg;	//학생의 평균 정수형 배열 선언
	int[] k32_personGroupArray;	//페이지당 인원수 담을 정수형 배열 선언
	
	P015_InputData(int k32_iPerson, int k32_onePagePerson) {	//생성자, 총인원과 페이지당 인원을 받아온다.
		//받아온 인원수 크기만큼의
		k32_totalPerson = k32_iPerson;	
		k32_pgPerson = k32_onePagePerson;
		k32_i = new int[k32_iPerson];	// 정수형 배열 생성
		k32_name = new String[k32_iPerson];	// 문자열 배열 생성
		k32_kor = new int[k32_iPerson];	// 정수형 배열 생성
		k32_eng = new int[k32_iPerson];	// 정수형 배열 생성
		k32_math = new int[k32_iPerson];// 정수형 배열 생성
		k32_sum = new int[k32_iPerson];	// 정수형 배열 생성
		k32_avg = new double[k32_iPerson];	// 실수형 배열 생성
		 
		if (k32_iPerson % k32_onePagePerson == 0) {	// 총 인원을 페이지당 인원(30)으로 나눠진다면
			k32_personGroupArray = new int[(k32_iPerson / k32_onePagePerson)];	//페이지를 추가할 필요없다.
		} else {	// 총 인원을 페이지당 인원(30)으로 나눠지지 않는다면
			k32_personGroupArray = new int[(k32_iPerson / k32_onePagePerson) + 1];
			// 페이지 수는 200/30 = 6(정수) +1을 해서 총 7페이지로 맞춰준다.
		}
	}
	
	public String k32_printDate() {	//현재 시간을 포멧에 맞게 리턴하는 메소드 선언(문자열)
		
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss");	//시간의 형태를 정한다.
		
		Date k32_time = new Date();	//현재시간을 가져온다.
			
		String k32_time1 = format1.format(k32_time);	//선언한 문자열에 포멧에 맞춰 시간을 입력한다.
		
		return k32_time1;	//입력한 시간문자열을 리턴
	}
	
	public int[] k32_perPagePerson() {	// 각 페이지 별로 몇명이 있는지 입력
		
		for (int k32_i = 0; k32_i < k32_personGroupArray.length ; k32_i++) {	// 페이지당 인원 수 크기만큼 반복 (for문)
			if (k32_i == k32_personGroupArray.length - 1 ) {	// 마지막장이라면, 
				if (k32_totalPerson % k32_pgPerson == 0) {
					k32_personGroupArray[k32_i] = k32_pgPerson;
				} else {
					k32_personGroupArray[k32_i] = k32_totalPerson % k32_pgPerson;	//페이지당 인원으로 나눈 나머지를 입력(20)
				}				
			if (k32_totalPerson == k32_pgPerson) {
				k32_personGroupArray[k32_i] = k32_pgPerson;
			} else {
				k32_personGroupArray[k32_i] = k32_totalPerson % k32_pgPerson;
			}
			} else {	//마지막장이 아니라면 
				k32_personGroupArray[k32_i] = k32_pgPerson;	//페이지당 인원수를 입력
			}
		}
		return k32_personGroupArray;	// 작성한 배열을 리턴한다.(정수형)
	}
	
	//페이지 별로 시작인원의 숫자를 구하여 정수형으로 리턴하는 메소드
	public int k32_currentStartNumber(int k32_ii) {	//첫페이지면 0, 두번째면 1... 이런식으로 변수를 받아온다.
		int k32_startNum = 0;	// 출력할 페이지별 첫 번호를 담을 정수형 변수 선언 및 0으로 초기화
		
		for (int k32_i = 0; k32_i < k32_ii; k32_i++) {	//페이지수보다 -1 만큼 반복 (for문) 1페이지면 0번, 2페이지면 1번, ... 7페이지면 6번
			k32_startNum += k32_personGroupArray[k32_i];	// 첫페이지 0, 2페이지 30, 3페이지 60, ... 마지막페이지 180
		}
		return k32_startNum;	//정수형 값을 리턴
	}
	
	//매개변수에 k32_붙이면 배열명과 같아져서 생략
	public void k32_SetDate(int i, String name, int kor, int eng, int mat) {	//받아온 이름과 성적 정보를 각 배열에 담아주는 메소드 선언
		k32_i[i - 1] = i;	// 번호 입력, 배열이라 -1
		k32_name[i - 1] = name;	// 이름 입력
		k32_kor[i - 1] = kor;	// 국어 점수 입력
		k32_eng[i - 1] = eng;	// 영어 점수 입력
		k32_math[i - 1] = mat;	// 수학 점수 입력
		k32_sum[i - 1] = kor + eng + mat;	//성적 합 입력
		k32_avg[i - 1] = k32_sum[i - 1] / 3.0; //3과목이고 실수형이기 때문에 3.0으로 표기
	}
	
	//현재 페이지의 과목별 성적 합을 구하는 메소드, 현재페이지 -1 의 정수와, 과목별 성정 배열을 가져온다.
	public int k32_curSubjectSum(int k32_cycNumber, int[] k32_array) {
		int k32_sum = 0, k32_startNum = 0;	//합과 시작번호를 담을 정수형 변수 선언 및 0으로 초기화
		
		for (int k32_i = 0; k32_i < k32_cycNumber; k32_i++) {	//페이지의 번호 -1 만큼 반복 (for문)
			
			k32_startNum += k32_personGroupArray[k32_i];	//1페이지면 0, 2페이지면 30, .. 마지막페이지 180
		}
		//페이지의 시작과 끝 번호 사이를 도는 for문 작성, 1페이지(0 ~ 29), 2페이지(30 ~59) .. 마지막(180 ~ 199)
		for (int k32_i = k32_startNum; k32_i < k32_startNum + k32_personGroupArray[k32_cycNumber]; k32_i++) {
			
			k32_sum += k32_array[k32_i];	// 200크기의 배열에서 원하는 페이지에 존재하는 인원들의 해당 과목의 합을 구한다.
		}
		return k32_sum;	//정수형 값 리턴
	}
	
	// 위 메소드와 똑같은 원리, 평균의 합은 실수형 배열로 받고 실수형으로 내보내 줘야해서 따로 생성
	public double k32_curAvgSum(int k32_cycNumber, double[] k32_array) {
		double k32_sum = 0;	// 합을 담을 실수형 변수 선언 및 0으로 초기화
		int k32_startNum = 0;	//시작번호를 담을 정수형 변수 선언 및 0으로 초기화
		
		for (int k32_i = 0; k32_i < k32_cycNumber; k32_i++) {	//페이지의 번호 -1 만큼 반복 (for문)
			k32_startNum += k32_personGroupArray[k32_i];	//1페이지면 0, 2페이지면 30, .. 마지막페이지 180
		}
		//페이지의 시작과 끝 번호 사이를 반복 (for문) 1페이지(0 ~ 29), 2페이지(30 ~59) .. 마지막(180 ~ 199)
		for (int k32_i = k32_startNum; k32_i < k32_startNum + k32_personGroupArray[k32_cycNumber]; k32_i++) {
			
			k32_sum += k32_array[k32_i];	// 200크기의 배열에서 원하는 페이지에 존재하는 인원들의 평균의 합을 구한다.
		}
		return k32_sum;	//실수형 값 리턴
	}
	
	//현재 페이지의 평균을 구하는 메소드, 현재페이지 -1 의 정수와, 과목별 성정 배열을 가져온다. 평균이라 double형으로 리턴
	public double k32_cursubjectAvg(int k32_cycNumber, int[] k32_array) {
		int k32_sum = 0, k32_startNum = 0;	//합과 시작번호를 담을 변수 선언 및 0으로 초기화
		
		for (int k32_i = 0; k32_i < k32_cycNumber; k32_i++) {	//페이지의 번호 -1 만큼 반복 (for문)			
			k32_startNum += k32_personGroupArray[k32_i];	//1페이지면 0, 2페이지면 30, .. 마지막페이지 180
		}
		//페이지의 시작과 끝 번호 사이를 반복(for문) 1페이지(0 ~ 29), 2페이지(30 ~59) .. 마지막(180 ~ 199)
		for (int k32_i = k32_startNum; k32_i < k32_startNum + k32_personGroupArray[k32_cycNumber]; k32_i++) {			
			k32_sum += k32_array[k32_i];	// 200크기의 배열에서 원하는 페이지에 존재하는 인원들의 평균의 합을 구한다.
		}
		return ((double) k32_sum) /  k32_personGroupArray[k32_cycNumber];	//합 / 페이지 인원수 한 값을 리턴(실수형)
	}
	
	// 위 메소드와 똑같은 원리, 평균의 합은 실수형 배열로 받고 실수형으로 내보내 줘야해서 따로 생성
	public double k32_curaveAvg(int k32_cycNumber, double[] k32_array) {		
		double k32_sum = 0;	// 합을 담을 실수형 변수 선언 및 0으로 초기화
		int k32_startNum = 0;	//시작번호를 담을 정수형 변수 선언 및 0으로 초기화
		
		for (int k32_i = 0; k32_i < k32_cycNumber; k32_i++) {	//페이지의 번호 -1 만큼 반복 (for문)
			
			k32_startNum += k32_personGroupArray[k32_i];	//1페이지면 0, 2페이지면 30, .. 마지막페이지 180
		}
		//페이지의 시작과 끝 번호 사이를 반복 (for문) 1페이지(0 ~ 29), 2페이지(30 ~59) .. 마지막(180 ~ 199)
		for (int k32_i = k32_startNum; k32_i < k32_startNum + k32_personGroupArray[k32_cycNumber]; k32_i++) {
			
			k32_sum += k32_array[k32_i];	// 200크기의 배열에서 원하는 페이지에 존재하는 인원들의 평균의 합을 구한다.
		}
		return k32_sum /  k32_personGroupArray[k32_cycNumber];	//합 / 페이지 인원수 한 값을 리턴한다.(실수형)
	}
	
	
	// 현재 페이지까지의 누적 성적합, 페이지 -1 정수와, 과목 성적 배열을 가져온다. 
	public int k32_totalSubjectSum(int k32_cycNumber, int[] k32_array) {
		int k32_sum = 0, k32_endNum = 0;	//합과 끝번호를 담을 변수 선언 및 0으로 초기화
		
		for (int k32_i = 0; k32_i < k32_cycNumber + 1; k32_i++) {//0부터 현재페이지번호까지 반복 (for문)(현재 페이지라 +1) 
			
			k32_endNum += k32_personGroupArray[k32_i];	// 1페이지 30, 2페이지 60 .. 마지막페이지 200 이 입력된다.
		}
		 
		
		for (int k32_i = 0; k32_i < k32_endNum; k32_i++) {	// 0부터 1씩증가하며 해당 페이지의 마지막인원의 번호의 -1 까지 반복(for문)
			 												// 1페이지 (0 ~ 29), 2페이지 (0 ~ 59) .. 마지막(0 ~ 199)
			k32_sum += k32_array[k32_i];	// for문에 해당하는 숫자만큼의 성적을 더한다.
		}
		return k32_sum;	//더한값을 리턴 (정수형)
	}
	
	// 현재 페이지까지의 누적 평균합, 페이지 -1 정수와, 과목 성적 배열을 가져온다. 
	public double k32_totalAvgSum(int k32_cycNumber, double[] k32_array) {
		double k32_sum = 0;	// 합을 담을 실수형 변수 선언 및 0으로 초기화
		int k32_endNum = 0;	//끝 번호를 담을 정수형 변수 선언 및 0으로 초기화
		
		for (int k32_i = 0; k32_i < k32_cycNumber + 1; k32_i++) {//0부터 현재페이지번호까지 반복 (for문)(현재 페이지라 +1)
			
			k32_endNum += k32_personGroupArray[k32_i];	// 1페이지 30, 2페이지 60 .. 마지막페이지 200 이 입력된다.
		}
		
		for (int k32_i = 0; k32_i < k32_endNum; k32_i++) {// 0부터 1씩증가하며 해당 페이지의 마지막인원의 번호의 -1 까지 반복 
														  // 1페이지 (0 ~ 29), 2페이지 (0 ~ 59) .. 마지막(0 ~ 199)		
			k32_sum += k32_array[k32_i];	// for문에 해당하는 숫자만큼의 성적을 더한다. 
		}
		return k32_sum;	//실수형 결과 리턴;
	}
	
	// 현재 페이지까지의 누적 합의 평균, 페이지 -1 정수와, 과목 성적 배열을 가져온다. 
	public double k32_totalsubjectAvg(int k32_cycNumber, int[] k32_array) {	
		int k32_sum = 0, k32_endNum = 0;	//합과 페이지의 끝번호를 담을 정수형 변수 선언 및 0으로 초기화
		
		for (int k32_i = 0; k32_i < k32_cycNumber + 1; k32_i++) { //0부터 현재페이지번호까지 반복 (for문)(현재 페이지라 +1)		
			k32_endNum += k32_personGroupArray[k32_i];	// 1페이지 30, 2페이지 60 .. 마지막페이지 200 이 입력된다.
		}
				
		for (int k32_i = 0; k32_i < k32_endNum; k32_i++) {// 0부터 1씩증가하며 해당 페이지의 마지막인원의 번호의 -1 까지 반복(for문) 
														  // 1페이지 (0 ~ 29), 2페이지 (0 ~ 59) .. 마지막(0 ~ 199)
			k32_sum += k32_array[k32_i];	// for문에 해당하는 숫자만큼의 성적을 더한다.
		}
		return ((double) k32_sum) /  k32_endNum;	// 리턴할때 누적합 / 페이지까지 누적인원 한 값을 리턴(실수형)
	}
	
	// 현재 페이지까지의 누적 평균의 평균, 페이지 -1 정수와, 과목 성적 배열을 가져온다. 
	public double k32_totalaveAvg(int k32_cycNumber, double[] k32_array) {
		double k32_sum = 0;	// 합을 담을 실수형 변수 선언 및 0으로 초기화
		int k32_endNum = 0;	//끝 번호를 담을 정수형 변수 선언 및 0으로 초기화
		
		for (int k32_i = 0; k32_i < k32_cycNumber + 1; k32_i++) {//0부터 현재페이지번호까지 반복 (for문)(현재 페이지라 +1)			
			k32_endNum += k32_personGroupArray[k32_i];	// 1페이지 30, 2페이지 60 .. 마지막페이지 200 이 입력된다.
		}
		
		
		for (int k32_i = 0; k32_i < k32_endNum; k32_i++) {// 0부터 1씩증가하며 해당 페이지의 마지막인원의 번호의 -1 까지 반복(for문) 
														  // 1페이지 (0 ~ 29), 2페이지 (0 ~ 59) .. 마지막(0 ~ 199)
			k32_sum += k32_array[k32_i];	// for문에 해당하는 숫자만큼의 성적을 더한다. 
		}
		return k32_sum /  k32_endNum;	// 리턴할때 누적합 / 페이지까지 누적인원 한 값을 리턴 (실수형)
	}
}
