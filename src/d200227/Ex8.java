package d200227;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng;

		System.out.println("�̸�, ����, ����[,�� �����ؼ� �Է�] : ");
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); // \\s: ���� *: ��� ����
		//aa,10,20
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();

		System.out.println(name + ":" + kor + ":" + eng);
		sc.close();
	}
}
