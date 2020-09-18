package ShortestPath;

public class dijkstraTest {
	private int mEdgNum;	//边的数量
	private char[] mVexs;	//顶点集合
	private int[][] mMatrix;//邻接矩阵
	private static final int INF = Integer.MAX_VALUE;
	
	public void dijkstra(int vs, int[] prev, int[] dist) {
		boolean[] flag = new boolean[mVexs.length];
		
		// 初始化
		for (int i=0; i<mVexs.length; i++) {
			flag[i] = false;
			prev[i] = 0;
			dist[i] = mMatrix[vs][i];
		}
		
		flag[vs] = true;
		dist[vs] = 0;
		
		// 遍历mVexs.length-1次，每次找出一个顶点的最短路径
		int k=0;
		for (int i=1; i<mVexs.length; i++) {
			//寻找当前最小路径
			//也就是在为获取最短路径的定点中找出离vs最近的顶点k
			int min = INF;
			for (int j=0; j < mVexs.length; j++) {
				if (flag[j]==false && dist[j]<min) {
					min = dist[j];
					k = j;
				}
			}
			//标记顶点k为已经获取到最短路径
			flag[k] = true;
			
			for (int j=0; j<mVexs.length; j++) {
				int temp = (mMatrix[k][j]==INF ? INF:(min+mMatrix[k][j]));
				if (flag[j]==false && (temp<dist[j])) {
					dist[j] = temp;
					prev[j] = k;
				}
			}
		}
		
		System.out.printf("dijkstra(%c)\n", mVexs[vs]);
		for (int i=0; i<mVexs.length; i++) {
			System.out.printf("shortest(%c, %c)=%d\n", mVexs[vs], mVexs[i], dist[i]);
		}
	}
}


class MatriUDG{
	
}
