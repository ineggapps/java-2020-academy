package d200210;

public class SelectionSortEx {
	public static void main(String[] args) {
		int[] num = new int[] { 35, 25, 30, 27, 10 };
		int temp;

		System.out.print("Source data: ");
		for(int n:num) {
			System.out.print(n+ " ");
		}
		System.out.println();
		
		// 선택 정렬의 회전 수 (1~n-1회전) n회
		for (int i = 0; i < num.length - 1; i++) {
			// i는 0, 1, 2, 3번째까지만 순회하고
			for (int j = i + 1; j < num.length; j++) {
				// j는 1,2,3,4번째를 순회하면 된다.
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.print("Sorted data: ");
		for(int n:num) {
			System.out.print(n+ " ");
		}
		System.out.println();
	}
}