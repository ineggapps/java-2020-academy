package d200210;

public class BubbleSortEx2 {
	public static void main(String[] args) {
		// 이미 정렬이 많이 되어 있는 경우로 초깃값을 설정해 두었음. (개선된 버블 정렬로는 3회전 정도에서 정렬이 끝남)
		int[] num = new int[] { 20, 30, 40, 25, 45, 50, 55, 60, 65 };
		boolean flag;
		int pass, temp;

		System.out.print("Source data: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

		// 개선된 버블 정렬
		pass = 1;
		do {
			flag=false;
			for (int i = 0; i < num.length - pass; i++) {
				// 대소 비교하여 정렬 실시
				if (num[i] > num[i + 1]) {
					temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
					flag = true;
				}
			}
			pass++;
		} while (flag);

		System.out.print("Sorted data: ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
