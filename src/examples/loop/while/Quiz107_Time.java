public class Quiz107_Time {
	public static void main(String[] args) {
/*		
		x�� 100���� �����ؼ� 1�ʸ��� 2�� �����ϰ� y�� 0���� �����ؼ� 1�ʸ��� 5�� ���� �Ѵ�.
		�� �� �Ŀ� y�� x�� ���� ������� ���� ����� �� x�� y�� ��
*/
		int x=100, y=0;
		int s=0;
		
		while(x>=y) {
			s++;
			x+=2;
			y+=5;
		}
		
		System.out.println("x : "+ x +", y : " + y);
		System.out.println("�ɸ��ð� : " + s +"��");
	}
}
