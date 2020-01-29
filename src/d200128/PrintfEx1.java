package d200128;

public class PrintfEx1 {

	public static void main(String[] args) {
		int a, b, c;
		a = 10;
		b = 25;
		c = a + b;

		System.out.println("합:" + c);
		System.out.println(a + "+" + b + "=" + c);
		//복잡한 서식을 일정한 틀에 맞추어 출력하게 해주는  printf 메서드
		System.out.printf("%d + %d = %d\n",a,b,c);
		System.out.format("%d + %d = %d\n",a,b,c);
		System.out.println("========================");
	}

}
