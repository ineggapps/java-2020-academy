package d200204;

public class WhileQuizHard1 {
	public static void main(String[] args) {
		//1-2+3-4... ���꿡�� ���� ����� 100 �̻��� �Ǵ� �ּ��� ���� �� ���� ���� ����ϴ� ���α׷�
		//100 �̻��� �Ǵ� �ּ��� ���� �ȴٴ� �ǹ̴� �ݺ����� 100 �̸��� ��쿡�� ���ư��� �Ѵٴ� �̾߱��̴�.
		//(�򰥸��� ������ �� �׷��� ��)
		int n=0,s=0;
		while(s<100) {
			System.out.printf("s=%d+%d%n",s,n+1);
			n++;
			//���׿����ڸ� ����Ͽ� ¦���� ��ȣ�� �ٲپ� �ش�.
			s+= (n&1)==1?n:-n;
//			�� ���� ����ϸ� �������� �׻� 1�� ū ���� ���ϱ� ����� ���� => �ᱹ�� ���ѷ���
//			System.out.printf("s=%d+%d%n",s,n+1);
//			s+= (++n);
//			System.out.printf("s=%d-%d%n",s,n+1);
//			s-= (++n);
//			if(n==10)
//			break;
		}
		System.out.printf("n: %d, s: %d",n,s);
	}
}
