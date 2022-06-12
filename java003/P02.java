package java003;

public class P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "heLLO";
		char[] chars = line.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 97) {
				chars[i] -= 32;
			} else {
				chars[i] += 32;
			}
			System.out.println(chars[i]);
		}

	}

}
