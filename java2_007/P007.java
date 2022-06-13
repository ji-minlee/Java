package java2_007;

import java.util.ArrayList;
//ArrayList / 20220420 / k32_이지민 / 주석에는 k32_생략
public class P007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList k32_iAL = new ArrayList();	// ArrayList 선언
		// ArrayList에 다음과 같은 내용 추가 , .add 활용 
		// ArrayList를 처음 String으로 채우기 시작하였으면 string으로 넣어야 한다. > 중간에 숫자 들어가면 안됨!
		k32_iAL.add("abc");
		k32_iAL.add("abcd");
		k32_iAL.add("efga");
		k32_iAL.add("가나다0");
		k32_iAL.add("1234");
		k32_iAL.add("12rk34");
		
		System.out.printf("*******************************************\n");
		System.out.printf(" 시작 ArraySize %d \n", k32_iAL.size());	// 배열의 사이즈를 출력
		for (int k32_i = 0; k32_i < k32_iAL.size(); k32_i++) {	// 배열의 사이즈만큼 1씩 증가하면서 반복 (for문)
			System.out.printf(" ArrayList %d = %s\n", k32_i, k32_iAL.get(k32_i));	// 배열의 내용을 출력
		}
		
		k32_iAL.set(3, "가라라라");	// 3번째 배열의 내용을 변경
		System.out.printf("*******************************************\n");
		System.out.printf(" 내용변경 ArraySize %d \n", k32_iAL.size());	// 배열의 사이즈를 출력
		for (int k32_i = 0; k32_i < k32_iAL.size(); k32_i++) {	// 배열의 사이즈만큼 1씩 증가하면서 반복 (for문)
			System.out.printf(" ArrayList %d = %s\n", k32_i, k32_iAL.get(k32_i));	// 배열의 내용을 출력
		}
		
		k32_iAL.remove(4);	// 4번째 배열을 삭제
		System.out.printf("*******************************************\n");
		System.out.printf(" 내용변경 ArraySize %d \n", k32_iAL.size());	// 배열의 사이즈를 출력
		for (int k32_i = 0; k32_i < k32_iAL.size(); k32_i++) {	// 배열의 사이즈만큼 1씩 증가하면서 반복 (for문)
			System.out.printf(" ArrayList %d = %s\n", k32_i, k32_iAL.get(k32_i));	// 배열의 내용을 출력
		}
		
		k32_iAL.sort(null);	// 배열을 정렬
		System.out.printf("*******************************************\n");
		System.out.printf(" 리스트Sort ArraySize %d \n", k32_iAL.size());	// 배열의 사이즈를 출력
		for (int k32_i = 0; k32_i < k32_iAL.size(); k32_i++) {	// 배열의 사이즈만큼 1씩 증가하면서 반복 (for문)
			System.out.printf(" ArrayList %d = %s\n", k32_i, k32_iAL.get(k32_i));	// 배열의 내용을 출력
		}
		
		k32_iAL.clear();	// 배열을 전부 삭제
		System.out.printf("*******************************************\n");
		System.out.printf(" 전부 삭제 ArraySize %d \n", k32_iAL.size());	// 배열의 사이즈를 출력
		for (int k32_i = 0; k32_i < k32_iAL.size(); k32_i++) {	// 배열의 사이즈만큼 1씩 증가하면서 반복 (for문)
			System.out.printf(" ArrayList %d = %s\n", k32_i, k32_iAL.get(k32_i));	// 배열의 내용을 출력
		}
		
		
		
	}

}
