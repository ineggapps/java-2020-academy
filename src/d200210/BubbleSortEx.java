package d200210;

public class BubbleSortEx {
	public static void main(String[] args) {
		int[] num = new int[] { 35, 25, 30, 27, 10 };
		int temp;

		System.out.print("Source data: ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();

		// 버블 정렬 
		for (int i = 1; i < num.length; i++) {
			for (int j = 0; j < num.length - i; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}

		System.out.print("Sorted data: ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}