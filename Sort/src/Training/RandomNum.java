package Training;
/*
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数(N≤100)，
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按
 * 照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。
 * 
 * 这个题目的关机那在于其随机整数的范围足够小，可以弄一张真值表来测试此数据是否曾经出现过
 *也可以采用桶排序（适用于数据范围小并且都是正整数）
 */
import java.util.*;

public class RandomNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int count = N;
		int[] judge = new int[1000];
		for (int i=0; i<N; i++) {
			int temp = in.nextInt();
			if (judge[temp] == 1)
				count--;
			else 
				judge[temp] = 1;
		}
		
		System.out.println(count);
		for (int i=0; i<1000; i++) {
			if (judge[i] == 1)
				System.out.print(i+" ");
		}
		in.close();
	}
}
