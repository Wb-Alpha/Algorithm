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

public class FIFOBlooding{
	static int n;
	static int bestw;
	static QNode bestE;
	static int[] bestx;
	//�ڵ���
	private static class QNode{
		QNode parent;	//���ڵ�
		boolean leftchild;	//���ӽڵ�
		int weight;	//����
		
		private QNode(QNode theParent, boolean theLeftChild, int Weight) {
			parent = theParent;
			leftchild = theLeftChild;
			weight = Weight;
		}
		
		private static void enQueue(int wt, int i, QNode parent, boolean leftChild) {
			if (i==n) {
				//����Ҷ�ڵ�
				if (wt==bestw) {
					//��ǰ��������
					bestE = parent;
					// bestx[n] =(leftchild)?1:0;
				}
			}
		}
	}
}




