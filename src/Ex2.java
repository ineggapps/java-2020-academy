import java.util.Stack;

public class Ex2 {
	public static void main(String[] args) {
		// STACK Ŭ���� �̿� LIFO ����
		// Stack: Vector�� ���� Ŭ����
		Stack<String> st = new Stack<String>();

		// ���ÿ� ������ �߰� (add�� ���������� Stack������ push�޼���� ������ ���� ����)
		st.push("����");
		st.push("���");
		st.push("���");
		st.push("û��");
		st.push("������");
		// ���ÿ��� ������ �̱�
		//pop: top��� ��ȯ �� ����
		//peek: top ��� ��ȯ �� �������� ����.
		while (!st.empty()) {
			String s = st.pop();//���� top ��Ҹ� ��ȯ�� �� �����Ѵ�.
			System.out.print(s + " ");//�������� ������?
		}
		System.out.println();
		st.push("hello");
		st.push("world");
		System.out.println(st.peek());
		System.out.println(st.peek());//������ ���� �����ϱ� �翬�� �Ȱ��� ���� ���� ����.
		System.out.println(st.size());
		
	}
}
