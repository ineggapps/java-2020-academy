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
		
		// ���� ������ ȸ�� �� (1~n-1ȸ��) nȸ
		for (int i = 0; i < num.length - 1; i++) {
			// i�� 0, 1, 2, 3��°������ ��ȸ�ϰ�
			for (int j = i + 1; j < num.length; j++) {
				// j�� 1,2,3,4��°�� ��ȸ�ϸ� �ȴ�.
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