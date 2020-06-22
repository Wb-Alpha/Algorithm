package MatrixChainProblem;

public class withDynamicsPlanning {

	private static int recurMatrixChain(int i,int j,int[] p)   //���ʼ�ľ������������㷨
	{
	    if(i == j) return 0;  //i == j����ֻ��һ�����󣬼��������ȻΪ��
	    int min = recurMatrixChain(i,i,p) + recurMatrixChain(i+1,j,p) + p[i-1] * p[i] * p[j];
	    for(int k = i + 1; k < j; k++){
	        int t = recurMatrixChain(i,k,p) + recurMatrixChain(k+1,j,p) + p[i-1] * p[k] * p[j];
	        if(t < min) min = t; //��k���Ͽ������t��min��С����˵�����ڸ��ŵĽ����������t��ֵ��min
	    }
	    return min;
	}
}
