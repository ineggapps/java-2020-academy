package d200207;

public class ArrayEx5 {
	//�迭�� �ʱ�ȭ ����
	public static void main(String[] args) {
		int a[] = new int[] { 10, 20, 30, 40, 50 }; // new int[5]{10,20,30,40,50} (X): new int[]{...}�� �����ؾ� �Ѵ�.
		//ũ�⸦ ���ȣ �ȿ� �������� �ʾ����� {} �ȿ� ���� ����� ������ ���� �ڵ����� �ʱ�ȭ�� �� �迭�� ũ�⸦ ������ �ش�.
		//�������� ����� ��!��!��! �ʱ�ȭ�� ���� new int[]�� ������ �� �ִ�.
		int b[] = { 10, 20, 30, 40, 50 }; // �ʱ�ȭ��ų ���� ���ؼ��� new int[]�� �����Ͽ��� �����ϴ�.
		//���� ���� ���Ŀ� �ʱ�ȭ�� �ϰ� �ʹٸ� �ݵ�� new int[]{...} �� �ۼ��Ѵ�.
		int c[];
		c = new int[]{10,20,30,40,50};
		
		System.out.println("��� ��:"+a.length);
		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
}
