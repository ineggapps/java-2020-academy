package d200204;

public class WhileQuizBasic10 {
	public static void main(String[] args) {
		//�������� 2�ܿ��� 9�ܱ��� ���� ���ó�� ���η� ����ϴ� ���α׷� �ۼ��ϱ�
		//While(����)���� �̿��Ͽ� �ۼ�
		int dan=2, n=1;
		while(n<10) {
			dan++;
			System.out.printf("%d*%d=%d\t",dan,n,dan*n);
			if(dan==9){
				dan=2;
				n++;
				System.out.println();
			}
		}
	}
}
