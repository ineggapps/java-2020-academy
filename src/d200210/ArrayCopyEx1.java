package d200210;

public class ArrayCopyEx1 {
	public static void main(String[] args) {
		int[] a = new int[] { 10, 20, 30 };
		int[] b = new int[a.length];
		int[] c = a; // c�� a�� ���� �迭�� �����ϰ� �ִٴ� ��.

		System.out.println(a==c);//true ���� �迭�� �����ϰ� �����ϱ� �ּڰ��� ����.
		System.out.println(a==b);//false ���� �ٸ� �迭�� �����ϹǷ� �ּڰ��� �ٸ���.

		//�迭
		//arraycopy(�����迭,�����ּ�,�纻�迭,�����ּ�,������ ����);
		System.arraycopy(a, 0, b, 0, a.length);

		for (int n: b) {
			System.out.print(n + " ");
		}
		System.out.println();
		a[1]=200;
		System.out.println(a[1]+", "+ b[1] + ", "+ c[1]);
		//200, 20, 200
	}
}
