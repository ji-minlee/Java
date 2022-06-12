package java010;

import java.util.Random;
import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {
		System.out.println("Please input a number of players");
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		int [] player = new int [inputNum];
		
		Rank R = new Rank();
		
		for (int i = 0; i < inputNum; i++) {
			Thread thread[i] = new Runner(runner, r);
		}
		
		for (int i = 0; i < inputNum; i++) {
		thread.start();
		}
		
	}

class Rank {
	int rank = 0;
	
	synchronized void finishLine() {
		rank++;
		System.out.println(rank);
	}
}

class Player extends Thread {
	int Player;
	int distance = 50;
	
	Rank r = new Rank();
	
	void Runner(int runner, Rank r) {
		Player = runner;
		this.r = r;
	}
	
	public void run() {
		Random random = new Random();
		int num;
		
		
		
		while (true) {
			if (distance <= 0) {
				r.finishLine();
				break;
			}
			
			num = random.nextInt(10);
			distance -= num;
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {				
			}
		}
	}
}
}

