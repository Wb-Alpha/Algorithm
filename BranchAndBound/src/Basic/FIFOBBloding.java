package Basic;

/*
 * ���ȶ���ʽ��֧�޽����֪ʶ
 * ����˼�룺�������
 * ���У��Ƚ��ȳ���FIFO��
 * �����Ƿ�֧�޽編���������֯��һ�����У����Ұ��ն��е��Ƚ��ȳ�ԭ��ѡȡ��һ���ڵ��Ϊ��ǰ��չ���
 * 
 * ��ͬһ��������ȶ���ʽ��֧�޽編��һ��С�����洢����������ȼ��ǽ��ĵ�ǰ���á��㷨���Ǵ�����
 * ���Ľ��B�Ϳ����ȶ��п�ʼ�����B����չ������3�����ӽ��C��D��E�����β�����С�
 */
/*

public class FIFOBBloding {
	static int n;//װ������
	static int bestw;//��ǰ����װ������
	static ArrayQueue queue;//�������
	static QNode bestE;
	static int[] bestx;
	
	public static int maxLoading(int[] w, int c, int[] xx) {
		//���㷨ʵʩ�Խ�ռ����Ķ����Ƿ�֧�޽�������������������
		bestw = 0;//��ʼ����������
		queue = new ArrayQueue();//����������Ż����
		queue.put(null);//��Ԫ��ֵΪ��ʱ����ʾ�����Ѿ������ռ���ͬһ��ڵ��β��
		QNode e = A;
		bestE = A;
		bestx = xx;
		int i = 1;//��ǰ��չ��������Ĳ��
		int ew = 0;//��չ�ڵ�����Ӧ��������
		int r = 0;//ʣ�༯װ������
		
		for ( int j=2; j<= n; j++) {
			r += w[j];
		}
		
		while(true) {
			//������ӽڵ�
			int wt = ew+w[i];//���ӽڵ������
			if (wt <= c) {
				//���н��
				if (ew+r > bestw) bestw = wt;
				enQueue(wt,i,e,false);
			}
			//������ӽڵ�
			if ( ew+r > bestw ) enQueue(ew,i,e,false);
			e = (QNode)queue.remove();
			
			if (e == null) {
				//ͬ��ڵ�ײ�
				if (queue.isEmpty())break;
				queue.put(null);
				e = (QNode)queue.remove();//��һ��չ���
				i++;//������һ��
				r -= w[i];//ʣ�༯װ������
			}
			ew = e.weight;
		}
	}
	
	
	
	public static class QNode {
		QNode parent;//���ڵ�
		boolean leftChild;//���ӽڵ�
		int weight;//�ڵ��Ӧ������
		private QNode(QNode parent, boolean leftChild, int weight) {
			this.parent = parent;
			this.leftChild = leftChild;
			this.weight = weight;
		}
		
		public static void enQueue(int wt, int i, QNode parent, boolean leftChild) {
			if( i == n ) {
				//����Ҷ�ڵ�
				if(wt == bestw) {
					//��ǰ����װ������
					bestE = parent;
					bestx[n]=(leftChild)? 1:0;}
				return;
				}
			//��Ҷ�ڵ㣬���ڵ���뵽�������
			QNode b = new QNode(parent, leftChild,wt);
			queue.put(b);
			}
		}
}
*/




