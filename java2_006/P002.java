package java2_006;

// 변수와 메서드(2) / 20220417 / k32_이지민 / 주석은 k32_제외
public class P002 {

	static int k32_iStatic; // 변수를 클래스 전역에서 사용하는 static으로 선언(값이 계속 유지)

	public static void add(int k32_i) { // 함수(메서드) add 선언 (변수 i 사용)
		k32_iStatic++; // 변수 iStatic을 1 증가
		k32_i++; // 변수 i를 1 증가
		System.out.printf("add메소드에서 => k32_iStatic = [%d]\n", k32_iStatic); // 변수 iStatic 출력
		System.out.printf("add메소드에서 => k32_i = [%d]\n", k32_i); // 변수 i 출력
	}

	public static int add2(int k32_i) { // 함수(메서드) add 선언 (변수 i 사용)
		k32_iStatic++; // 상수 변수 iStatic을 1 증가
		k32_i++; // 변수 i를 1 증가
		System.out.printf("add메소드에서 => k32_iStatic = [%d]\n", k32_iStatic); // 변수 iStatic 출력
		System.out.printf("add메소드에서 => k32_i = [%d]\n", k32_i); // 변수 i 출력
		return k32_i; // 변수를 메소드 내에 선언하여 매개변수로 전달하고 리턴받는 형태로 사용
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k32_iMain; // 정수 변수 iMain을 선언

		k32_iMain = 1; // 변수 iMain을 1로 초기화
		k32_iStatic = 1; // 변수를 클래스 전역에서 사용하는 static으로 선언(값이 계속 유지)

		System.out.printf("*************************************\n");
		System.out.printf("메소드 호출 전 메인에서 -> k32_iStatic=[%d]\n", k32_iStatic); // 변수 iStatic 출력 > 1
		System.out.printf("메소드 호출 전 메인에서 -> k32_iMain=[%d]\n", k32_iMain); // 변수 iMain 출력 > 1
		System.out.printf("*************************************\n");

		add(k32_iMain); // 함수 add를 실행 (변수 iMain에 대해)

		System.out.printf("*************************************\n");
		System.out.printf("메소드 호출 후 메인에서 -> k32_iStatic=[%d]\n", k32_iStatic);// 변수 iStatic 출력 > 2 (1 증가했으므로)
		System.out.printf("메소드 호출 후 메인에서 -> k32_iMain=[%d]\n", k32_iMain); // 변수 iMain 출력 > 1 (add에는 리턴값이 없다)
		System.out.printf("*************************************\n");

		k32_iMain = add2(k32_iMain); // 함수 add2를 실행 (변수 iMain에 대해)

		System.out.printf("*************************************\n");
		System.out.printf("메소드 add2 호출 후 메인에서 -> k32_iStatic=[%d]\n", k32_iStatic);// 변수 iStatic 출력 > 3 (1 증가했으므로)
		System.out.printf("메소드 add2 호출 후 메인에서 -> k32_iMain=[%d]\n", k32_iMain); // 변수 iMain 출력 > 2 (add2에는 리턴값이 있다)
		System.out.printf("*************************************\n");

	}

}
