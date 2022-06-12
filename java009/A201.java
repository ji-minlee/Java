package java009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please input 5 sets of names and scores");
		Scanner sc = new Scanner(System.in);
		ArrayList<String> set1 = new ArrayList<String>();
		String setOne = sc.nextLine();
		String[] cutOne = setOne.split(" ");
		set1.add(cutOne[0]);
		set1.add(cutOne[1]);

		ArrayList<String> set2 = new ArrayList<String>();
		String setTwo = sc.nextLine();
		String[] cutTwo = setTwo.split(" ");
		set2.add(cutTwo[0]);
		set2.add(cutTwo[1]);

		ArrayList<String> set3 = new ArrayList<String>();
		String setThree = sc.nextLine();
		String[] cutThree = setThree.split(" ");
		set3.add(cutThree[0]);
		set3.add(cutThree[1]);

		ArrayList<String> set4 = new ArrayList<String>();
		String setFour = sc.nextLine();
		String[] cutFour = setFour.split(" ");
		set4.add(cutFour[0]);
		set4.add(cutFour[1]);

		ArrayList<String> set5 = new ArrayList<String>();
		String setFive = sc.nextLine();
		String[] cutFive = setFive.split(" ");
		set5.add(cutFive[0]);
		set5.add(cutFive[1]);

		ArrayList<Integer> score = new ArrayList<Integer>();
		score.add(Integer.parseInt(set1.get(1)));
		score.add(Integer.parseInt(set2.get(1)));
		score.add(Integer.parseInt(set3.get(1)));
		score.add(Integer.parseInt(set4.get(1)));
		score.add(Integer.parseInt(set5.get(1)));

		Collections.sort(score, Collections.reverseOrder());

		System.out.println("#Rank");

		if (score.get(0) == Integer.parseInt(set1.get(1))) {
			System.out.print(set1.get(0) + " , ");
		} else if (score.get(0) == Integer.parseInt(set2.get(1))) {
			System.out.print(set2.get(0) + " , ");
		} else if (score.get(0) == Integer.parseInt(set3.get(1))) {
			System.out.print(set3.get(0) + " , ");
		} else if (score.get(0) == Integer.parseInt(set4.get(1))) {
			System.out.print(set4.get(0) + " , ");
		} else if (score.get(0) == Integer.parseInt(set5.get(1))) {
			System.out.print(set5.get(0) + " , ");
		}

		if (score.get(1) == Integer.parseInt(set1.get(1))) {
			System.out.print(set1.get(0) + " , ");
		} else if (score.get(1) == Integer.parseInt(set2.get(1))) {
			System.out.print(set2.get(0) + " , ");
		} else if (score.get(1) == Integer.parseInt(set3.get(1))) {
			System.out.print(set3.get(0) + " , ");
		} else if (score.get(1) == Integer.parseInt(set4.get(1))) {
			System.out.print(set4.get(0) + " , ");
		} else if (score.get(1) == Integer.parseInt(set5.get(1))) {
			System.out.print(set5.get(0) + " , ");
		}

		if (score.get(2) == Integer.parseInt(set1.get(1))) {
			System.out.print(set1.get(0) + " , ");
		} else if (score.get(2) == Integer.parseInt(set2.get(1))) {
			System.out.print(set2.get(0) + " , ");
		} else if (score.get(2) == Integer.parseInt(set3.get(1))) {
			System.out.print(set3.get(0) + " , ");
		} else if (score.get(2) == Integer.parseInt(set4.get(1))) {
			System.out.print(set4.get(0) + " , ");
		} else if (score.get(2) == Integer.parseInt(set5.get(1))) {
			System.out.print(set5.get(0) + " , ");
		}

		if (score.get(3) == Integer.parseInt(set1.get(1))) {
			System.out.print(set1.get(0) + " , ");
		} else if (score.get(3) == Integer.parseInt(set2.get(1))) {
			System.out.print(set2.get(0) + " , ");
		} else if (score.get(3) == Integer.parseInt(set3.get(1))) {
			System.out.print(set3.get(0) + " , ");
		} else if (score.get(3) == Integer.parseInt(set4.get(1))) {
			System.out.print(set4.get(0) + " , ");
		} else if (score.get(3) == Integer.parseInt(set5.get(1))) {
			System.out.print(set5.get(0) + " , ");
		}

		if (score.get(4) == Integer.parseInt(set1.get(1))) {
			System.out.print(set1.get(0) + " ");
		} else if (score.get(4) == Integer.parseInt(set2.get(1))) {
			System.out.print(set2.get(0) + " ");
		} else if (score.get(4) == Integer.parseInt(set3.get(1))) {
			System.out.print(set3.get(0) + " ");
		} else if (score.get(4) == Integer.parseInt(set4.get(1))) {
			System.out.print(set4.get(0) + " ");
		} else if (score.get(4) == Integer.parseInt(set5.get(1))) {
			System.out.print(set5.get(0) + " ");
		}
	}
}
