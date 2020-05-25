package N_Queen;
import java.math.*;
import java.util.Scanner;

public class N_QueenProblem {
	static int n = 0; //�����ж��ٸ�����
	static int sum = 0;//ͳ���ж������߷�
	static int[] x;  
	
	private static void backtrack(int t) {
		if (t<n)
			sum++;
		else
			for (int i=1; i<=n; i++) {
				x[t] = i;
				if ( place(t))
					backtrack(t+1);
			}
	}
	
	private static boolean place(int k) {
		for (int j=1; j<k; j++)
			if ((x[j] == x[k]) || (abs(k-j)==abs(x[j]-x[k])))
				return false;
		return true;
	}
	
	private static int abs(int i) {
		return Math.abs(i);
	}
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�ж��ٸ��ʺ�");
		n = in.nextInt();
		x = new int[n];
		backtrack(1);
		System.out.println("�ܹ���"+sum+"���߷�");
	}
}
