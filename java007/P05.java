package java007;

public class P05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String score[][] = { { "Name", "Korean", "English", "Math" }, { "Jeong", "70", "80", "100" },
				{ "Pyo", "60", "70", "86" }, { "Choi", "54", "100", "82" }, { "Mike", "87", "95", "79" } };
		int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		// 학생별 평균
		for (int i = 1; i < score.length; i++) {
			for (int j = 1; j < score[i].length; j++) {
				sum += Integer.parseInt(score[i][j]);

				if (Integer.parseInt(score[i][j]) > max) {
					max = Integer.parseInt(score[i][j]);
				}

				if (Integer.parseInt(score[i][j]) < min) {
					min = Integer.parseInt(score[i][j]);
				}
			}
			float avg = (float) sum / 3;

			System.out.print(score[i][0] + " 평균 : ");
			System.out.printf("%.2f", avg);
			System.out.println((" / 최고 점수 : " + max + " / 최저 점수 : " + min));

			sum = 0;
			avg = 0;
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;

		}

		System.out.println();

		// 과목별 평균
		for (int i = 1; i < score[0].length; i++) {
			for (int j = 1; j < score.length; j++) {
				sum += Integer.parseInt(score[j][i]);

				if (Integer.parseInt(score[j][i]) > max) {
					max = Integer.parseInt(score[j][i]);
				}

				if (Integer.parseInt(score[j][i]) < min) {
					min = Integer.parseInt(score[j][i]);
				}
			}
			float avg = (float) sum / 4;
			System.out.print(score[0][i] + " 평균 : ");
			System.out.printf("%.2f", avg);
			System.out.println((" / 최고 점수 : " + max + " / 최저 점수 : " + min));

			sum = 0;
			avg = 0;
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
		}
	}
}
