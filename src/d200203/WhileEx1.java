package d200203;

public class WhileEx1 {
	public static void main(String[] args) {
		int n;
		n=0;//�ʱ�ȭ�� �ʿ��ϴ�
		while(n<10) {//while(����) { //����: true�Ǵ� false�� �����ϴ�
			n++;
			System.out.println("��:"+n);
			/*
			 * n<10 n++ (n=1 ���) 1ȸ �ݺ�
			 * n<10 n++ (n=2 ���) 2ȸ �ݺ� 
			 * n<10 n++ (n=3 ���) 3ȸ �ݺ�
			 * n<10 n++ (n=4 ���) 4ȸ �ݺ�
			 * n<10 n++ (n=5 ���) 5ȸ �ݺ�
			 * n<10 n++ (n=6 ���) 6ȸ �ݺ�
			 * n<10 n++ (n=7 ���) 7ȸ �ݺ�
			 * n<10 n++ (n=8 ���) 8ȸ �ݺ�
			 * n<10 n++ (n=9 ���) 9ȸ �ݺ�
			 * n<10 n++ (n=10 ���) 10ȸ �ݺ�
			 * n<10 (false) (����� �������� �ʰ� ��� ������ ����)
			 * */
		}
		System.out.println("��:"+n);
	}
}
