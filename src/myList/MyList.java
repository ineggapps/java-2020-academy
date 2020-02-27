package myList;

public interface MyList<E> {
	public void add(E element);
	public boolean add(int index, E element);
	public E get(int index);
	public E set(int index, E element);
	public int size();
	public E remove(int index);
	public boolean remove(E element);
	public void clear();
	public int indexOf(E element);
	public MyIterator<E> iterator();
}
