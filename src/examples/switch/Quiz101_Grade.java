import java.util.Scanner;

public class Quiz101_Grade {
	public static void main(String[] args) {
/*
		������ �Է¹޾� ��,��,��,��,���� ���ϴ� ���α׷�
*/
        Scanner sc=new Scanner(System.in);
        int s;
        char grade;

		System.out.print("���� ? ");
		s = sc.nextInt();

		switch (s/10) {
		case 10:case 9: grade='��';break;
		case 8: grade='��';break;
		case 7: grade='��';break;
		case 6: grade='��';break;
		default: grade='��';break;
		}
		
		System.out.println("����:"+s+", ����:"+grade);
		
		sc.close();
	}
}
