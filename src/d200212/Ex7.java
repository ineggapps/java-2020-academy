package d200212;

public class Ex7 {
	public static void main(String[] args) {
		String s1="����";
		String s2="����";
		String s3=new String("����");
		
		System.out.println(s1+":"+s2+":"+s3);
		
		// A == B : ���⼭ ==�� ��ü�̸� �ּڰ��� ���Ѵ�.
		System.out.println(s1==s2); // true �ּڰ��� �����ϱ� true�� ���Դ�.
		System.out.println(s1==s3); // false  �ּڰ��� �޶� false�� ���Դ�.
		System.out.println(s1.equals(s3)); // true �ּڰ��� ������ �ʰ� ���ڿ��� ���� �������Ƿ� true�� ���Դ�.
	}
}
