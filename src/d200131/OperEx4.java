package d200131;

public class OperEx4 {
	public static void main(String[] args) {
		char a='A';
		char b;
		
		b='A'+3;//�ڸ��ͷ������� ������ ����ȯ�� �Ͼ�� �ʴ´�.
		System.out.println(a+","+b);
	
		//b=a+3; Error. �� ��ȯ�� �Ͼ�� int������ ��ȯ�ȴ�. �̰��� char�� ������ b�� ������ �� ����.
		b=(char)(a+3);
		System.out.println(a+","+b);
		
		b=60+20;//�ڸ��ͷ������� ������ ����Ǿ����Ƿ� ������ �߻����� �ʴ´�.
		//�� ��ü�� �ٶ󺸱�.
		/*
		 byte a = 10;
		 ���⼭ 10�̶�� ���ͷ��� int���ε��� �ұ��ϰ� ������ �߻����� �ʾҴ�.
		 byte b = 200;
		 ��, �������� ������ �ʰ��ϴ�(-128~127) ��쿡�� ������ �߻��ϹǷ� �� ���� �����Ѵ�.
		 */
		System.out.println(b);
	}
}
