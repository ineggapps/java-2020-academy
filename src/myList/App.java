package myList;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		MyList<String> list = new MyArrayList<String>();
		list.add("서울");
		list.add("대구");
		
		list.add(1,"인천");
		
		list.remove(1);

		for(int i=0;i<list.size();i++) {
			String s = list.get(i);
			System.out.print(s+" ");
		}
		System.out.println();
		
		
		System.out.println(list.size());
		
	}
}
