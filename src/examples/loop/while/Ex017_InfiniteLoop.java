public class Ex017_InfiniteLoop {
	public static void main(String[] args) {
/*
		1~10������ ������ ���� ��� : ���� ����(infinite loop), break ���
*/
		int n, s;
		
		n=0;
		s=0;
		while(true) { // ���� loop
			n++;
			s+=n;
			if(n==10) {
				break; // while ���� ��������
			}
		}
		System.out.println("��� : "+s); // 55
	}
}
