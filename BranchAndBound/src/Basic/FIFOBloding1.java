package Basic;

import java.util.*;

public class FIFOBloding1 {
	static int n;//背包最大装载重量
	static int m;//货物个数
	static int[] weight;//重量数组
	static int[] value;//价值数组
	
	
	
	public static void main(String[] args) {
		init();
	}
	
	public static void init() {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入背包最大装载重量：");
		n = in.nextInt();
		System.out.println("请输入货物的数量");
		m = in.nextInt();
		weight = new int[m];
		value = new int[m];
		
		System.out.println("请输入各个货物的价值");
		for (int i=0; i<n; i++) {
			value[n] = in.nextInt();
		}
		System.out.println("请输入各个货物的重量");
		for (int i=0; i<n; i++) {
			weight[i] = in.nextInt();
		}
		
	}
}
