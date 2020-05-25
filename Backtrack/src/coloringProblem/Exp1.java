package coloringProblem;

import java.util.*;

public class Exp1 {
	static int n;//ͼ�Ķ�����
	static int m;//������ɫ��
	static int [][]a;//ͼ���ڽӾ���
	static int[] x;//��ǰ��
	static long sum;//��ǰ���ҵ��Ŀ�m��ɫ������
	
	public static void mCloloring(int mm) {
		//m = mm;//��ʼ��������
		sum = 0;
		backtrack(1);
	}
	
	private static void backtrack(int t) {
		if (t>n) {
			sum++;
			for (int i=1; i<=m; i++) {
				System.out.println(x[i]+" ");
			}
			System.out.println();
		}
		else {
			for (int i=1; i<=m; i++) {
				x[t]=i;
				if (ok(t))
					backtrack(t+1);
				x[t] = 0;
			}
		}
	}
	
	private static boolean ok(int k) {
		for(int j=1; j<=n; j++) {
			if (a[k][j]==1 && (x[j]==x[k]))
				return false;
		}
		return true;
	}
	
	public static void init() {
		Scanner in = new Scanner(System.in);
		System.out.println("�������ж��ٸ��ڵ�");
		n = in.nextInt();
		a = new int[n][n];
		x = new int[n];
		System.out.println("�������ж�������ɫ");
		m = in.nextInt();
		System.out.println("������ͼ���ڽӾ��󣨾�������Ԫ��֮����ÿո����)");
		for(int i=0; i<n; i++) {
			System.out.println("�������"+i+"�е��ٽӾ���");
			for (int j=0; j<n; j++) {
				a[i][j] = in.nextInt();
			}
		}
		mCloloring(m);
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		init();
	}
}
