package myList;

public class App {
	public static void main(String[] args) {
		MyList<String> list = new MyArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("�뱸");
		list.add("�λ�");
		list.add("����");
		list.add(1,"��õ");

		list.remove(list.size()-1);
		
		System.out.println("�Ϲ� �ݺ���");
		for(int i=0;i<list.size();i++) {
			String s = list.get(i);
			System.out.print(s+" ");
		}
		System.out.println();

		System.out.println("Iterator�� �̿��Ͽ� ��ȸ�ϱ�");
		MyIterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s+" ");
		}
		System.out.println();		
		System.out.println(list.size());
		
	}
}
