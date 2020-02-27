package myList;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
	private E[] elementData;
	private int size;

	public MyArrayList() {
		capacityAllocation(10);
	}

	public MyArrayList(int capacity) {
		capacityAllocation(capacity);
	}

	@SuppressWarnings("unchecked")
	private void capacityAllocation(int capacity) {
		E[] temp = (E[]) new Object[capacity];
		// �⺻ �迭�� �����Ͱ� �����ϸ� ���� �迭�� ������ temp�迭�� �����Ѵ�.
		if (elementData != null && size > 0) {
			System.arraycopy(elementData, 0, temp, 0, size);
		}
		// temp�迭�� elementData�� �����Ѵ�.
		elementData = temp;
	}

	@Override
	public void add(E element) {
		if (size >= elementData.length) {// �߰��� ������ ������
			// �迭�� ������ 2�辿 �ø���.
			capacityAllocation(elementData.length * 2);
		}
		elementData[size++] = element;
	}

	@Override
	public boolean add(int index, E element) {
		if (index < 0 || index > size) {
			return false;
		}
		if (size >= elementData.length) {
			capacityAllocation(elementData.length * 2);
		}
		// ���� �����ϱ� ���ؼ� ���� �ڷ� �� ĭ ��� ����
		for (int i = size - 1; i >= index; i--) {
			elementData[i + 1] = elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
	}

	@Override
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return elementData[index];
	}

	@Override
	public E set(int index, E element) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		E old = elementData[index];
		elementData[index] = element;
		return old;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public E remove(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		E removed = elementData[index];
		// ĭ ��ܼ� �����ϱ�
		for (int i = index + 1; i < size; i++) {
			elementData[i - 1] = elementData[i];
		}
		// �� �� ĭ �����ϱ�
		size--;
		elementData[size] = null;
		return removed;
	}

	@Override
	public boolean remove(E element) {
		for (int i = 0; i < size; i++) {
			if (elementData[i].equals(element)) {
				remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public void clear() {
//		for (int i = 0; i < size; i++) {
//			elementData[i] = null;
//		}
		elementData = null;
		capacityAllocation(10);
		size = 0;
	}

	@Override
	public int indexOf(E element) {
		for (int i = 0; i < size; i++) {
			if (element.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public MyIterator<E> iterator() {
		return new MyIteratorImpl();
	}

	private class MyIteratorImpl implements MyIterator<E> {
		private int nextIndex = 0;

		@Override
		public boolean hasNext() {
			return nextIndex < size();
		}

		@Override
		public E next() {
			if (nextIndex >= size()) {
//				throw new ArrayIndexOutOfBoundsException();//���� ������
				return null;
			}
			return elementData[nextIndex++];
		}

		@Override
		public void remove() {// ���� ��ġ�� �ִ� �����͸� �����.
			// MyArrayList�� remove�޼���� MyIteratorImpl�� remove�޼���� �̸��� ��ġ�ϱ�!
			// ��������� ǥ���� ����� �Ѵ�.
			MyArrayList.this.remove(nextIndex--);
		}

	}

	@Override
	public String toString() {
		return Arrays.toString(elementData);
	}

}
