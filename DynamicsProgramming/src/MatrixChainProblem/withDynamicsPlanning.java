package MatrixChainProblem;
 
public class withDynamicsPlanning {
    /*
     * array[i][j]��ʾAi...Aj������ټ������
     * s[i][j]=k,��ʾAi...Aj��(j-i+1)�������������ӽṹΪAi...Ak��A(k+1)...Aj
     * p[i]��ʾAi��������p[i+1]��ʾAi������
     */
	private int array[][];
	private int p[];
	private int s[][];
	
	public withDynamicsPlanning(){
		p=new int[]{2,4,5,5,3};
		array=new int[4][4];
		s=new int[4][4];
	}
	
	public withDynamicsPlanning(int n,int []p){
		this.p=new int[n+1];
		this.array=new int[n][n];
		this.s=new int[4][4];
		for(int i=0;i<p.length;i++)
			this.p[i]=p[i];
	}
	/*********************����һ����̬�滮**********************************/
	public void martixChain(){
		int n=array.length;
		for(int i=0;i<n;i++) 
			array[i][i]=0;
		for(int r=2;r<=n;r++){
			for(int i=0;i<=n-r;i++){
				int j=i+r-1;
				array[i][j]=array[i+1][j]+p[i]*p[i+1]*p[j+1];
				s[i][j]=i;
				for(int k=i+1;k<j;k++){
					int t=array[i][k]+array[k+1][j]+p[i]*p[k+1]*p[j];
					if(t<array[i][j]){
						array[i][j]=t;
						s[i][j]=k;
					}
				}
			}
		}
	}
	/*
	 * ����������Ϊ��Ap...Aq,then a=0,b=q-p
	 */
	public void traceBack(int a,int b){
		if(a<b){
			traceBack(a, s[a][b]);
			traceBack(s[a][b]+1, b);
			System.out.println("�Ȱ�A"+a+"��A"+s[a][b]+"���������ڰ�A"+(s[a][b]+1)+"��A"+b+"��������Ȼ���A"+a+"��A"+b+"������");
		}
	}
	
	/*********************������������¼����*****************************/
	public int memorizedMatrixChain(){
		int n=array.length;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++)
				array[i][j]=0;
		}
		return lookUpChain(0,n-1);
	}
	
	public int lookUpChain(int a,int b){
		if(array[a][b]!=0)
			return array[a][b];
		if(a==b)
			return 0;
		array[a][b]=lookUpChain(a, a)+lookUpChain(a+1, b)+p[a]*p[a+1]*p[b+1];
		s[a][b]=a;
		for(int k=a+1;k<b;k++){
			int t=lookUpChain(a, k)+lookUpChain(k+1, b)+p[a]*p[k+1]*p[b+1];
			if(t<array[a][b]){
				array[a][b]=t;
				s[a][b]=k;
			}
		}
		return array[a][b];
	}
	public static void main(String[] args) {
		withDynamicsPlanning strassen=new withDynamicsPlanning();
		//strassen.martixChain();
		strassen.memorizedMatrixChain();
		strassen.traceBack(0, 3);
	}
}
 
 
 
 
 
