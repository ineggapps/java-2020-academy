package d200129;

//Ctrl+Shift+o: auto import
import java.util.Scanner;

public class InputEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name, tel;
		int age;

		System.out.print("�̸�? ");
		name = sc.nextLine(); // �߰����� ������ ����Ѵ�
		System.out.print("����? ");
		age = sc.nextInt();
		sc.nextLine();// �̹� ���ٿ��� nextInt()���� ���ڸ� �Է��ϸ鼭 ���Ͱ����� �Է¹޾����Ƿ� �̸� �ν��Ͽ� �Է��� �����Ѵ�.
		System.out.print("��ȭ��ȣ? ");
		tel = sc.nextLine();

		System.out.format("\nname:%s, age:%d, tel:%s", name, age, tel);
		sc.close();
	}
}
