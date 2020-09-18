package ShortestPath;

public class dijkstraTest {
	private int mEdgNum;	//�ߵ�����
	private char[] mVexs;	//���㼯��
	private int[][] mMatrix;//�ڽӾ���
	private static final int INF = Integer.MAX_VALUE;
	
	public void dijkstra(int vs, int[] prev, int[] dist) {
		boolean[] flag = new boolean[mVexs.length];
		
		// ��ʼ��
		for (int i=0; i<mVexs.length; i++) {
			flag[i] = false;
			prev[i] = 0;
			dist[i] = mMatrix[vs][i];
		}
		
		flag[vs] = true;
		dist[vs] = 0;
		
		// ����mVexs.length-1�Σ�ÿ���ҳ�һ����������·��
		int k=0;
		for (int i=1; i<mVexs.length; i++) {
			//Ѱ�ҵ�ǰ��С·��
			//Ҳ������Ϊ��ȡ���·���Ķ������ҳ���vs����Ķ���k
			int min = INF;
			for (int j=0; j < mVexs.length; j++) {
				if (flag[j]==false && dist[j]<min) {
					min = dist[j];
					k = j;
				}
			}
			//��Ƕ���kΪ�Ѿ���ȡ�����·��
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
