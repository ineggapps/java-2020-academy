package d200204;

public class WhileQuizBasic4 {
	public static void main(String[] args) {
		//1~100������ �� �� 3 �Ǵ� 5�� ����� �հ� ����� ���ϴ� ���α׷� �ۼ��ϱ�
		int n=0,cnt=0,sum=0,avg=0;
		while(n<100) {
			n++;
			if(n%3==0 || n%5==0) {
				sum+=n;
				cnt++;
			}
		}
		avg=sum/cnt;
		System.out.println("��: "+sum);
		System.out.println("���: "+avg);
	}
}
