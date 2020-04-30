package d200206;

public class ArrayEx2 {
	public static void main(String[] args) {
		// 배열 선언과 동시에 메모리를 할당한다.
		int a[] = new int[3];
//		int []a=new int[5]; []대괄호가 변수명 앞에 나와도 괜찮음

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		System.out.println("배열의 요소 수: " +a.length);

		//a.length => 배열의 크기를 반환해 준다.
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
