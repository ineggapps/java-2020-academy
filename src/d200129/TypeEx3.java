package d200129;

public class TypeEx3 {
	public static void main(String[] args) {
		char a;
		int b;
		
		a='\u0041'; //10������ 65�̴�.
		System.out.println(a);
		
		b='\013';// 8������ 13�̴�. (10������ 11�̴�)
		System.out.println(b);
		
		a='\105';//10���� 69 => A(65), B(66), C(67), D(68), E(69)
		System.out.println(a);//E
		
		a=97;
		System.out.println(a);//97=='a'
		
		System.out.println('\\');
		
		int c='��';
		System.out.println(c);
		
		a='A';//char�� �����Ͽ���
//		a=a+10;//Type mismatch: cannot convert from int to char
		a=(char)(a+10);//ĳ����
		System.out.println(a);
		
		b='A';//int�� �����Ͽ���
		b=b+'C'; // 65+67�� �ᱣ���� 132�� ����ȴ�.
		System.out.println(b);
		
		float d='A';//�Ǽ������� ����Ǿ����Ƿ� 65.0���� ����ȴ�.
		System.out.println(d);
		
		System.out.println(123+123+"123"+123);
	}
}
