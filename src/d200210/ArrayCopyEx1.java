package d200210;

public class ArrayCopyEx1 {
	public static void main(String[] args) {
		int[] a = new int[] { 10, 20, 30 };
		int[] b = new int[a.length];
		int[] c = a; // c와 a는 같은 배열을 참조하고 있다는 뜻.

		System.out.println(a==c);//true 같은 배열을 참조하고 있으니까 주솟값이 같다.
		System.out.println(a==b);//false 서로 다른 배열을 참조하므로 주솟값이 다르다.

		//배열
		//arraycopy(원본배열,시작주소,사본배열,시작주소,복사할 길이);
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
