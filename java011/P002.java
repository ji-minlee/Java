package java011;

import java.util.Scanner;

public class P002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 속도를 입력하세요 (순서 : m/s, km/h, m/ms)");
		double ms = sc.nextDouble();
		double kmh = sc.nextDouble();
		double mms = sc.nextDouble();
		
		msChange(ms);
		mmsChange(mms);
		compareUnit(kmh,msChange(ms),mmsChange(mms), ms, mms);
		
	}
	
	public static double msChange(double ms) {
		double changeMs = ms * 60 * 60 / 1000;
		return changeMs;
	}
	
	public static double mmsChange(double mms) {
		double changeMms = mms * 1000 * 60 * 60 / 1000;
		return changeMms;
	}
	
	public static void compareUnit(double kmh, double changeMs, double changeMms, double ms, double mms) {		
		double max = 0;
		
		
		if (kmh > max) {
			max = kmh;
		} 
		if (changeMs > max) {
			max = changeMs;
		} 
		if (changeMms > max) {
			max = changeMms;
		}	
	
		if (max == kmh) {
			System.out.println("가장 빠른 것 : " + (int) max + "km/h");
		} else if (max == changeMs) {
			max = ms;
			System.out.println("가장 빠른 것 : " + (int) max + "m/s");
		} else {
			max = mms;
			System.out.println("가장 빠른 것 : " + max + "m/ms");
		}
	}

}
