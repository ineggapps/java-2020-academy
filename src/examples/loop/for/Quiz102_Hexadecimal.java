import java.util.Scanner;

public class Quiz102_Hexadecimal {
	public static void main(String[] args) {
/*
		������ �Է� �޾� 16������ ��ȯ�ϴ� ���α׷�
*/
		Scanner sc = new Scanner(System.in);

		int num;
		
		System.out.print("���� ? ");
		num=sc.nextInt();
		// System.out.printf("%X\n", num);
		
		String s="";
		int mod;
		while(true) {
			mod=num%16;
			if(mod<10) {
				s=mod+s;
			} else {
				s=(char)(65+(mod-10))+s;
			}
			
			num=num/16;
			if(num==0)
				break;
		}
		
		System.out.println("��� : "+s);
		
		sc.close();
	}
}
