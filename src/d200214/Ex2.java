package d200214;

public class Ex2 {
	public static void main(String[] args) {
		//���ڿ��� ���ڿ� ��� ������ ����ȴ�. (�� ����)
		//1) ���ڿ��� �����ϰ� ����� �ּڰ��� s1�� ����
		String s1 = "seoul";
		//2) ������ ���ڿ��� s2�� �����ϴ� ��� "seoul"�̶�� ���ڿ���ü�� �̹� �����ϹǷ� "seoul"�� �ּڰ��� s2�� ����
		String s2 = "seoul";
		//3) �� �ٸ� "seoul"�̶�� ���ڿ� ��ü�� ���� �����ǰ� ���� ������ ��ü�� �ּڰ��� s3�� ���Եȴ�.
		String s3 = new String("seoul");
		//== ��ü���� ==�� �ּڰ��� ���Ѵ�.
		System.out.println(s1 == s2);//�ּҰ� �����ϴ�.
		System.out.println(s1 == s3);//�ּҰ� �ٸ���
		System.out.println(s1.equals(s2));//String�� equals�޼���� ���� �������� ���Ѵ�. Object�� equals �޼��带 �������̵��Ͽ���.
		System.out.println(s1.equals(s3));

		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		System.out.println("s3:" + s3);

		//���� ���� ��ü�� �ؽ��ڵ�� �����ϴ�. ������ ���� �������� �ʴ´�.
		//�̰������� ���������� ���� �ٸ� ��ü�ε��� hashCode�� �����ϴ�. 
		System.out.println("s1:" + s1.hashCode());
		System.out.println("s2:" + s2.hashCode());
		System.out.println("s3:" + s3.hashCode());
	}
}
