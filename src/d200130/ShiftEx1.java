package d200130;

public class ShiftEx1 {
	public static void main(String[] args) {
		int a=126;
		int b;
		b= a<<2;//a*2^2
		System.out.println(b);
		
		b= a<<2;//a*2^-2
		System.out.println(b);
		
		a= -32;
		b=a>>3;//a�� ���� ������ 8�� ���� ���� ���ϴ� �Ͱ� �����ϴ�. ������ ��쿡�� ��ȣ��Ʈ�� 1�� ����ؼ� ä������.
		System.out.println(b);
		
		a = -32;
		b=a>>>3;//a�� ���� ������ 8�� ���� ���� ���ϴ� �Ͱ� �����ϴ�. ������ ������ ��쿡�� 
		System.out.println(b);
	}
}
