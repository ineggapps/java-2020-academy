package d200207;

public class ArrayEx5 {
	//배열의 초기화 예제
	public static void main(String[] args) {
		int a[] = new int[] { 10, 20, 30, 40, 50 }; // new int[5]{10,20,30,40,50} (X): new int[]{...}로 선언해야 한다.
		//크기를 대괄호 안에 선언하지 않았지만 {} 안에 들어가는 요소의 개수에 따라 자동으로 초기화할 때 배열의 크기를 지정해 준다.
		//변숫값을 선언과 동!시!에! 초기화할 때만 new int[]를 생략할 수 있다.
		int b[] = { 10, 20, 30, 40, 50 }; // 초기화시킬 떄에 한해서는 new int[]를 생략하여도 무방하다.
		//변수 선언 이후에 초기화를 하고 싶다면 반드시 new int[]{...} 로 작성한다.
		int c[];
		c = new int[]{10,20,30,40,50};
		
		System.out.println("요소 수:"+a.length);
		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
}
