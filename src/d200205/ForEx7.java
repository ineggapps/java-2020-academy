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
		//for���� ���� ������ �ٸ� ���� ����
		for(int i=0;i<5;i++) {
			for(int j=5;j<0;j--) {
				System.out.println(j<=i+1?"*":"a");
			}
		}
		
		//for�� ���� ������ �޸� �� ��
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				//���׿����ڷ� �����ϰ� �ذ��� �����ϴ�.
				System.out.print(j>=6-i?"*":"a");
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
