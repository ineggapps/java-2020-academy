public class Ex102_dowhile {
	public static void main(String[] args) {
/*
		1~100 ���� ���� ���� ����Ͽ� ���
*/
		int n, s;
		
		s=n=0;
		do {
			n++;
			s+=n;
		}while(n<100);
		System.out.println("��� : "+s); // 5050
	}
}
