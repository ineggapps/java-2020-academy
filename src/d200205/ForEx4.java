package d200205;

public class ForEx4 {
	public static void main(String[] args) {
		int c;
		System.out.println("������");
		for(int a=2;a<=9;a++) {
			for(int b=1;b<=9;b++) {//2~9�� �� 8���� (8) ���ڸ� X 1~9���� (9) = 72�� �ݺ�
				c=a*b;
				System.out.printf("%d*%d=%2d\t",a,b,c);
			}
			System.out.println("\n");
		}
	}
}
