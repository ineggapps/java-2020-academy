package d200130;

public class OperEx3 {
	public static void main(String[] args) {
		char a = 'A', b;

		// b = a + 1; ������ ���� char + int => int + int => int �ᱣ���� �߻��Ѵ�.
		b = (char) (a + 1);
		System.out.printf("%c, %c\n",a,b);

		//�� ��������(++, --): byte, short, char���� ���� �� int�� ����ȯ�� �Ͼ�� �ʴ´�.
		//�ٸ� ++, --�� ��ġ�� ���� ������ ������ �޶����� �Ϳ� �����Ѵ�.
		b = ++a;
		System.out.printf("%c, %c\n",a,b);
		
		a = 'A';
		b = a++;//a�� ���㰪�� ������ �Ŀ� a���� �����ϴ� ������ �����Ѵ�.
		System.out.printf("%c, %c\n",a,b);
	}
}
