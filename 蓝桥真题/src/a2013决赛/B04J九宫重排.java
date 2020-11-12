package a2013决赛;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B04J九宫重排 {
	static int[][] dir = {{1,0}, {-1,0}, {0,-1}, {0,1}};
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String begin = in.next(), end = in.next();
			int t = begin.indexOf(".");
			Queue<State> queue = new LinkedList<State>();
			queue.offer(new State(begin, t/3, t%3, 0));
			HashSet<String> set = new HashSet<String>();
			set.add(begin);
			int ans = 0;
			s : while(!queue.isEmpty()) {
				State tmp = queue.poll();
				for (int i = 0; i < 4; i ++) {
					int tx = tmp.x+dir[i][0], ty = tmp.y+dir[i][1];
					if (tx >= 0 && tx < 3 && ty >=0 && ty <3) {
						StringBuilder sb = new StringBuilder(tmp.s);
						char c = sb.charAt(3*tx + ty);
	                    sb.setCharAt(3 * tx + ty, sb.charAt(3 * tmp.x + tmp.y));
	                    sb.setCharAt(3 * tmp.x + tmp.y, c);
	                    String str = sb.toString();
	                    if (str.equals(end)) {
	                        ans = tmp.cnt + 1;
	                        break s;
	                    }
	                    if (!set.contains(str)) {
	                        set.add(str);
	                        queue.offer(new State(sb.toString(), tx, ty, tmp.cnt + 1));
	                    }
					}
				}
			}
			System.out.println(ans);
		}
		in.close();
	}
	

}

class State{
	String s;
	int x,y;
	int cnt;
	
	public State(String s, int x, int y, int cnt) {
		super();
		this.s = s;
		this.x = x;
		this.y = y;
		this.cnt = cnt;
	}
}



//如图1的九宫格中，放着 1~8 的数字卡片，还有一个格子空着。与空格子相邻的格子中的卡片可以移动到空格中。经过若干次移动，可以形成图2所示的局面。
//
//我们把图1的局面记为：12345678.
//把图2的局面记为：123.46758
//
//显然是按从上到下，从左到右的顺序记录数字，空格记为句点。
//
//本题目的任务是已知九宫的初态和终态，求最少经过多少步的移动可以到达。如果无论多少步都无法到达，则输出-1。
//
//例如：
//输入数据为：
//12345678.
//123.46758
//则,程序应该输出：
//3
//
//再如：
//输入：
//13524678.
//46758123.
//则，程序输出：
//22
//
//
//资源约定：
//峰值内存消耗（含虚拟机） < 64M
//CPU消耗  < 2000ms