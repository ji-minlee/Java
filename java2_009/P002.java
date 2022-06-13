package java2_009;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class P002 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		// 문자열 변수 선언 및 초기화 (목록의 이름들로)
		String k32_seq = "", k32_hour = "", k32_day = "";
		String k32_temp = "", k32_tmx = "", k32_tmn = "";
		String k32_sky = "", k32_pty = "";
		String k32_wfKor = "", k32_wfEn = "";
		String k32_pop = "", k32_r12 = "", k32_s12 = "";
		String k32_ws = "", k32_wd = "", k32_wdKor = "", k32_wdEn = ""; 
		String k32_reh = "", k32_r06 = "", k32_s06 = "";
		
		DocumentBuilder k32_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();	// 파싱을 위한 준비
		//xml 파일 처리, 전체 경로로 지정, xml 파싱 처리
		Document k32_doc = k32_docBuilder.parse(new File("C:\\Users\\501-21\\Desktop\\kopo32\\Java\\심화\\과제_심화\\9강\\queryDFS.xml"));
		
		Element k32_root = k32_doc.getDocumentElement();	// root 태그 가져오기
		
		NodeList k32_tag_001 = k32_doc.getElementsByTagName("data");	// "data" 기준으로 가져오기
		
		for (int k32_i = 0; k32_i < k32_tag_001.getLength(); k32_i++) {	// 데이터 개수만큼 1씩 증가하며 반복 (for문)
			Element k32_elemnt = (Element) k32_tag_001.item(k32_i);	// 엘리먼트들 가져오기
			// 아래와 같이 엘리먼트들을 가져온다
			k32_seq = k32_tag_001.item(k32_i).getAttributes().getNamedItem("seq").getNodeValue();
			k32_hour = k32_elemnt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();
			k32_day = k32_elemnt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();
			k32_temp = k32_elemnt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();
			k32_tmx = k32_elemnt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();
			k32_tmn = k32_elemnt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();
			k32_sky = k32_elemnt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();
			k32_pty = k32_elemnt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();
			k32_wfKor = k32_elemnt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();
			k32_wfEn = k32_elemnt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();
			k32_pop = k32_elemnt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();
			k32_r12 = k32_elemnt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();
			k32_s12 = k32_elemnt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();
			k32_ws = k32_elemnt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();
			k32_wd = k32_elemnt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();
			k32_wdKor = k32_elemnt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();
			k32_wdEn = k32_elemnt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();
			k32_reh = k32_elemnt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();
			k32_r06 = k32_elemnt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();
			k32_s06 = k32_elemnt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();
			
			
			// 포맷에 맞게 결과 출력
			System.out.printf("** %s번째 **  (48시간 중)\n", k32_seq);
			System.out.printf("시간         : %s시\n", k32_hour);
			System.out.printf("날짜         : %s번째날  (오늘 : 0)\n", k32_day);
			System.out.printf("현재 온도    : %s도\n", k32_temp);
			System.out.printf("최고 온도    : %s도\n", k32_tmx);
			System.out.printf("최저 온도    : %s도\n", k32_tmn);
			System.out.printf("하늘 상태    : %s        (1: 맑음, 2: 구름 조금, 3: 구름 많음, 4: 흐림)\n", k32_sky);
			System.out.printf("강수 상태    : %s        (0: 없음, 1: 비, 2: 비/눈, 3: 눈/비, 4: 눈)\n", k32_pty);
			System.out.printf("날씨(한국어) : %s\n", k32_wfKor);
			System.out.printf("날씨(영어)   : %s\n", k32_wfEn);
			System.out.printf("강수 확률    : %s%%\n", k32_pop);
			System.out.printf("예상 강수량  : %s (12시간)\n", k32_r12);
			System.out.printf("예상 적설량  : %s (12시간)\n", k32_s12);
			System.out.printf("풍속         : %s (m/s)\n", k32_ws);
			System.out.printf("풍향         : %s        (0~7: 북, 북동, 동, 남동, 남, 남서, 서, 북서)\n", k32_wd);
			System.out.printf("풍향(한국어) : %s\n", k32_wdKor);
			System.out.printf("풍향(영어)   : %s\n", k32_wdEn);
			System.out.printf("습도         : %s%%\n", k32_reh);
			System.out.printf("예상 강수량  : %s (6시간)\n", k32_r06);
			System.out.printf("예상 적설량  : %s (6시간)\n", k32_s06);
			System.out.println("***************************************************************************");
			
		}	
		
	}

}
