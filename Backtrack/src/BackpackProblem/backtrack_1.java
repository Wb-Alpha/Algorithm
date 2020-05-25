package BackpackProblem;

/*
 * 有一个载重为30的背包，以及重量为w={16，15，15}，价值分别为p={45,25,25}的三件
 * 货物，请问如何放置才可以让背包中背的物品价值达到最大
 * 
 * mission:使用更多的实例测试程序
 */

import java.util.*;

public class backtrack_1 {
	public static int n = 0;//有几个货物
	static int[] value;//货物价值数组
	static int[] weight;//货物重量数组
	static int[] x;//创建结果数组
	static int load;//背包最大可负重
	static int best = 0;//背包货物最大价值
	static int tempW = 0;//当前重量
	static int tempV = 0;//当前背包价值
	static int[] bestx;
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("请输入背包可负载重量");
		load = reader.nextInt();
		
		System.out.println("请输入有多少个货物");
		n = reader.nextInt();
		value = new int[n];
		weight = new int[n];	
		x = new int[n];
		bestx = new int[n];
		
		System.out.println("请输入货物的重量");
		for (int i=0; i<n; i++) {
			weight[i] = reader.nextInt();
		}
		
		System.out.println("请输入货物的价值");
		for( int i=0; i<n; i++) {
			value[i] = reader.nextInt();
		}
		
		backtrack(0);
		System.out.println("背包价值最大为"+best);
		System.out.println("其放入情况为为：");
		for(int i=0; i<n; i++) {
			System.out.print(bestx[i]+" ");
		}
	}

	

	
	static void backtrack(int t) {

		if(t>=n) output(x);
		else {
			for (int i=0; i<=1; i++) {
				x[t] = i;
				if (i==1) {
					tempW += weight[t];
					tempV += value[t];
				}
				if(legal(t))//是否合法
					backtrack(t+1);
			}
			if (x[t] == 1) {
				tempW -= weight[t];
				tempV -= value[t];
			}
		}
	}
	
	
	static void output(int[] x) {
		if (tempV > best) {			
			best = tempV;
			bestx = x;
			System.out.println("bestx[]="+ bestx[0]+" "+bestx[1]+" "+bestx[2]);
		}
	}
	
	static boolean legal(int t) {
		if (tempW > load) {
			return false;
		}
		return true;
	}
}
