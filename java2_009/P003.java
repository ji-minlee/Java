package java2_009;
import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
public class P003 {
//JSON 만들기 / 20220421 /  k32_이지민 / 주석에는 k32_생략
		// 하는 일이 반복되므로 함수로 만듦
		public static JSONObject k32_oneRec(String name, int studentid, int kor, int eng, int mat) {	// 메소드 선언(매개변수 5개)
			JSONObject k32_dataObject = new JSONObject();	// JSONObject 선언
			k32_dataObject.put("name", name);	// 이름 추가
			k32_dataObject.put("studentid", studentid);	// 학번 추가
			
			JSONArray k32_score = new JSONArray();	//Json Array 생성
			k32_score.add(kor); k32_score.add(eng); k32_score.add(mat);	// 국어, 영어, 수학 성적 순서대로 추가
			k32_dataObject.put("score", k32_score);	// score array를 JSONObject에 추가
			
			return k32_dataObject;	// 리턴값 : dataObject
		}
		
		public static void main(String[] args) {
			//최종 완성될 JSONObject 선언(전체)
			JSONObject k32_jsonObject = new JSONObject();
			//한명 성적의 JSON정보를 담을 Array 선언
			JSONArray k32_datasArray = new JSONArray();
			
			
			JSONObject k32_dataObject = new JSONObject();	//한명 정보가 들어갈 JSONObject 선언
			k32_dataObject.put("name", "나연");	// 이름에 나연 추가
			k32_dataObject.put("studentid", "209901");	// 학번에 209901 추가
			
			JSONArray k32_score = new JSONArray();	//JSON Array 생성
			k32_score.add(90); k32_score.add(100); k32_score.add(95);	// 국어, 영어, 수학 성적 array에 추가
			k32_dataObject.put("score", k32_score);	// object 점수에 array 추가
			k32_datasArray.add(k32_dataObject);	// array에 object 추가
			
			//함수 처리, 이름, 학번, 성적 넣기
			k32_datasArray.add(k32_oneRec("정연", 209902, 100, 85, 75));	
			k32_datasArray.add(k32_oneRec("모모", 209903, 90, 75, 85));
			k32_datasArray.add(k32_oneRec("사나", 209904, 90, 85, 75));
			k32_datasArray.add(k32_oneRec("지효", 209905, 80, 75, 85));
			k32_datasArray.add(k32_oneRec("미나", 209906, 90, 85, 55));
			k32_datasArray.add(k32_oneRec("다현", 209907, 70, 75, 65));
			k32_datasArray.add(k32_oneRec("채영", 209908, 100, 75, 95));
			k32_datasArray.add(k32_oneRec("쯔위", 209909, 80, 65, 95));
			
			
			try { //JSON 파일 만들기 / 파일 선언
				FileWriter k32_file = new FileWriter("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\심화\\과제_심화\\9강\\test.json");
				k32_file.write(k32_datasArray.toJSONString());	// JSON 파일에 내용 옮기기
				k32_file.flush();	//flush >메모리에서 작업한 것을 실제 디바이스로 옮김
				k32_file.close();	// 파일 닫기 
			} catch(IOException e) {	// 오류 잡기
				e.printStackTrace();	// 오류 내용 출력
			}
			System.out.println("JSON 만든 것 : " + k32_datasArray);	// 결과 출력
			
		}
	}

