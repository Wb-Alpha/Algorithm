package normal;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<Item> implements Iterable<Item> {
	// ½Úµã
	public class Node {
		private Node next;
		private Item item;
	}
	
	private int size;
	private Node first;
	
	public Bag() {
		first = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addItem(Item item) {
		Node oldNode = first;
		first = new Node();
		first.item = item;
		first.next = oldNode;
	}
	
	public boolean isEmpty() {
		if (size == 0) 
			return true;
		return false;
	}
	
	private class BagIterator implements Iterator<Item>{
		private Node now = first;
		
		@Override
		public boolean hasNext() {
			return now != null;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			if ( !hasNext() ) {
				throw new NoSuchElementException();
			}
			Item item = now.item;
			now = now.next;
			return item;
		}

	}
}
