package d200205;

public class ForEx7 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("a");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("================");
		//
		// for���� ���� ������ �ٸ� ���� ����
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j < 0; j--) {
				// i�� 0�� �� ������ 4��, * 1��
				// i�� 1�� �� ������ 3��, * 2��
				// i�� 2�� �� ������ 2��, * 3��
				// i�� 3�� �� ������ 1��, * 4��
				// i�� 4�� �� ������ 0��, * 5��
				System.out.println(j <= i + 1 ? "*" : "a");
				// i�� 0�� �� �� ��
				// 5<=1
				// 4<=1
				// 3<=1
				// 2<=1
				// 1<=1 (o)
				// i�� 1�� �� �� ��
				// 5<=2
				// 4<=2
				// 3<=2
				// 2<=2 (o)
				// 1<=2 (o)
				// ...
			}
		}

		// for�� ���� ������ �޸� �� ��
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				// ���׿����ڷ� �����ϰ� �ذ��� �����ϴ�.
				System.out.print(j >= 6 - i ? "*" : "a");
//				if(j>=6-i){
//					/*
//					 j==5 *
//					 j==4, 5 **
//					 j==3, 4, 5 ***
//					 j==2,3,4,5 ****
//					 * */
//					System.out.print("*");
//				}else {
//					System.out.print("a");
//				}
			}
			System.out.println();
		}
	}
}
