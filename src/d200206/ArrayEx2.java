package d200206;

public class ArrayEx2 {
	public static void main(String[] args) {
		// �迭 ����� ���ÿ� �޸𸮸� �Ҵ��Ѵ�.
		int a[] = new int[3];
//		int []a=new int[5]; []���ȣ�� ������ �տ� ���͵� ������

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		System.out.println("�迭�� ��� ��: " +a.length);

		//a.length => �迭�� ũ�⸦ ��ȯ�� �ش�.
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
