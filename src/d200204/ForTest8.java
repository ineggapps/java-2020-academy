package d200204;

public class ForTest8 {
	//1~100���� �� �� 3�� ����� �� �ٿ� 10���� ����ϰ� �������� 3�� ��� �� �� ����� ���
	public static void main(String[] args) {
		int cnt = 0;
		int sum=0, avg=0;
		for (int n = 3; n <= 100; n += 3) {
			cnt++;
			sum+=n;
			System.out.printf("%d\t",n);
			if(cnt%10==0) {
				System.out.println();
			}
		}
		avg=sum/cnt;
		if(cnt%10!=0) {
			System.out.println();
		}
		System.out.println("��: "+sum);
		System.out.println("���: "+avg);
	}
}
