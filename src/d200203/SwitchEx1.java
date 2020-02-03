package d200203;

public class SwitchEx1 {
	public static void main(String[] args) {
		int a=3;
		switch(a) {//switch( ___ ) 변수, 연산식 모두 올 수 있다.
			//case 리터럴: 구문 작성
			case 3: System.out.print("*");
			case 2: System.out.print("#");
			case 1: System.out.print("$");
		}
	}
}
