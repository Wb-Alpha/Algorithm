package maxumumNoncrossingSubset;

public class example {
	static int n;
	
	public static void main(String[] args) {
		int[] c = {6,8,12,2,1,4,5,3,11,7,10,9,13};
		int[][] size = new int[c.length][c.length];
		int net[] = new int[c.length];
		for (int i=0; i<c.length; i++) {
			for (int j=0; j<c.length; j++)
				size[i][j] = 0;
		}
		mnet(c,size);
		traceback(c, size, net);
	}
	
	public static void mnet(int[] c, int[][] size) {
		for (int j=0; j<c[1]; j++) 
			size[1][j] = 0;
		for (int j=c[1]; j<=n; j++)
			size[j][j] = 1;
		
		for (int i=2; i<n; i++) {
			for (int j=0; j<c[i];j++)
				size[i][j]=size[i-1][j];
			for (int j=c[i]; j<=n; j++)
				size[i][j]=Math.max(size[i-1][j], size[i-1][c[i]-1]+1);
		}
		
		size[n][n] = Math.max(size[n-1][n], size[n-1][c[n]-1]+1);
	}
	
	public static int traceback(int[] c, int[][] size, int[] net) {
		int j=n;
		int m=0;
		
		for (int i=n; i>1; i--) {
			if (size[i][j] != size[i-1][j]) {
				net[m++] = i;
				j=c[i]-1;
			}
		}
		
		if (j>=c[1])
			net[m++] =1;
		return m;
	}
}
