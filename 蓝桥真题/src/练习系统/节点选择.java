package ��ϰϵͳ;

import java.util.Scanner;

public class �ڵ�ѡ�� {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n][2];
		Node[] nodeList = new Node[n];
		
		for (int i = 0; i < n; i++) {
			int value = in.nextInt();
			// nodeList[i] = new Node(value); 
		}
		
	}

	class Node{
		public int value;
		public Node parent;
		
		public Node(int value) {
			this.value = value;
		}
		
		public void setParent(Node parent) {
			this.parent = parent;
		}
	}
}
