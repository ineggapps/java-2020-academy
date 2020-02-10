package d200210;

public class ArrayEx1 {
	public static void main(String[] args) {
		/*
		 엄밀히 따지면 JAVA에서는 2차원배열이라는 명칭보다는 배열의 배열이라는 명칭이 맞다. 
		 */
		int[][] a = new int[3][4];// 3행 4열 2차원 배열을 생성
		/*
		 0	0	0	0
		 0	0	0	0
		 0	0	0	0
		 */
		System.out.println("행 수: " + a.length);
		System.out.println("0행의 열 수: " + a[0].length);

		System.out.println("배열의 참조 위치: " + a);
		System.out.println("0행의 참조 위치: " + a[0]);
		System.out.println("1행 2열의 값: " + a[1][2]);
	}
}
