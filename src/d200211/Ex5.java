package d200211;

public class Ex5 {
	public static void main(String[] args) {
		//��ü �迭
//		int[] arr = new int[5]; �⺻�ڷ����� �迭 ���� ��
		Test5[] tt = new Test5[5];
		//�� �迭�� ���� ���� �� ��ü�� ���� ����
		//Tes5 t0, t1, t2, t3, t4; 5���� ���������� ������ �Ͱ� �����ϴ�. 
		//��ü�� ���� �������� ���� �����̸� �迭�� ������ �Ҵ�� �����̴�.
		//�׷��� �迭�� ������ �Ҵ��� �� �⺻������ �����ڷ����� null�� �ʱ�ȭ�Ѵ�.
		//���� �Ʒ����� ��ü�� ������ �����Ͽ� �迭�� �ε����� �Ҵ����� �ʴ´ٸ� ������ �� ������,
		//�������� �ʰ� �����Ѵٸ� NullPointerException�� �߻��Ѵ�.
		for(int i=0;i<tt.length;i++) {
			tt[i]= new Test5();//�����ڸ� �ҷ��� ��ü�� �����ȴ�.
		}
		//�����ڸ� ȣ������ ������ NullPointerException�� �߻��Ѵ�.
		tt[0].b=200;
		tt[0].print();//10:200
		tt[2].print();//10:5
		System.out.println("The end...");
	}
}

class Test5 {
	int a=10;
	int b=5;
	
	public void print() {
		System.out.println(a+":"+b);
	}
}
