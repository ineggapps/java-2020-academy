package d200210;

public class ArrayEx2 {
	public static void main(String[] args) {
		/*
		 행별로 열의 크기를 다르게 할당할 수 있다. => 배열의 배열이라고 함
		 */
		int[][] a = new int[3][];//열의 크기를 지정하지 않고 이후에 각각의 크기별로 지정이 가능하다.
		a[0] = new int[4];
		a[1] = new int[3];
		a[2] = new int[5];
		System.out.println("배열 행 수: "+a.length);
		System.out.println("0행 열 수: " + a[0].length);
		System.out.println("1행 열 수: " + a[1].length);
		System.out.println("2행 열 수: " + a[2].length);
	}
}
