package d200219;

public class Ex10 {
	public static void main(String[] args) {
		Object ob1 = new String("����"); // �� ĳ����
		Object ob2 = new String("����"); // �� ĳ����
		
//		System.out.println("����: "+ ob1.length());//������ ����
		System.out.println("����: "+ ((String)ob1).length());//�ٿ�ĳ����
		
		System.out.println(ob1.equals(ob2));//������ǡ�� �������̵��� �޼��带 ȣ���Ѵ�.
	}
}
