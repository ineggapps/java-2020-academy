package d200203;

public class WhileEx8 {
	public static void main(String[] args) {
		int n = 0, s = 0;
		//1~10������ ���� ���ϱ�
		while (n < 10) {
			n++;
			s += n;
			System.out.printf("%d,%d%n",n,s);
		}
		System.out.println("���: " + s);
	}
}
