package java2_007;

import java.util.ArrayList;

public class P008 {
//ArrayList 2 / 20220420 / k32_이지민 / 주석에는 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k32_iTestMAX = 1000000;	// 정수형 변수 선언 및 초기화
		ArrayList k32_iAL = new ArrayList();	// arrayList 선언
		
		for (int k32_i = 0; k32_i < k32_iTestMAX; k32_i++) {	// 변수만큼 1씩 증가하며 (for문)
			k32_iAL.add((int)(Math.random()*1000000));	// 배열에 랜덤으로 숫자 추가
		}
		
		for (int k32_i = 0; k32_i < k32_iAL.size(); k32_i++) {	// 배열 사이즈만큼 1씩 증가하며 (for문)
			System.out.printf(" ArrayList %d = %d\n", k32_i, k32_iAL.get(k32_i));	// 배열 출력
		}
		
		System.out.println("******************************************");
		k32_iAL.sort(null);		// 배열 정렬하기
		
		for (int k32_i =0; k32_i < k32_iAL.size(); k32_i++) {	// 배열의 사이즈만큼 1씩 증가하며 반복 (for문)
			System.out.printf(" ArrayList %d = %d\n", k32_i, k32_iAL.get(k32_i));	// 배열 출력하기
		}
		
	}

}
