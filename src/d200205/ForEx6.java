package d200205;

public class ForEx6 {
	public static void main(String[] args) {
		//���� for���� �̿��Ͽ� *���ڷ� �ﰢ�� �����
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
