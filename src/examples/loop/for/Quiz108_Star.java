import java.util.Scanner;

public class Quiz108_Star {
	public static void main(String[] args) {
/*
		Ȧ���� �Է� �޾� ���̾Ƹ�� ����� ����ϴ� ���α׷�
*****
 ***
  *
 ***
***** 
*/
		Scanner sc=new Scanner(System.in);
		int size;
		int m;
		
		do {
			System.out.print("ũ�� ?");
			size=sc.nextInt();
		} while(size<1 || size > 10 || size%2==0);
		
		m=0;
		for(int i=0; i<size; i++) {
			for(int j=0; j<size-m; j++) {
				System.out.print(j>=m ? "*" : " ");
			}
			m=i<(size/2)?m+1:m-1;
			System.out.println();
		}
		
		sc.close();
	}
}
