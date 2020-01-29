package d200128;

public class PrintEx1 {

	public static void main(String[] args) {
		/*
		 * System.out.print() 예제 값을 출력한다. 출력 후 라인을 넘기지 않는다.
		 */

		System.out.print("korea");// 문자"열" 출력
		System.out.print(30);// 정수 출력
		System.out.print('A');// 문자 출력
//		System.out.print();//컴파일 오류. 문법적으로 잘못됨		
		System.out.print("X\n");// \n: 출력 후 라인 넘김
		System.out.print("Y");
		System.out.print("\n\n");
		System.out.print("Z");
		// System.out.print();//문자 출력

		/*
		 * System.out.println()예제 값을 출력한다. 출력 후 라인을 넘긴다.
		 */

		System.out.println("1");
		System.out.println();// ==System.out.print("\n");
		System.out.println("2");
		System.out.println("3");
	}

}
