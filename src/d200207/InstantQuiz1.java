package d200207;

public class InstantQuiz1 {
	public static void main(String[] args) {
		/*
		 * 1~100 ������ ������ 100�� �߻��Ͽ� �� �ٿ� 10���� ����ϰ�
		 * �������ٿ� �߻��� ������ ¦���� Ȧ���� ���� ����ϱ�
		 * */
		int num[]= new int[10];
		int tmp;
		int even,odd;
		for(int i=1;i<=100;i++) {
			tmp = (int)(Math.random()*100)+1;
			System.out.printf("%d\t",tmp);
			if(i>=91) {
				//91��°���� 100��°������ ���� ������ �����ϱ�
				num[i-91]=tmp;
			}
			if(i%10==0) {
				//10���� ��µ� ������ �ٹٲ��ϱ�
				System.out.println();
			}
		}
		even=odd=0;
		for(int i: num) {
			if((i&1)==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.printf("¦���� ����: %d\n",even );
		System.out.printf("Ȧ���� ����: %d\n",odd);
		
	}
}
