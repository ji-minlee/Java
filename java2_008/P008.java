package java2_008;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P008 {
//감 잡은 내용으로 파일 정제 / 20220421 / k32_이지민 / 주석에는 k32_생략
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k32_f = new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\심화\\실습데이터\\day_data\\THTSKS010H00.dat");
		BufferedReader k32_br = new BufferedReader(new FileReader(k32_f));	// 파일 불러오기
		
		File k32_f1 = new File("C:\\Users\\501-21\\\\Desktop\\kopo32\\Java\\심화\\실습데이터\\day_data\\StockDailyPrice.csv");
		BufferedWriter k32_bw1 = new BufferedWriter(new FileWriter(k32_f1));	// StockDailyPrice 파일 만들기
		
		String k32_readtxt;	// 문자열 텍스트읽기 변수 선언
		int k32_cnt = 0; int k32_wcnt = 0;	// cnt = 기존 파일의 줄을 정수형 변수 선언 및 0으로 초기화
											// wcnt = 새로 만든 파일의 줄을 정수형 변수 선언 및 0으로 초기화
		// 시간 형태 만들기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	// 시간 형태 지정하기
		long k32_startTime = System.currentTimeMillis();	// 코드 실행 전에 시간 받아오기 (시작 시간)
		Date k32_startInDate = new Date(k32_startTime);	// 형태 날짜로 변환
		String k32_startFormat = sdf.format(k32_startInDate);	// 문자열 변수로 형태 변환
		
		while ((k32_readtxt = k32_br.readLine()) != null) {	// 파일에 내용이 있을 때 반복 수행
			StringBuffer k32_s = new StringBuffer();	// StringBuffer 선언
			String [] k32_field = k32_readtxt.split("%_%");	// 구분자 기준으로 나눠 문자열 배열로 선언
			
			// 문자열 배열 길이가 2보다 크고, 필드의 3번째 칸의 ^를 없애고(replace), 양옆 공백 자르고(trim)
			// 문자열이 A로 시작하면(substring, equals)
			if (k32_field.length > 2 && k32_field[2].replace("^", "").trim().substring(0,1).equals("A")) {
				k32_s.append(k32_field[0].replace("^", "").trim());	// 필드의 첫번째 칸의 ^를 없애고(replace) 양옆의 공백을 자른 후(trim) 추가
				for (int k32_j = 1; k32_j < k32_field.length; k32_j++) {	// 정수형 변수가 필드의 길이만큼 1씩 증가하며 반복(for문)
					k32_s.append("," + k32_field[k32_j].replace("^", "").trim());	// ,와 필드[j]의 ^를 없애고(replace), 양옆의 공백을 자른 후(trim) 추가
				}
				k32_bw1.write(k32_s.toString()); // 새로 만든 파일에 내용 추가
				k32_bw1.newLine();	// 새로 만든 파일에 줄 바꾸기
				k32_wcnt++;	// 새로 만든 파일의 줄 1 증가
			}
			
			k32_cnt++;	// 기존 파일의 줄 1 증가
		}
		
		k32_br.close();	// 기존 파일 닫기
		k32_bw1.close();	// 새로 만든 파일 닫기
		
		long k32_finishTime = System.currentTimeMillis();	// 코드 실행 후에 시간 받아오기
		Date k32_finishInDate = new Date(k32_finishTime);	// 형태 날짜로 변환
		String k32_finishFormat = sdf.format(k32_finishInDate);	// 문자열 변수로 형태 변환
		
		long k32_diffTime = (k32_finishTime - k32_startTime); // 시간 차이 계산 
		long k32_diffTimeMin = (k32_diffTime / 1000 / 60);	// 분 구하기
		long k32_diffTimeSec = (k32_diffTime / 1000 % 60);	// 초 구하기
		
		System.out.println("시작 시간 : " + k32_startFormat);	// 시작 시간 출력
		System.out.println("종료 시간 : " + k32_finishFormat);	// 종료 시간 출력
		System.out.println("시간 차이 : " + k32_diffTimeMin + "분" + k32_diffTimeSec + "초");	// 시간 차이 출력
		System.out.printf("Program End[%d][%d]records\n", k32_wcnt, k32_cnt);	//	결과 출력
	}
	
	

}
