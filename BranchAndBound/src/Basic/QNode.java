package Basic;

public class QNode {
	QNode parent;//���ڵ�
	boolean leftChild;//���ӽڵ�
	int weight;//�ڵ��Ӧ������
	private QNode(QNode parent, boolean leftChild, int weight) {
		this.parent = parent;
		this.leftChild = leftChild;
		this.weight = weight;
	}
	
	private static void enQueue(int wt, int i, QNode parent, boolean leftChild) {
		if( i == n ) {
			//����Ҷ�ڵ�
			if(wt == bestw) {
				//��ǰ����װ������
				bestE = parent;
				bestx[x]=(leftchlid)? 1:0;}
			return;
			}
		//��Ҷ�ڵ㣬���ڵ���뵽�������
		QNode b = new QNode(parent, leftChild,wt);
		queue.put(b);
		}
	}
}
