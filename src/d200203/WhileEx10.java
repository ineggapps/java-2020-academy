package d200203;

public class WhileEx10 {
	public static void main(String[] args) {
		int n = 0, s = 0;
		//1~10������ ���� ���ϱ�
		while (n++ < 10) {
			s += n;
		}
		System.out.println("���: " + s);
	}
}
