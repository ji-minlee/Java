package java2_009;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class P004 {
//JSON 파싱 / 20220421 /  k32_이지민 / 주석에는 k32_생략
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser k32_parser = new JSONParser();
		Object k32_obj = k32_parser.parse(new FileReader("C:\\\\Users\\\\501-21\\\\Desktop\\\\kopo32\\\\Java\\\\심화\\\\과제_심화\\\\9강\\\\test.json"));
		
		//JSONObject jsonObject = (JSONObject) obj;
		JSONArray k32_array = (JSONArray) k32_obj; // 딱히 키가 없는 array이라 이런 식으로 연결
		
		System.out.println("*******************************************");
		for (int k32_i = 0; k32_i < k32_array.size(); k32_i++) {	// array만큼 1씩 증가하며 반복 (for문)
			JSONObject k32_result = (JSONObject) k32_array.get(k32_i);	// array에서 하나를 빼온다
			System.out.println("이름 : " + k32_result.get("name"));		// 이름을 가져와 출력
			System.out.println("학번 : " + k32_result.get("studentid"));	// 학번을 가져와 출력
			
			JSONArray k32_score = (JSONArray) k32_result.get("score");	// 성적을 가져온다 (배열로)
			long k32_kor = (long)k32_score.get(0);	// 배열 중 첫번째 것 : 국어
			long k32_eng = (long)k32_score.get(1);	// 배열 중 두번째 것 : 영어
			long k32_mat = (long)k32_score.get(2);	// 배열 중 세번째 것 : 수학
			
			// 결과 형태에 맞게 출력
			System.out.println("국어 : " + k32_kor);
			System.out.println("영어 : " + k32_eng);
			System.out.println("수학 : " + k32_mat);
			System.out.println("총점 : " + (k32_kor + k32_eng + k32_mat));	// 총합 구하기
			System.out.println("평균 : " + ((k32_kor + k32_eng + k32_mat) / 3.0));	// 실수형으로 평균 구하기
			System.out.println("*******************************************");
		}
	}

}
