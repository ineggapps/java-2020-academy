package myList;

public class App {
	public static void main(String[] args) {
		MyList<String> list = new MyArrayList<String>();
		list.add("서울");
		list.add("대전");
		list.add("대구");
		list.add("부산");
		list.add("제주");
		list.add(1,"인천");

		list.remove(list.size()-1);
		
		System.out.println("일반 반복문");
		for(int i=0;i<list.size();i++) {
			String s = list.get(i);
			System.out.print(s+" ");
		}
		System.out.println();

		System.out.println("Iterator을 이용하여 순회하기");
		MyIterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s+" ");
		}
		System.out.println();		
		System.out.println(list.size());
		
	}
}
