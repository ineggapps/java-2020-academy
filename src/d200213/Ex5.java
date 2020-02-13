package d200213;

public class Ex5 {
	public static void main(String[] args) {
		//비정형인자 JDK5.0부터
		//cf) C언어는 처음부터 존재
		int s;
		Test5 t = new Test5();
//		s = t.sum(new int[] {1,2,3,10,10,10});//배열도 넘어가네!
		s = t.sum(1,2,3,10,10,10);
		System.out.println(s);
		s = t.sum(1,2,3,10,10,10,90,10,100);//오.. 인자의 개수가 달라도 얼마든지 결괏값이 계산이 되네!
		System.out.println(s);
	}
}

class Test5 {
	public int sum(int... n) {
		/*
		 	JAVA가 컴파일할 때 int... < 비정형인자를 배열로 고치는 과정을 거친다.
		 	그래서 아래의 구문에서 배열로 취급하여 연산이 가능한 것이다!
		 */
		int s = 0;
		for (int i : n) {
			s += i;
		}
//		for(int i=0;i<n.length;i++) {
//			s+=n[i];
//		}
		return s;
	}
}
