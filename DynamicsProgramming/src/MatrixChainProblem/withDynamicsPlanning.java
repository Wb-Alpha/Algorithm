package MatrixChainProblem;

public class withDynamicsPlanning {
	static int n;
	
	
	public static void main(String[] args) {
		n = 6; //矩阵的个数(待确认
		int l = n+1; //数组长度
		int[][] m = new int[l][l];
		int[][] s = new int[l][l];
		int[] p = {30, 35, 15, 5, 10, 20, 25};
		MatrixChain(p, m, s);
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++)
				System.out.print(m[i][j]+"   ");
			System.out.println();
		}
		
	}
	
	
	public static void MatrixChain(int[] p, int[][] m, int[][]s) {
		for (int i=1; i<=n; i++) m[i][i]=0;
		
		for (int r=2; r<=n; r++) 
			for (int i=1; i<=n-r+1; i++) {
				int j = i+r-1;
				m[i][j] = m[i][i] + m[i+1][j] + p[i-1]*p[i]*p[j]; //设最先断开的位置是a
				s[i][j] = i;
				for (int k=i; k<j; k++) {
					int t=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
					if (t<m[i][j]) {
						m[i][j]=t;
						s[i][j]=k;
					}
				}
			}
	}
}
