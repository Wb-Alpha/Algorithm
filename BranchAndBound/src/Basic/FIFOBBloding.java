package Basic;

/*
 * 优先队列式分支限界基本知识
 * 基本思想：广度优先
 * 队列：先进先出（FIFO）
 * 队列是分支限界法将活结点表组织成一个队列，并且按照队列的先进先出原则选取下一个节点成为当前扩展结点
 * 
 * 解同一问题的优先队列式分支限界法用一极小堆来存储活结点表。其优先级是结点的当前费用。算法还是从排列
 * 树的结点B和空优先队列开始。结点B被扩展后，它的3个儿子结点C，D和E被依次插入堆中。
 */
/*

public class FIFOBBloding {
	static int n;//装载数量
	static int bestw;//当前最优装载重量
	static ArrayQueue queue;//活结点队列
	static QNode bestE;
	static int[] bestx;
	
	public static int maxLoading(int[] w, int c, int[] xx) {
		//该算法实施对解空间树的队列是分支限界搜索，返回最优载重
		bestw = 0;//初始化最优载重
		queue = new ArrayQueue();//队列用来存放活结点表
		queue.put(null);//当元素值为空时，表示队列已经到达解空间树同一层节点的尾部
		QNode e = A;
		bestE = A;
		bestx = xx;
		int i = 1;//当前扩展结点所处的层次
		int ew = 0;//扩展节点所相应的载重量
		int r = 0;//剩余集装箱重量
		
		for ( int j=2; j<= n; j++) {
			r += w[j];
		}
		
		while(true) {
			//检查左子节点
			int wt = ew+w[i];//左子节点的重量
			if (wt <= c) {
				//可行解点
				if (ew+r > bestw) bestw = wt;
				enQueue(wt,i,e,false);
			}
			//检查右子节点
			if ( ew+r > bestw ) enQueue(ew,i,e,false);
			e = (QNode)queue.remove();
			
			if (e == null) {
				//同层节点底部
				if (queue.isEmpty())break;
				queue.put(null);
				e = (QNode)queue.remove();//下一扩展结点
				i++;//进入下一层
				r -= w[i];//剩余集装箱重量
			}
			ew = e.weight;
		}
	}
	
	
	
	public static class QNode {
		QNode parent;//父节点
		boolean leftChild;//左子节点
		int weight;//节点对应的重量
		private QNode(QNode parent, boolean leftChild, int weight) {
			this.parent = parent;
			this.leftChild = leftChild;
			this.weight = weight;
		}
		
		public static void enQueue(int wt, int i, QNode parent, boolean leftChild) {
			if( i == n ) {
				//可行叶节点
				if(wt == bestw) {
					//当前最优装载重量
					bestE = parent;
					bestx[n]=(leftChild)? 1:0;}
				return;
				}
			//非叶节点，将节点加入到活结点队列
			QNode b = new QNode(parent, leftChild,wt);
			queue.put(b);
			}
		}
}
*/




