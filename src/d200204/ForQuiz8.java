package d200204;

public class ForQuiz8 {
	public static void main(String[] args) {
		//�� ���� �ֻ����� ���� �� �ֻ����� ���� ���� 9�� �Ǵ� ��츦 ��� ����ϴ� ���α׷�
		int sum;
		for(int a=1;a<=6;a++) {
			for(int b=1;b<=6;b++) {
				sum=a+b;
				if(sum==9) {
					System.out.printf("[%d, %d]%n",a,b);
				}
			}			
		}
	}
}
