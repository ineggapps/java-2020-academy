package d200205;

public class ForEx8 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("a");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("================");
		int s = 9;
		// ù �ٿ� 5��(4+1)
		// ��° �ٿ� 6��(3+3)
		// ��° �ٿ� 7��(2+5)
		// ��° �ٿ� 8��(1+7)
		// �ټ�° �ٿ� 9��(0+9)
		for (int i = s / 2 + 1; i <= s; i++) {
			// i=5, 6, 7, 8, 9 (�� 5ȸ �ݺ�)
			for (int j = 0; j < i; j++) {
				System.out.print((s - i) <= j ? "*" : "a");
				// 9-5<=j
				// 4<=0
				// 4<=1
				// 4<=2
				// 4<=3
				// 4<=4 (*)

				// 9-6 <=j
				// 3<=0
				// 3<=1
				// 3<=2
				// 3<=3 (*)
				// 3<=4 (*)
				// 3<=5 (*)

				// 9-7 <=j
				// 2<=0
				// 2<=1
				// 2<=2
				// 2<=3 (*)
				// 2<=4 (*)
				// 2<=5 (*)
				// 2<=6 (*)
				// 2<=7 (*)
			}
			System.out.println();
		}
	}
}
