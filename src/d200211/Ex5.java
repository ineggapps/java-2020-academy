package d200211;

public class Ex5 {
	public static void main(String[] args) {
		//객체 배열
//		int[] arr = new int[5]; 기본자료형과 배열 선언 비교
		Test5[] tt = new Test5[5];
		//★ 배열의 생성 선언 ≠ 객체의 생성 선언
		//Tes5 t0, t1, t2, t3, t4; 5개의 참조변수를 선언한 것과 유사하다. 
		//객체를 아직 생성하지 않은 상태이며 배열의 공간만 할당된 상태이다.
		//그런데 배열은 공간을 할당할 때 기본값으로 참조자료형은 null로 초기화한다.
		//따라서 아래에서 객체를 별도로 생성하여 배열의 인덱스에 할당하지 않는다면 참조할 수 없으며,
		//생성하지 않고 참조한다면 NullPointerException이 발생한다.
		for(int i=0;i<tt.length;i++) {
			tt[i]= new Test5();//생성자를 불러야 객체가 생성된다.
		}
		//생성자를 호출하지 않으면 NullPointerException이 발생한다.
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
