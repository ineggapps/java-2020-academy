import java.util.Scanner;

public class Quiz209_Sosu {
	public static void main(String[] args) {
/*		
		������ �Է� �޾� �Է� ���� ������ �Ҽ������� �Ǻ�
*/		
		Scanner sc=new Scanner(System.in);

		int num;
		System.out.print("���� ? ");
		num = sc.nextInt();

		int n = 2;
		boolean b = true;
		while(n < num) {
			if(num % n == 0) {
				b = false;
				break;
			}
			n++;
		}

		if(b && num != 1) {
			System.out.println(num + " : �Ҽ�");
		} else { 
			System.out.println(num + " : �Ҽ��� �ƴ�");
		}
		
/*		
		int n = 1;
		while(n<num) {
			n++;
			if(num%n == 0)
				break;
		}
		if(n != num || num == 1) {
			System.out.println(num + " : �Ҽ��� �ƴ�");
		} else {
			System.out.println(num + " : �Ҽ�");
		}
*/

		sc.close();
	}
}
