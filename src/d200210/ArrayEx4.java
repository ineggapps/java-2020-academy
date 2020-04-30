package d200210;

public class ArrayEx4 {
	//배열의 배열 예제 ex2 1~20까지의 수를 행렬에 대입하기
	/*
	1		2		3		4
	5		6		7		8
	9		10		11		12
	13		14		15		16
	17		18		19		20
	 * */
	public static void main(String[] args) {
		int[][] a = new int[5][4];
		int n = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]= ++n;
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d\t", a[i][j]);
			}
			System.out.println();
		}
	}
}
