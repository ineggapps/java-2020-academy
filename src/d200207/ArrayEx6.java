package d200207;

public class ArrayEx6 {
	public static void main(String[] args) {
		/*
		 * 4380���� 500��, 100��, 50��, 10��¥���� �����ϱ� ���ؼ� �ʿ��� ������ ������ ���ϴ� ���α׷�. �迭�� �̿��ϱ�
		 */
		int m = 4380;
		int[] u = new int[] { 500, 100, 50, 10 };
		int tmp;
		System.out.printf("�ݾ�: %d\n",m);
		//�ۼ��� ���
//		for (int i = 0; i < u.length; i++) {
//			tmp = m/u[i];
//			System.out.printf("%d��: %d��\n",u[i],tmp);
//			m-=u[i]*tmp; //====�̰��� �� ����������� ������.
//		}
		int x;
		for(int n:u) {
			x= m/n;
			System.out.printf("%d��: %d��\n",n,x);
			m%=n;
		}
	}
}
