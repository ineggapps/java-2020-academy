package d200128;

public class PrintEx2 {

	public static void main(String[] args) {
		System.out.print("A\nB\n");//\n: new line
		System.out.print("A\tB\tC\n");//\t: tab
		System.out.println("X\tY\nZ");//\t: tab
		/*
		 +�������� ���, �켱���� (JAVA�� ����)
		 1. ��ġ�� ���� (����)
		 2. ���� (���ڿ�)
		 
		 �º����� �캯���� ���鼭 ������ �����Ѵ�.
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
