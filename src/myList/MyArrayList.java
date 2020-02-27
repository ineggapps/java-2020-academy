package myList;

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
		// 기본 배열에 데이터가 존재하면 기존 배열의 내용을 temp배열에 복사한다.
		if (elementData != null && size > 0) {
			System.arraycopy(elementData, 0, temp, 0, size);
		}
		// temp배열을 elementData에 대입한다.
		elementData = temp;
	}

	@Override
	public void add(E element) {
		if (size >= elementData.length) {// 추가할 공간이 없으면
			// 배열의 공간을 2배씩 늘린다.
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
		// 값을 삽입하기 위해서 값을 뒤로 한 칸 당겨 저장
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
		// 칸 당겨서 저장하기
		for (int i = index + 1; i < size; i++) {
			elementData[i - 1] = elementData[i];
		}
		// 맨 뒤 칸 제거하기
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
		// TODO Auto-generated method stub
		return null;
	}

}
