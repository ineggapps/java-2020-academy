package d200210;

public class ArrayQuiz3 {
	public static void main(String[] args) {
		/*
		 4�� 5���� �迭�� 1~20������ ���� ������ó�� ä�� ����ϴ� ���α׷� �ۼ��ϱ�
		 1		8		9		16		17
		 2		7		10		15		18
		 3		6		11		14		19
		 4		5		12		13		20
		 */
		int a[][] = new int[4][5];
		int cnt=1;
		//�����ϱ�
		for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<a.length;j++) {
//				�� �ٷ� �����Ų ���׿����ڴ� ������ ����.
//				a[((i&1)==1?a.length-1-j:j)][i]=cnt++;
				
				//�����ϸ� ������ ����.
				cnt++;
				if(i%2==0) {
					a[j][i]=cnt;
				}else {
					a[a.length-1-j][i]=cnt;
				}
				
			}
		}
		//���
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.printf("%3d\t",a[i][j]);
			}
			System.out.println();
		}
	}
}
