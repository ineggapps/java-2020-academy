public class Ex005_Hap {
	public static void main(String[] args) {
/*
		1~10 ���� ������ ���� ���ϴ� ���α׷�
*/	
		int s, n;
		s=0;
		for(n=1; n<=10; n++) {
			s+=n;
			// System.out.print(n+":"+s+"  ");
			//  1:1  2:3  3:6  4:10  5:15  6:21  7:28  8:36  9:45  10:55
		}
		System.out.println("��� : "+s);
		// System.out.println(" out ->"+n+":"+s); // 11:55
		
/*		
		int s=0;
		for(int n=1; n<=10; n++) { // for�� �ȿ��� ���� ����
			s+=n;
		}
		// System.out.println(n); // ������ ����. for������ ������ ������ �ܺ� ��� �Ұ�
		System.out.println("��� : "+s);
*/

/*		
		int s, n;
		for(n=1, s=0; n<=10; s+=n, n++)
			;
		
		System.out.println("��� : "+s);
*/
	}
}
