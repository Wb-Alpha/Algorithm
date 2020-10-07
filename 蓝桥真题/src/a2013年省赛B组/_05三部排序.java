package a2013年省赛B组;

public class _05三部排序 {

	static void sort(int[] x)
	{
		int p = 0;
		int left = 0;
		int right = x.length-1;
		
		while(p<=right){
			if(x[p]<0){
				int t = x[left];
				x[left] = x[p];
				x[p] = t;
				left++;
				p++;
			}
			else if(x[p]>0){
				int t = x[right];
				x[right] = x[p];
				x[p] = t;
				right--;			
			}
			else{
				p++;  //代码填空位置
			}
		}
	}
}

