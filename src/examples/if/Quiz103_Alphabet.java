import java.util.Scanner;

public class Quiz103_Alphabet {
	public static void main(String[] args) {
/*
		�����ڸ� �Է� �޾� �Է� ���� ���ڰ� �ҹ����̸� �빮�ڷ�,
		�빮���̸� �ҹ��ڷ� ��ȯ�ϴ� ���α׷�
*/
		Scanner sc=new Scanner(System.in);
		char ch, result;
		
		System.out.print("���� ? ");
		ch=sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z') {
			result=(char)(ch+32);
		} else if(ch>='a' && ch<='z'){
			result=(char)(ch-32);
		} else {
			result = ch;
		}
		
		System.out.println(ch + " => " + result);
		
		sc.close();
	}
}
