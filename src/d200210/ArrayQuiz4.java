package d200210;

public class ArrayQuiz4 {
	public static void main(String[] args) {
		/*
		 5�� 5���� �迭�� 1~15������ ���� ������ó�� �� �����ﰢ�� ������� ä���� ���
		 1		2		3		4		5
	 			6		7		8		9
 						10		11		12	
 								13		14
 										15
		 */
		
		int a[][] = new int[5][5];
		int cnt=1;
		//�����Ͽ� ���� �����ϱ�
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a[0].length;j++) {
				a[i][j]=cnt++;
			}
		}
		//����ϱ�
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]!=0) {					
					System.out.printf("%3d\t",a[i][j]);
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
