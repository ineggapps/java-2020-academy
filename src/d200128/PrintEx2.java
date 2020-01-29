package d200128;

public class PrintEx2 {

	public static void main(String[] args) {
		System.out.print("A\nB\n");//\n: new line
		System.out.print("A\tB\tC\n");//\t: tab
		System.out.println("X\tY\nZ");//\t: tab
		/*
		 +연산자의 기능, 우선순위 (JAVA만 가능)
		 1. 수치의 연산 (덧셈)
		 2. 결합 (문자열)
		 
		 좌변에서 우변으로 가면서 연산을 시작한다.
		 * */
		System.out.println(10+5+"Korea");
		System.out.println("Korea"+10+5);
		System.out.println("Korea"+(10+5));
		System.out.println(10+5+"Korea"+10+5);
		
		System.out.println('A'+10+"korea");
		System.out.println("A"+10+"korea");
		System.out.println("korea"+'A'+10);
	}

}
