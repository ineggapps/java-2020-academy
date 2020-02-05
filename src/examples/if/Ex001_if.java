public class Ex001_if {
	public static void main(String[] args) {
/*
		-10에 대한 절대값을 구하는 프로그램
*/
		int n;
		n=-10;
		
		if(n<0)
			n = -n;
		
		System.out.println("절대값 : " + n);
	}
}
