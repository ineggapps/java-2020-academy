package d200207;

public class ArrayEx4 {
	public static void main(String[] args) {
		int []a= new int[3];
		int []b= a;
		/*
			b배열 변수를 선언할 때 a의 시작주소로 초기화하였으므로
			배열객체가 새로 생성되는 것이 아니라 a값의 배열의 시작 주소를 참조하는 하나의 포인터 변수가 된다.
			따라서 a[n]과 b[n]은 모두 가리키는 배열의 첨자가 같으므로 똑같은 값을 공유한다고 볼 수 있다.
			
			※배열은 일반 변수가 아니라는 것에 주의하자.
			배열은 참조형 변수로서 주솟값을 지닌다.
			주솟값을 공유하면서 하나의 배열의 공간을 공유하며 사용할 수 있다.
		 */
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		b[1]=200;
		System.out.println("a배열의 내용");
		for(int n:a) {			
			System.out.print(n+" ");//10 200 30
		}
		System.out.println();
		System.out.println("b배열의 내용");
		for(int n:b) {			
			System.out.print(n+" ");//10 200 30
		}
		System.out.println();
	}
}
