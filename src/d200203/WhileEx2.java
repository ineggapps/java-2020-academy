package d200203;

public class WhileEx2 {
	public static void main(String[] args) {
		int n;
		n=0;//�ʱ�ȭ�� �ʿ��ϴ�
		while(n<10) {//while(����) { //����: true�Ǵ� false�� �����ϴ�
			n++;
			System.out.println("��:"+n);
			/*
			 * n<10 n+=2 (n=2 ���) 2ȸ �ݺ� 
			 * n<10 n+=2 (n=4 ���) 4ȸ �ݺ�
			 * n<10 n+=2 (n=6 ���) 6ȸ �ݺ�
			 * n<10 n+=2 (n=8 ���) 8ȸ �ݺ�
			 * n<10 n+=2 (n=10 ���) 10ȸ �ݺ�
			 * n<10 (false) (����� �������� �ʰ� ��� ������ ����)
			 * */
		}
		System.out.println("��:"+n);
	}
}
