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

public class FIFOBlooding{
	static int n;
	static int bestw;
	static QNode bestE;
	static int[] bestx;
	//节点类
	private static class QNode{
		QNode parent;	//父节点
		boolean leftchild;	//左子节点
		int weight;	//重量
		
		private QNode(QNode theParent, boolean theLeftChild, int Weight) {
			parent = theParent;
			leftchild = theLeftChild;
			weight = Weight;
		}
		
		private static void enQueue(int wt, int i, QNode parent, boolean leftChild) {
			if (i==n) {
				//可行叶节点
				if (wt==bestw) {
					//当前最优载重
					bestE = parent;
					// bestx[n] =(leftchild)?1:0;
				}
			}
		}
	}
}




