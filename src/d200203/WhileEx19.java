package d200203;

public class WhileEx19 {
	public static void main(String[] args) {
		//1~100������ ���� ����ϵ� ���� 10�� ����� �� ������ ���� ���
		//1~10: 55
		//2~20: 210
		// ...
		//1~100: 5050
		
		int n=0,s=0;
		while(n++<100) {
			s+=n;
			if(n%10==0) {
				System.out.printf("%d~%d������ ��: %d%n",1,n,s);
			}
		}
	}
}
