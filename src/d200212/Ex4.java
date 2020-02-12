package d200212;

public class Ex4 {
	public static void main(String[] args) {
		int[] aa;
		Test4 t = new Test4();
		aa = t.random(10);

		for (int a : aa) {
			System.out.print(a + "\t");
		}
		System.out.println();
	}
}

class Test4 {
	public int[] random(int n) {
		if (n <= 1) {
			return null;
		}
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = (int) (Math.random() * 100) + 1;
		}
		return a;
	}
}