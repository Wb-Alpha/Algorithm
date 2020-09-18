package BinarySearchTree;


public class BST<Key extends Comparable<Key>, Value>{
	private Node root;
	
	private class Node{
		private Key key;
		private Value value;
		private Node left,right;
		private int N;
		
		public Node(Key key, Value val, int N) {
			this.key = key;
			this.value = val;
			this.N = N;
		}
	}
	
	public int size() {
		return size(root);
	}
	
	private int size(Node x) {
		if (x==null) return 0;
		else return x.N;
	}
	
	
	public Value get(Key key) {
		return get(root, key);
	}
	
	private Value get(Node x, Key key) {
		//在以x为根节点的子树中查找并且返回key的对应值
		//如果没有则返回null
		if (x == null) return null;
		int cmp = key.compareTo(x.key);
		if (cmp < 0) return get(x.left, key);
		else if (cmp > 0) return get(x.right, key);
		else return x.value;
	}
	
	
	public void put(Key key, Value val) {
		//查找key，找到就更新他的值，否则就把它创建为一个新节点
		root = put(root, key, val);
	}
	
	private Node put(Node x, Key key, Value val) {
		//如果key存在于以x为根节点的子树
		//否则将以key和val作为键值对的新节点插入到该子树中
		if (x == null) return new Node(key, val, 1);
		int cmp = key.compareTo(x.key);
		if (cmp < 0) x.left = put(x.left, key, val);
		else if (cmp > 0) x.right = put(x.right, key, val);
		else x.value = val;
		x.N = size(x.left) + size(x.right) + 1;
		return x;
	}
	
	public Key min() { return min(root).key; }
	
	private Node min(Node x) {
		if ( x.left == null ) return x;
		return min(x.left);
	}
	
	public Key floor(Key key) {
		Node x = floor(root, key);
		return x.key;
	}
	
	private Node floor(Node x, Key key) {
		if ( x == null ) return null;
		int cmp = key.compareTo(x.key);
		if (cmp == 0) return x;
		if (cmp < 0) return floor(x.left, key);
		Node t = floor(x.right, key);
		if (t != null) return t;
		else return x;
	}
}
