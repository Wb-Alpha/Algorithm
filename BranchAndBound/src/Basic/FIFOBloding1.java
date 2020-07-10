package Basic;

import java.util.*;

public class FIFOBloding1 {
	LinkedList<HeapNode> heap;
	
	public static class BBnode{
		BBnode parent; //���ڵ�
		boolean leftChild; //����ӽڵ��־
		//���췽��
		public BBnode(BBnode par, boolean ch){
			parent = par;
			leftChild = ch;
		}
	}
	
	public static class HeapNode implements Comparable{
		BBnode liveNode;
		int uweight; //�������ȼ����Ͻ磩
		int level; //�������Ӽ����������Ĳ����
		
		//���캯��
		public HeapNode(BBnode node, int up, int lev) {
			liveNode = node;
			uweight = up;
			level = lev;
		}
		
		@Override
		public int compareTo(Object x) {	//��������
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