package d200128;

public class TypeEx2 {	
	public static void main(String[] args) {
		byte a,b,c;//-128~127������ ǥ���� �� �ִ�.
		
		a=25; //'A'~'Z':65~90, 'a'~'z': 97~122
		b='A';
		System.out.println(a+","+b);

		//		c=90;
//		c=a+b;//mismatch error: cannot convert to from int to byte
		//����� int���̹Ƿ� int �� byte�� ������ �� ����. (byte+byte�� ���������� ��ǻ�� �ڵ����� int������ ��ȯ�� �ش�)
		c=(byte)(a+b);// int���� byte������ ���� ��ȯ�Ͽ� ����
		System.out.println(c);
		
//		c=200; //������ ����
		c=(byte)200; //������ ����
		System.out.println(c);
	}
}
