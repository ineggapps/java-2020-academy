public class Ex016_Multiple {
	public static void main(String[] args) {
/*
		1~100���� ���� 3 �Ǵ� 5�� ����� ������ ���� �� �ٿ� 5���� ���
*/
		int n, cnt;
		
		n=0;
		cnt=0;
		while(n<100) {
			n++;
			if(n%3!=0 && n%5!=0) {
				System.out.print(n+"\t");
				cnt++;
				
				if(cnt%5==0) {
					System.out.println();
				}
			}
		}
	}
}
