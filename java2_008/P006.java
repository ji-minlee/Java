package java2_008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P006 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k32_f = new File("C:\\\\Users\\\\501-21\\\\Desktop\\\\kopo32\\\\Java\\\\심화\\\\과제_심화\\\\8강\\\\한국교통안전공단_전국공영주차장정보_20191224.csv");
		// 위에서 선언한 File을 BufferedReader로 읽으려고 선언
		BufferedReader k32_br = new BufferedReader (new FileReader(k32_f));
		// 텍스트를 바꿔가면서 담을 문자열 변수 선언
		String k32_readtxt;
		// 첫 출을 readtxt에 입력하고 만약 빈값이여서 null이 나오면 빈파일 메세지 출력
		if((k32_readtxt = k32_br.readLine()) == null) {
			System.out.println("빈 파일입니다.");
			return;
		}
		// field_name 문자열 배열에 첫줄을 ,단위로 잘라서 입력한다.
		String[] k32_field_name = k32_readtxt.split(",");
		
		//융합기술 우리집 위도경도 
		double k32_lat = 37.3860521;
		double k32_lng = 127.1214038;
		
		int k32_LineCnt = 1;	// 현재 몇번째를 돌고 있는지 확인할 정수형 변수 선언
		int k32_maxnumber = 0;	// 최대값의 위치를 담을 변수 선언
		int k32_minnumber = 0;	// 최소값의 위치를 담을 변수 선언
		double k32_distanceMax = 0.0;	// 최대거리를 구할 변수 선언
		double k32_distanceMin = 0.0;	// 최소거리를 구할 변수 선언
		String k32_maxPlace = "";	// 최대거리의 장소 문자열 변수 선언
		String k32_minPlace = "";	// 최소거리의 장소 문자열 변수 선언
		
		while((k32_readtxt = k32_br.readLine()) != null) { 	// 값이 없을때까지 도는 while문 작성
			
			String [] k32_field = k32_readtxt.split(",");	// 다음 내용을 콤마 단위로 잘라서 field 배열에 넣는다.
			System.out.printf("**[%d번째 항목]***********************\n",k32_LineCnt);	// 지금 몇번째 항목인지 출력한다.
			System.out.printf(" %s : %s\n", k32_field_name[1], k32_field[1]);	// 해당 줄의 주차장명의 항목과 내용을 출력한다.
			System.out.printf(" %s : %s\n", k32_field_name[3], k32_field[3]);	// 해당 줄의 위도 : 위도값 으로 출력한다.
			System.out.printf(" %s : %s\n", k32_field_name[2], k32_field[2]);	// 해당 줄의 경도 : 경도값 으로 출력한다.
			// 거리 계산 (피타고라스 정리) sqrt(제곱근), pew(제곱), field의 값을 더블형으로 바꿔서 폴리텍 대학의 좌표와 거리계산
			double dist = Math.sqrt(Math.pow(Double.parseDouble(k32_field[3]) - k32_lat,2)
					+ Math.pow(Double.parseDouble(k32_field[2]) -k32_lng, 2));
			// 위에서 계산한 거리 출력
			System.out.printf(" 현재지점과 거리 : %f\n", dist);
			System.out.println("************************************");
			// 최대 최소 구하는 if문 선언
			if(k32_LineCnt == 1) {
				k32_distanceMax = dist;	// 해당값을 최대값 변수에 넣어라
				k32_distanceMin = dist;	// 해당 값을 최소값 변수에 넣어라
				k32_maxnumber = k32_LineCnt;	// 최대값의 번호(몇번째줄)을 넣어라
				k32_minnumber = k32_LineCnt;	// 최소값의 번호(몇번째줄)을 넣어라
				k32_maxPlace = k32_field[1];	// 최대거리의 장소를 넣어라
				k32_minPlace = k32_field[1];	// 최소거리의 장소를 넣어라
				
			} else {
				if(dist > k32_distanceMax) {
					k32_distanceMax = dist;	// 최대값을 갱신한다.
					k32_maxnumber = k32_LineCnt;	//최대값의 위치를 갱신한다.
					k32_maxPlace = k32_field[1];	// 최대거리의 장소를 갱신한다
				}
				if(k32_distanceMin > dist) {
					k32_distanceMin = dist;	//최소값을 갱신한다.
					k32_minnumber = k32_LineCnt;	// 최소값의 위치를 갱신한다.
					k32_minPlace = k32_field[1];	// 최소거리의 장소를 갱신한다
				}
			}
			
			k32_LineCnt++;	// 다음줄로 넘어갔다는 의미로 +1
		}
		// 최대거리 , 최소거리 와 각 몇번째 줄인지 출력한다.
		System.out.printf("[%d번째 항목] %s - 최대거리 : %f\n", k32_maxnumber, k32_maxPlace, k32_distanceMax);
		System.out.printf("[%d번째 항목] %s - 최소거리 : %f", k32_minnumber, k32_minPlace, k32_distanceMin);		
		// BufferedReader 종료
		k32_br.close();
	}

}
