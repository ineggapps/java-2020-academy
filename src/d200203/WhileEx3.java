package d200203;

public class WhileEx3 {
	public static void main(String[] args) {
		int n;
		n=1;//�ʱ�ȭ�� �ʿ��ϴ�
		while(n<10) {//while(����) { //����: true�Ǵ� false�� �����ϴ�
			n+=2;
			System.out.println("��:"+n); // 3 5 7 9 11
		}
		System.out.println("��:"+n);//11
	}
}
