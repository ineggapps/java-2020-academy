public class Ex004_Hap {
	public static void main(String[] args) {
/*
		1~100 ���� ������ ���� ����Ͽ� ����ϴ� ���α׷�
*/
		int s, n;
		s=0;
		n=0;
		while(n<100) {
			n++;
			s+=n;
		}
		System.out.println("��� : "+s); // 5050
		
/*		
		int s, n;
		s=n=0;
		while(n++<100) {
			s+=n;
		}
		System.out.println("��� : "+s);
*/		

/*		
		int s, n;
		s=n=0;
		while(++n<=100) {
			s+=n;
		}
		System.out.println("��� : "+s);
*/		
	}
}
