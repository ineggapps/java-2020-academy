import java.util.Scanner;

public class Quiz107_Multiple35 {
	public static void main(String[] args) {
/*
		 �� ���� ������ �Է¹޾� �Է� ���� ���� 
		 ���������� ū�� ����(�� ������ ����)�� 
		 3�� ����̰ų� 5�� ����� ������ �հ� ����� ���
*/
		
		Scanner sc = new Scanner(System.in);
		int n1, n2, temp;
		int s, cnt;
		
		System.out.print("������ ? ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		if(n1>n2) {
			temp=n1; n1=n2; n2=temp;
		}
		
		s=cnt=0;
		for(int i=n1; i<=n2; i++) {
			if(i%3==0 || i%5==0) {
				s+=i;
				cnt++;
			}
		}
		
		System.out.println("��:"+s);
		System.out.println("���:"+(s/cnt));		
		sc.close();
	}
}
