public class Ex008_Multiple3 {
	public static void main(String[] args) {
/*
		1~100 ���� �� �� 3�� ����� �� �ٿ� 10���� ����ϰ�
		�������� 3�� ��� ���� ����ϴ� ���α׷�
*/
		int s, cnt;
		s=cnt=0;
		for(int n=3; n<=100; n+=3) {
			s+=n;
			System.out.printf("%5d", n);
			cnt++;
			if(cnt%10==0)
				System.out.println();
		}
		System.out.println("\n�� : "+s);
		System.out.println("��� : "+(s/cnt));
		
	}
}
