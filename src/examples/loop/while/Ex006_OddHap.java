public class Ex006_OddHap {
	public static void main(String[] args) {
/*
		1~100 ���� �� �� Ȧ���� ���� ����Ͽ� ����ϴ� ���α׷�
*/
		int s, n;
		s=0;
		n=1;
		while(n<=100) {
			s+=n;
			n+=2;
		}
		System.out.println("��� : "+s); // 2500
	}
}
