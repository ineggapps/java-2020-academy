public class Ex005_EvenHap {
	public static void main(String[] args) {
/*
		1~100 ���� �� �� ¦���� ���� ����Ͽ� ����ϴ� ���α׷�
*/
		int s, n;
		s=0;
		n=0;
		while(n<100) {
			n+=2;
			s+=n;
		}
		System.out.println("��� : "+s); // 2550
	}
}
