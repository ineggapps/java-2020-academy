package d200204;

public class ForTest9 {
	public static void main(String[] args) {
		// 1~10������ ��, 11~20������ ��, ..., 91~100������ ���� ���ϴ� ���α׷� �ۼ��ϱ�.
		int s = 0;
		for (int n = 1; n <= 100; n++) {
			s += n;
			if (n % 10 == 0) {
				System.out.printf("%d~%d������ ��: %d\n", n - 9, n, s);
				s = 0;
			}
		}
		
		/*�Ʒ��� �Ϳ��� ���ѷ����� �����̴�.
		 for���� ���� while���� ���� ���� ����(infinite loop)�� ���̰� ������, 
		 for�����ٴ� while(true)�� �̿��Ͽ� ���� ������ �ۼ��Ѵ�.
		 * */

//		int s,n;
//		s=n=0;
//		while(n<10) {
//			n++;
//			s+=n;
//		}
//	
//		int s=0;
//		for(int n=1;n<=10;n++) {
//			s+=n;
//		}
//		System.out.println(s);
//	
//		break: switch~case, while, do~while, for������ Ż���ϱ� ���� ����Ѵ�.
//	�ش�Ǵ� ���� ������ ���� ������.
//		int s=0,n=0;
//		while(true) {//���� ����
//			n++;
//			s+=n;
//			if(n>=10)break;
//		}
//		System.out.println(s);
//	
//		int s=0,n=0;
//		for(;;) {
//			n++;
//			s+=n;
//			if(n>=10)break;
//		}
//		System.out.println(s);
		
//		int s, n;
//		for(s=0, n=1; ; n++) {
//			s+=n;
//			if(n>=10)break;
//		}
//		System.out.println(s);
	}
}
