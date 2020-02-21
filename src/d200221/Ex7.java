package d200221;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		try {
			System.out.print("�� �� ? ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a + b;
			System.out.println(c);
		} catch (InputMismatchException e) {
			//InputMismatchException: unchecked ����
			//Scanner�� nextInt()�� ��� ���ڰ� �Էµ��� ���� ��� ������ �߻��Ѵ�.
			System.out.println("���ڸ� �Է� �����մϴ�.");
			e.printStackTrace();
		} finally {
			// ���ܰ� �߻��Ͽ��� ������ �����Ѵ�. (�� ���� end������ ������� �ʰŵ�!)
			System.out.println("���ܿ� ������� ����ȴ�.");
			sc.close();
		}

		System.out.println("end");
	}
}
