package d200207;

public class ArrayEx7 {
	public static void main(String[] args) {
		// 1~10���� ������ �� �ٿ� 10���� ����ϰ� �������� �� ������ �߻� Ƚ���� ����ϱ�.
		// (int)(Math.random()*10)+1;

		int[] count = new int[10];
		int num;

		System.out.println("�߻��� ����...");
		for (int i = 1; i <= 100; i++) {
			num = (int) (Math.random() * 10) + 1;
			count[num-1]++;
			System.out.printf("%3d\t", num);
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n���ں� �߻� Ƚ��");
		System.out.println("��\t Ƚ��");
		for(int i=0;i<count.length;i++) {
			System.out.printf("%d\t%dȸ\n",i+1,count[i]);
		}
	}
}
