public class Ex015_Odd5 {
	public static void main(String[] args) {
/*
		1~100���� ���� Ȧ���� �� �ٿ� 5���� ����ϰ� �������� Ȧ�� ���� ����ϴ� ���α׷�
*/
		int n, s, cnt;
		
		n=1;
		s=0;
		cnt=0;
		while(n<=100) {
			s+=n;
			System.out.print(n+"\t");
			cnt++;
			if(cnt%5==0) {
				System.out.println();
			}
			
			n+=2;
		}
		System.out.println("��� : "+s);
		
	}
}
