package d200129;

public class TypeEx3 {
	public static void main(String[] args) {
		char a;
		int b;
		
		a='\u0041'; //10진수로 65이다.
		System.out.println(a);
		
		b='\013';// 8진수로 13이다. (10진수로 11이다)
		System.out.println(b);
		
		a='\105';//10진수 69 => A(65), B(66), C(67), D(68), E(69)
		System.out.println(a);//E
		
		a=97;
		System.out.println(a);//97=='a'
		
		System.out.println('\\');
		
		int c='대';
		System.out.println(c);
		
		a='A';//char로 선언하였음
//		a=a+10;//Type mismatch: cannot convert from int to char
		a=(char)(a+10);//캐스팅
		System.out.println(a);
		
		b='A';//int로 선언하였음
		b=b+'C'; // 65+67의 결괏값인 132가 저장된다.
		System.out.println(b);
		
		float d='A';//실수형으로 선언되었으므로 65.0값이 저장된다.
		System.out.println(d);
		
		System.out.println(123+123+"123"+123);
	}
}
