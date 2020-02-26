package d200226;

public class Ex3StackHandMade {
	public static void main(String[] args) {
		MyStack<Integer> ms = new MyStackImpl<>(10);
		
		ms.push(10);
		ms.push(20);
		ms.push(30);
		
		while(!ms.isEmpty()) {
			int a = ms.pop();
			System.out.println(a);
		}
		System.out.println();
	}
}

//�迭�� �̿��� ���� �����(LIFO)
interface MyStack<E> {
	public E pop();// top ������ �������� �����ϱ�

	public E peek();// top ������ ��ȯ�� �� �������� ����.

	public void push(E data);// ������ ����

	public boolean isEmpty();
}

class MyStackImpl<E> implements MyStack<E> {

	private E[] elementData;
	private int top;// ���� �ε���

	@SuppressWarnings("unchecked")
	public MyStackImpl(int size) {
		elementData = (E[]) new Object[size];
		top = 0;
	}

	@Override
	public E pop() {
		if(isEmpty()) {
			throw new RuntimeException();
		}
		E item = peek();
		elementData[--top]=null;
		return item;
	}

	@Override
	public E peek() {
		if(isEmpty()) {
			throw new RuntimeException();
		}
		return elementData[top-1];
	}

	@Override
	public void push(E data) {
		if(top>=elementData.length) {
			throw new RuntimeException("Stack is full");
		}
		elementData[top++] = data;
	}

	@Override
	public boolean isEmpty() {
		return top <= 0;
	}
	
	public int getTop() {
		return top;
	}

}