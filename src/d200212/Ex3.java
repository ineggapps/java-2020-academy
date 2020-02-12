package d200212;

public class Ex3 {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9 };
		Test3 t = new Test3();
		t.sub(arr);//매개변수가 배열이면 실인수도 배열이어야 한다.
		//배열은 참조자료형이므로 파라미터에는 배열객체의 주솟값이 넘어간다.
		System.out.println(arr[2]);//100을 출력한다.
		//자바의 기본적인 파라미터 전달 방식은 call by value이다.
		//기본자료형은 값 자체를 넘겨주므로 가인수에서 가공된 내용값은 보존되지 않는다.
		int n = 0;
		t.sub2(n);
		System.out.println(n);// 0결괏값이 출력된다
		
		int[] aa = {1,3,5,7,9};
		t.sub3(aa);
		System.out.println(aa[2]);
		
		/*
		 Call by value vs reference 차이
		 
		 Call by value:
		 형식매개변수(메서드쪽)와 실매개변수(넘기고자 하는 실제 값)는 기억공간을 공유하지 않는다.
		 Call by reference:
		 형식 매개변수와 실 매개 변수가 기억공간을 공유할 수 있음.
		 * */
	}
}

class Test3 {
	public void sub(int[] a) {
		if (a == null || a.length == 0) {
			return;
		}
		a[2]=100;
	}
	
	public void sub2(int n) {
		n=100;
	}
	
	public void sub3(int[] a) {
		a = new int[5];
		a[2]=5000;
	}
}
