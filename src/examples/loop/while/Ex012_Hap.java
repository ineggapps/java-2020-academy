public class Ex012_Hap {
	public static void main(String[] args) {
/*
		1~100������ ���� ���ϴ� ���α׷��� �ۼ��ϵ� ���� 10�� ����� �� ������ ���� ���
*/
		int s, n;
		
		s=n=0;
		while(n<100) {
			n++;
			s+=n;
			if(n%10==0)
				System.out.println("1~"+n+"���� �� : " + s);
		}
	}
}
