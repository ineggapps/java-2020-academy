package d200129;

public class OperEx5 {
	public static void main(String[] args) {
		char a, b;
		a = 65;// a='A';
		// b=a+10; // ������ ����; char+char => int+int => int �ᱣ�� ���°� int���� ���� char�� ������ ������ �� ����.
		b=(char)(a+10);
		System.out.println(b);
	}
}
