package d200227;

import myList.MyArrayList;
import myList.MyList;

public class Ex4 {
	public static void main(String[] args) {
		System.out.println("MyArrayList 구현. 패키지 참조");
		MyList<String> list = new MyArrayList<String>();
		list.add("sample");
	}
}
