package d200227;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		//Scanner �� �˾ƺ���
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		String tel;
		String birth;
		
		try {
			System.out.print("�̸� ? ");
			name = sc.nextLine();//\n���� �о \n�� ������ �� ���� ���ڿ��� ��ȯ�Ѵ�. 
			//�׷��� ������ nextLine()�޼���� ��������� ����Ѵ�.

			System.out.print("���� ? ");
			age = sc.nextInt();
			sc.nextLine();//nextInt()�޼��忡�� ���� ���� \n �о ������ ���� ȣ���Ѵ�.
			//next() �Ǵ� nextInt()�� �⺻������ �ܶ� ���ڰ� ����(���� ����)
			//���� ����(����) ������ �о ��ȯ�Ѵ�.
			

			System.out.print("��ȭ��ȣ ? ");
			tel = sc.nextLine();
			
			System.out.print("���� ? ");
			birth = sc.nextLine();
			
			System.out.println(name+":"+age+":"+tel+":"+birth);
		} finally {
			sc.close();
		}
	}
}
