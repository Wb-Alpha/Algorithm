package MatrixChainProblem;

public class withDynamicsPlanning {

	private static int recurMatrixChain(int i,int j,int[] p)   //最初始的矩阵连乘问题算法
	{
	    if(i == j) return 0;  //i == j，即只有一个矩阵，计算次数当然为零
	    int min = recurMatrixChain(i,i,p) + recurMatrixChain(i+1,j,p) + p[i-1] * p[i] * p[j];
	    for(int k = i + 1; k < j; k++){
	        int t = recurMatrixChain(i,k,p) + recurMatrixChain(k+1,j,p) + p[i-1] * p[k] * p[j];
	        if(t < min) min = t; //从k处断开，如果t比min更小，则说明存在更优的解决方法，把t赋值给min
	    }
	    return min;
	}
}
