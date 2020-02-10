package d200210;

public class InsertionSortEx {
	public static void main(String[] args) {
		int[] num = new int[] { 35, 25, 30, 27, 10 };
		int temp;

		System.out.print("Source data: ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();

		for (int i = 1; i < num.length; i++) {
//			System.out.println(i);
			for (int j = i; j > 0; j--) {
//				System.out.println("\t" + j);
				if (num[j - 1] > num[j]) {
					temp = num[j - 1];
					num[j - 1] = num[j];
					num[j] = temp;
				}
			}
			
			System.out.printf("%d회전: ", i);
			for (int n : num) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		System.out.print("Sorted data: ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}

/*
 추가 참조
 https://cornswrold.tistory.com/17
 */
 */