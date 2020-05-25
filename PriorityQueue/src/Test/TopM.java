package Test;

//���ȶ��е�һ��ʾ��

import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Transaction;

public class TopM {
	public static void main(String[] args) {
		//��ӡ������������M��
		int M = Integer.parseInt(args[0]);
		MinPQ<Transaction>  pq = new MinPQ<Transaction>(M+1);
		while ( StdIn.hasNextLine() ) {
			//Ϊ��һ�����봴��һ��Ԫ�ز��ҷ������ȶ�����
			pq.insert(new Transaction(StdIn.readLine()));
			if (pq.size() > M){
				pq.delMin();//������ȶ����д���M+1��Ԫ����ɾ��������С��Ԫ��
			}//����M��Ԫ��ȫ�������ȶ�����
			
			Stack<Transaction> stack = new Stack<Transaction>();
			while ( !pq.isEmpty() ) stack.push(pq.delMin());
			for (Transaction t : stack) StdOut.println();
			
		}
	}
}
