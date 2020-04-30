package myList;

import java.util.Collection;

public interface MyIterator<E> {//Element
	public boolean hasNext();
	public E next();
	public void remove();
}
