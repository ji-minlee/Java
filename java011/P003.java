package java011;

import java.util.Scanner;

public class P003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("1회 납입액을 입력하세요 (단위:원)");
		int pmt = sc.nextInt();
		System.out.println("총 납입 횟수를 입력하세요");
		int nper = sc.nextInt();
		System.out.println("이율을 입력하세요 (단위 %)");
		double rate = sc.nextDouble();
		System.out.println("타입을 입력하세요 : 1");
		int type = sc.nextInt();
		
		double sum = 0;

		for (; nper > 0; nper--) {
			sum += Math.pow((1 + rate / 100), nper) * pmt;

		}

		System.out.println("fv(미래가치) : " + sum + "원");
	}

}
