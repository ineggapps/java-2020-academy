import java.util.Scanner;

public class Quiz104_Grade {
	public static void main(String[] args) {
/*
		������ �Է� �޾� ������ ���ϴ� ���α׷�
*/
		Scanner sc=new Scanner(System.in);

		int input;
		System.out.print("���� ? ");
		input=sc.nextInt();
		if(input>=95 && input<=100)
			System.out.println("���� : " + input + ", ���� : 4.5");
		else if(input>=90)
			System.out.println("���� : " + input + ", ���� : 4.0");
		else if(input>=85)
			System.out.println("���� : " + input + ", ���� : 3.5");
		else if(input>=80)
			System.out.println("���� : " + input + ", ���� : 3.0");
		else if(input>=75)
			System.out.println("���� : " + input + ", ���� : 2.5");
		else if(input>=70)
			System.out.println("���� : " + input + ", ���� : 2.0");
		else if(input>=65)
			System.out.println("���� : " + input + ", ���� : 1.5");
		else if(input>=60)
			System.out.println("���� : " + input + ", ���� : 1.0");
		else if(input>=0)
			System.out.println("���� : " + input + ", ���� : 0.0");
		else
			System.out.println("���� �Է� ���� �Դϴ�.");
		
/*		
		int input;
		double result;
		
		System.out.print("���� ? ");
		input=sc.nextInt();
		if(input>=0 && input<=100) {
			if(input>=95)
				result = 4.5;
			else if(input>=90)
				result = 4.0;
			else if(input>=85)
				result = 3.5;
			else if(input>=80)
				result = 3.0;
			else if(input>=75)
				result = 2.5;
			else if(input>=70)
				result = 2.0;
			else if(input>=65)
				result = 1.5;
			else if(input>=60)
				result = 1.0;
			else
				result = 0;
				
			System.out.println("���� : " + input + ", ���� : " + result);
		} else {
			System.out.println("���� �Է� ���� �Դϴ�.");
		}
*/

		sc.close();
	}
}
