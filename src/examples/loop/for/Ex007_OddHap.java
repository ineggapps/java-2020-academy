public class Ex007_OddHap {
	public static void main(String[] args) {
/*
		1~100 ���� �� �� Ȧ���� ���� ���ϴ� ���α׷�
*/	
		int s, n;
		s=0;
		for(n=1; n<=100; n+=2) {
			s+=n;
		}
		
		System.out.println("��� : "+s); // 2500
		// System.out.println(n); // 101
	}
}
