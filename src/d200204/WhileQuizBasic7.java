package d200204;

public class WhileQuizBasic7 {
	public static void main(String[] args) {
		int x=100,y=0;
		int s=0;
		
		/*
		 x�� 100���� �����ؼ� 1�ʸ��� 2�� �����ϰ�
		 y�� 0���� �����ؼ� 5�� �����Ѵ�. �� �� �Ŀ� y�� x�� ����������� ���� ����� �� x�� y�� ���� ���ϴ� ���α׷�
		 * */
		
		/*
		 ��
		 100+2s<5s
		 1000/3<s �̹Ƿ�
		 while���� ����Ǵ� ������ �� �ݴ��̴�.
		 ���� x�� ��>=y�� ��.
		 (�ε�� ������ ��������)
		 * */
		
		while(x>=y) {//x�� y���� Ŭ ���ȸ� ��ȿ
			s++;
			x+=2;
			y+=5;
		}
		
		System.out.printf("x: %d, y: %d\n",x,y);
		System.out.printf("�ɸ� �ð�: %d��\n",s);
	}	
}
