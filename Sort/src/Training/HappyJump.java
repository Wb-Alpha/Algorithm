package Training;

/*
 * 一个nn个元素的整数数组，如果数组两个连续元素之间差的绝对值包括了[1,n-1][1,n−1]之间的所有整数，
 * 则称之符合“欢乐的跳”，如数组1 4 2 31423符合“欢乐的跳”，因为差的绝对值分别为：3,2,13,2,1。
    给定一个数组，你的任务是判断该数组是否符合“欢乐的跳”。
 */
import java.util.*;
import java.math.*;

public class HappyJump {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		boolean isJolly = true;
		int last, now = 0;
		int[] judge = new int[N];
		for (int i=0; i<N; i++) {
			if (i != 0 ) {
				last = now;
				now = in.nextInt();
				if ( Math.abs(now-last)<N ) {
					judge[Math.abs(now-last)] = 1;
				}	
			}
			else
				now = in.nextInt();
		}
		
		for (int i=1; i<N; i++) {
			if ( judge[i] == 0 ) {
				isJolly = false;
				break;
			}
		}
		if(isJolly)
			System.out.println("Jolly");
		else
			System.out.println("Not jolly");
		in.close();
	}
	
	
	public void test(int[] judge, boolean isJolly) {
		for (int i=0; i<judge.length;i++) {
			System.out.println(isJolly);
			System.out.print(judge[i]+" ");
		}
	}
}
