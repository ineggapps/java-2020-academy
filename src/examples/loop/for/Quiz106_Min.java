import java.util.Scanner;

public class Quiz106_Min {
	public static void main(String[] args) {
/*		
		10���� ������ �Է� ���� �Է� ���� ���� ���� ������
*/		
		Scanner sc=new Scanner(System.in);
		int n, min=0;
		System.out.println("10���� ������ �Է� �ϼ���...");
		for(int i=0; i<10; i++) {
			n=sc.nextInt();
			
			if(i==0) {
				min=n;
			} else if(min > n) {
				min=n;
			}
		}
		System.out.println("�ּҰ� : " + min);
		sc.close();

/*		
		Scanner sc=new Scanner(System.in);
		int n, min=Integer.MAX_VALUE;
		
		System.out.println("10���� ������ �Է� �ϼ���...");
		for(int i=0; i<10; i++) {
			n=sc.nextInt();
			
			if(min > n) {
				min=n;
			}
		}
		System.out.println("�ּҰ� : " + min);
		sc.close();
*/		
	}
}
