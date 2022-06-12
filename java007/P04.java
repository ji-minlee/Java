package java007;

public class P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20 };
		int check = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					check = arr[i];
					arr[i] = arr[j];
					arr[j] = check;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					check = arr[i];
					arr[i] = arr[j];
					arr[j] = check;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
	}
	}
}
