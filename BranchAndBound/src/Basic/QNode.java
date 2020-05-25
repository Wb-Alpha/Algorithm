package Basic;

public class QNode {
	QNode parent;//父节点
	boolean leftChild;//左子节点
	int weight;//节点对应的重量
	private QNode(QNode parent, boolean leftChild, int weight) {
		this.parent = parent;
		this.leftChild = leftChild;
		this.weight = weight;
	}
	
	private static void enQueue(int wt, int i, QNode parent, boolean leftChild) {
		if( i == n ) {
			//可行叶节点
			if(wt == bestw) {
				//当前最优装载重量
				bestE = parent;
				bestx[x]=(leftchlid)? 1:0;}
			return;
			}
		//非叶节点，将节点加入到活结点队列
		QNode b = new QNode(parent, leftChild,wt);
		queue.put(b);
		}
	}
}
