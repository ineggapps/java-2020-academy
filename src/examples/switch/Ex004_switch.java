import java.util.Scanner;

public class Ex004_switch {
	public static void main(String[] args) {
/*
		�Է� �������ڰ� �������� �Ǻ��ϴ� ���α׷�
*/
        Scanner sc=new Scanner(System.in);
        char ch;

		System.out.print("����  ? ");
		ch = sc.next().charAt(0);

		switch(ch) {
			case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': 
			case '9': System.out.println(ch+"��(��) �����Դϴ�."); break;
			default: System.out.print(ch+"��(��) ���ڰ� �ƴմϴ�."); break;
		}
		System.out.println();
		sc.close();
	}
}
