package d200207;

public class ArrayEx1 {
	public static void main(String[] args) {
		int []a=new int[5];
		
		for (int i=0;i<a.length;i++) {//5�� �ݺ�
			a[i]=i+1;
		}

		//�迭 ����ϴ� ������ ���
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("==���� ���� for���� ���==");
		
		//���� for��
		// JDK 1.5���� ���� (������ ���� JDK 1.7)
		// �º��� �迭�� ��� �ڷ����� ���� ����: �캯�� ����(�迭) 
		for(int n:a) {// �迭�� �ڷ����� ���� ������ ����:�ݺ������� �迭�� �����ּ�(�迭�� ������)
			//�迭�� [0]������ �� �� ÷�ڱ��� �� ���� n�� �����Ͽ� �ݺ����� �����Ѵ�.
			System.out.println(n);
		}
	}
}
