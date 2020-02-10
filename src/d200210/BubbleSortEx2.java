package d200210;

public class BubbleSortEx2 {
	public static void main(String[] args) {
		// �̹� ������ ���� �Ǿ� �ִ� ���� �ʱ갪�� ������ �ξ���. (������ ���� ���ķδ� 3ȸ�� �������� ������ ����)
		int[] num = new int[] { 20, 30, 40, 25, 45, 50, 55, 60, 65 };
		boolean flag;
		int pass, temp;

		System.out.print("Source data: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

		// ������ ���� ����
		pass = 1;
		do {
			flag=false;
			for (int i = 0; i < num.length - pass; i++) {
				// ��� ���Ͽ� ���� �ǽ�
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
