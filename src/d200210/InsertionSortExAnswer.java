package d200210;

public class InsertionSortExAnswer {
	public static void main(String[] args) {
		/*
		 * Insertion Sort
		 */
		int[] arr = { 25, 15, 7, 4, 12, 9, 17, 16, 20, 13 };
		int i, j, temp;

		System.out.print("Source Data : ");
		for (int n : arr)
			System.out.printf("%5d", n);
		System.out.println();

		for (i = 1; i < arr.length; i++) {
			temp = arr[i];
			for (j = i - 1; j >= 0; j--) {
				if (temp < arr[j])
					arr[j + 1] = arr[j];
				else
					break;
			}
			arr[j + 1] = temp;
		}

		System.out.print("Sort Data   : ");
		for (int n : arr)
			System.out.printf("%5d", n);
		System.out.println();
	}
}
