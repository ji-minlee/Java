package java2_008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P005 {
//거리계산(최소, 최대) / 20220421 /  k32_이지민 / 주석에는 k32_생략
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k32_f = new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\심화\\과제_심화\\8강\\12_04_07_E_무료와이파이정보_경기도_탭.txt"); // 파일 불러오기																									
		BufferedReader k32_br = new BufferedReader(new FileReader(k32_f)); // 파일 읽기

		String k32_readtxt; // 문자열 변수 (파일 읽은 내용) 선언

		if ((k32_readtxt = k32_br.readLine()) == null) { // 파일에 한 줄도 내용이 없으면 (null)
			System.out.println("빈 파일입니다"); // 내용 출력
			return;
		}

		String[] k32_field_name = k32_readtxt.split("\t"); // 문자열 배열 필드명을 선언하고 읽은 내용을 빈칸 단위로 자른다

		double k32_lat = 37.3859; // 폴리텍 위도
		double k32_lng = 127.1214; // 폴리텍 경도
		
		
		int k32_LineCount = 1;	// 정수형 변수 줄 카운트를 선언하고 1로 초기화
		double k32_distanceMax = 0;	// 실수형 변수 최대 거리 선언하고 0으로 초기화
		double k32_distanceMin = 0;	// 실수형 변수 최소 거리 선언하고 0으로 초기화
		int k32_LineCountCheckMax = 0;	// 최대가 몇번째인지 확인하는 정수형 변수 선언하고 0으로 초기화
		int k32_LineCountCheckMin = 0;	// 최소가 몇번째인지 확인하는 정수형 변수 선언하고 0으로 초기화
		String k32_maxSpot = "";
		String k32_minSpot = "";
		
		while ((k32_readtxt = k32_br.readLine()) != null) {	// 파일에 내용이 존재하면 (null이 아니면)
			String[] k32_field = k32_readtxt.split("\t");	// 문자열 배열 필드 내용을 선언하고 읽은 내용을 빈칸 단위로 자른다
			
			double k32_distance = Math.sqrt(Math.pow(Double.parseDouble(k32_field[13])-k32_lat, 2)) + Math.pow(Double.parseDouble(k32_field[14])-k32_lng, 2);	
			// 우리집에서부터의 거리 구하기 > 거리는 피타고라스의 정리를 활용해 구한다
			
			if (k32_LineCount == 1) {	// 1번째 줄일 때
				k32_distanceMax = k32_distance;	// 최대거리에 거리 대입
				k32_distanceMin = k32_distance;	// 최소거리에 거리 대입
				k32_LineCountCheckMax = k32_LineCount;	// 최대라인확인에 현재 라인 대입
				k32_LineCountCheckMin = k32_LineCount;	// 최소라인 확인에 현재 라인 대입
				k32_maxSpot = k32_field[1];
				k32_minSpot = k32_field[1];
				
			} else {	// 데이터가 더이상 없을 때까지
				if (k32_distance > k32_distanceMax) {	// 거리가 최대거리보다 크다면
					k32_distanceMax = k32_distance;	// 최대거리에 거리를 대입
					k32_LineCountCheckMax = k32_LineCount;	// 최대 라인 확인에 현재 라인 대입
					k32_maxSpot = k32_field[1];
				}
				if (k32_distance < k32_distanceMin) {	// 거리가 최소거리 보다 작다면
					k32_distanceMin = k32_distance;	// 최소거리에 거리를 대입
					k32_LineCountCheckMin = k32_LineCount;	// 최소 라인 확인에 현재 라인 대입
					k32_minSpot = k32_field[1];
				}
			}
						
			k32_LineCount++;	// 다음 줄로 넘어간다 (1 증가)
					
		}
		
		System.out.printf(" 최대 : [%d번째 항목] - %s : %f\n", k32_LineCountCheckMax, k32_maxSpot, k32_distanceMax);	// 형태에 맞게 최대 거리 출력
		System.out.printf(" 최소 : [%d번째 항목] - %s : %f\n", k32_LineCountCheckMin, k32_minSpot, k32_distanceMin);	// 형태에 맞게 최소 거리 출력
		System.out.println("**********************************************");
		
		k32_br.close();	// 파일을 닫는다
		
		
	}

}
