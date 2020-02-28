package d200228;

//�������� ���� ���� ���� ������ JAVA���� �����ϴ� Ŭ�������� �������� ����� �� �����Ƿ�
//������ �ǽ��ϸ鼭 ��� ������ ������ ������ SKIP~
public class Ex8Enum {
	public static void main(String[] args) {
		double a = Operation.PLUS.eval(10,5);
		System.out.println(a);
		
		double x=20.0;
		double y=10.2;
		
		for(Operation op: Operation.values()) {
			System.out.printf("%.1f %s %.1f = %.1f\n",x,op,y,op.eval(x, y));
		}
		
	}
}

//enum�� �߻� �޼��带 ������ �� �ִ�.
enum Operation{
	PLUS{double eval(double x, double y){return x+y;}},
	MINUS{double eval(double x, double y){return x-y;}},
	TIMES{double eval(double x, double y){return x*y;}},
	DIVIDE{double eval(double x, double y){return x/y;}};
	//�� �߻�޼���
	abstract double eval(double x, double y);
}
