package d200204;

public class ForEx8 {
	public static void main(String[] args) {
		//1~100������ �� �� 3�� ����̰ų� 5�� ����� �� �ٿ� 5���� ����ϰ�
		//�������� �հ� ����� ���
		int sum,avg,cnt;
		sum=avg=cnt=0;
		/*
		#1. �ε�ȣ <, <=, >, >= �� �߿伺 (����� õ������!), 
		#2. �ʱ갪 ������ �߿��ϴ�.
		#3. ���ȭ��Ű�� if, while, for() ���� �� �߰�ȣ {} �� ���� �鿩���� �ϱ�
		 **/
		for(int n=1;n<=100;n++) {
			if(n%3==0 || n%5==0) {
				sum+=n;
				System.out.printf("%d\t\t",n);
				if(++cnt%5==0) {
					System.out.println();
				}
			}
		}
		if(cnt%5!=0) {
			System.out.println();
		}
		avg=sum/cnt;
		System.out.printf("��: %d\n���: %d",sum,avg);
		
		//���ʽ� ��������
		//3�� ���
		System.out.println();
		for(int n=3;n<=100;n+=3) {
			System.out.print(n+" ");
		}
		//5�� ���
		System.out.println();
		for(int n=5;n<=100;n+=5) {
			System.out.print(n+" ");
		}
	}
}
