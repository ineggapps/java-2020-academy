package d200207;

public class ArrayEx4 {
	public static void main(String[] args) {
		int []a= new int[3];
		int []b= a;
		/*
			b�迭 ������ ������ �� a�� �����ּҷ� �ʱ�ȭ�Ͽ����Ƿ�
			�迭��ü�� ���� �����Ǵ� ���� �ƴ϶� a���� �迭�� ���� �ּҸ� �����ϴ� �ϳ��� ������ ������ �ȴ�.
			���� a[n]�� b[n]�� ��� ����Ű�� �迭�� ÷�ڰ� �����Ƿ� �Ȱ��� ���� �����Ѵٰ� �� �� �ִ�.
			
			�ع迭�� �Ϲ� ������ �ƴ϶�� �Ϳ� ��������.
			�迭�� ������ �����μ� �ּڰ��� ���Ѵ�.
			�ּڰ��� �����ϸ鼭 �ϳ��� �迭�� ������ �����ϸ� ����� �� �ִ�.
		 */
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		b[1]=200;
		System.out.println("a�迭�� ����");
		for(int n:a) {			
			System.out.print(n+" ");//10 200 30
		}
		System.out.println();
		System.out.println("b�迭�� ����");
		for(int n:b) {			
			System.out.print(n+" ");//10 200 30
		}
		System.out.println();
	}
}
