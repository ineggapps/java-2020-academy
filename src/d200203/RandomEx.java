package d200203;

public class RandomEx {
	public static void main(String[] args) {
		//0��n��1 ������ �ᱣ���� ����Ѵ�.
		System.out.println(Math.random());
		//0*3��n*3��1*3
		//0��n*3��3 (��, n*3�� 3 �̻��� ���� ���� �ʴ´�.)
		//ex: 0.999999��� ������ 3�� ���ص� 2.999997�� �����Ƿ� 3 �̻��� ���� ���� �ʴ´�.
		//�� 0+1��n*3��3+1
		//1��n*3��4�� ���� �������� ������ �߻��Ѵ�.
		System.out.println((int)(Math.random()*3)+1);
	}
}
