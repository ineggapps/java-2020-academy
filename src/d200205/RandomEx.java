package d200205;

public class RandomEx {
	public static void main(String[] args) {
		int n;
		for(int i=1;i<=100;i++) {
			/* 
			 * Math.random()�� 0���� 1�̸��� �Ǽ��� �߻���Ŵ.
			 * ������ 0���� 0.999999999999999999�������̴�.
			 * 0 			<= Math.random() 		< 1 ������ ���� �߻�
			 * 0*100 <= Math.random()*100 < 100 ������ ���� �߻�
			 * 0+1    <= Math.random()*100+1 < 100+1
			 �� 1         <= Math.random()*100+1 < 101
			*/
			n = (int)(Math.random()*100)+1;
			System.out.printf("%5d\t",n);
			if(i%10==0) {
				System.out.println();
			}
		}
	}
}
