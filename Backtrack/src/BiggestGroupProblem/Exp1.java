package BiggestGroupProblem;

import java.util.*;

public class Exp1 {
	static int[] x;//��ǰ��
	static int n;//ͼG�Ķ�����
	static int cn;//��ǰ������
	static int bestn;//��ǰ��󶥵���
	static int[] bestx;//��ǰ���Ž�
	static boolean[][] a;//ͼG���ڽӾ���
	
	public static int maxClique(int[] v) {
		x = new int[n+1];
		cn = 0;
		bestn = 0;
		bestx = v;
		backtrack(1);
		return bestn;
	}
	
	static void backtrack(int a) {
		if( a>n ) {//�������Ҷ�ڵ�
			for(int j=1; j<=n; j++) 
				bestx[j] = x[j];
			bestn = cn;
			return;
		}
		int ok = 1;
	}
}
