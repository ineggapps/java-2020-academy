public class Ex006_EvenHap {
	public static void main(String[] args) {
/*
		1~100 ���� �� �� ¦���� ���� ���ϴ� ���α׷�
*/	
		int s, n;
		s=0;
		for(n=2; n<=100; n+=2) {
			s+=n;
		}
		
		System.out.println("��� : "+s); // 2550
		// System.out.println(n); // 102
	}
}
