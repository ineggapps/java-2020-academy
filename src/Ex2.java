import java.util.Stack;

public class Ex2 {
	public static void main(String[] args) {
		// STACK 클래스 이용 LIFO 구조
		// Stack: Vector의 하위 클래스
		Stack<String> st = new Stack<String>();

		// 스택에 데이터 추가 (add도 가능하지만 Stack에서는 push메서드로 삽입할 것을 권장)
		st.push("검정");
		st.push("노랑");
		st.push("녹색");
		st.push("청색");
		st.push("빨간색");
		// 스택에서 데이터 뽑기
		//pop: top요소 반환 후 지움
		//peek: top 요소 반환 후 삭제하지 않음.
		while (!st.empty()) {
			String s = st.pop();//스택 top 요소를 반환한 후 삭제한다.
			System.out.print(s + " ");//역순으로 나오지?
		}
		System.out.println();
		st.push("hello");
		st.push("world");
		System.out.println(st.peek());
		System.out.println(st.peek());//삭제가 되지 않으니까 당연히 똑같은 값이 나올 테지.
		System.out.println(st.size());
		
	}
}
