public class Ex002_switch {
	public static void main(String[] args) {
/*
		13이 3의 배수인지 확인하는 프로그램
*/
		int n=13;
		switch(n%3) {
		case 0: System.out.println(n+" : 3의 배수"); break;
		case 1: case 2: System.out.println(n+" : 3의 배수가 아님"); break;
		}
	}
}
