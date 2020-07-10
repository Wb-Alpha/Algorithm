package Basic;

import java.util.*;

public class FIFOBloding1 {
	LinkedList<HeapNode> heap;
	
	public static class BBnode{
		BBnode parent; //父节点
		boolean leftChild; //左儿子节点标志
		//构造方法
		public BBnode(BBnode par, boolean ch){
			parent = par;
			leftChild = ch;
		}
	}
	
	public static class HeapNode implements Comparable{
		BBnode liveNode;
		int uweight; //活结点优先级（上界）
		int level; //活结点在子集树种所处的层序号
		
		//构造函数
		public HeapNode(BBnode node, int up, int lev) {
			liveNode = node;
			uweight = up;
			level = lev;
		}
		
		@Override
		public int compareTo(Object x) {	//升序排列
			int xu = ((HeapNode)x).uweight;
			if (uweight<xu) return -1;
			if (uweight==xu) return 0;
			return 1;
		}
		
		
		public boolean equals(Object x) {
			return uweight==((HeapNode)x).uweight;
		}
	}
	
	
	public void addLiveNode(int up, int lev, BBnode par, boolean ch) {
		BBnode b = new BBnode(par, ch);
		HeapNode node = new HeapNode(b,up,lev);
		heap.add(node);
		Collections.sort(heap);
	}
}