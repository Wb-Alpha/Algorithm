package a2013决赛;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B04J九宫重排 {
	// 导航数组，用以指出下一个前进的位置
	static int[][] dir = {{1,0}, {-1,0}, {0,-1}, {0,1}};
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		//只要还有输入
		while (in.hasNext()) {
			String begin = in.next(), end = in.next();// begin为初态，end为最终状态
			int t = begin.indexOf(".");		// 标记空格在哪个位置
			Queue<State> queue = new LinkedList<State>();	// 新建队列，作为BFS的等待队列
			queue.offer(new State(begin, t/3, t%3, 0));		// 将初始状态加入队列中
			HashSet<String> set = new HashSet<String>();	// 设置集合，用于标记什么情形已经出现过了
			set.add(begin);		// 将初始节点加入集合中
			int ans = 0;		// 初始化答案变量
			s : while(!queue.isEmpty()) {	// 只要队列还不是空的
				State tmp = queue.poll();	// 将队首节点弹出来
				//对和该节点相邻的节点进行操作
				for (int i = 0; i < 4; i ++) {	
					int tx = tmp.x+dir[i][0], ty = tmp.y+dir[i][1];	// 记录相邻节点坐标	
					if (tx >= 0 && tx < 3 && ty >=0 && ty <3) {	// 边界判定，防止坐标越界
						StringBuilder sb = new StringBuilder(tmp.s);	// 新建StringBuilder实现更复杂字符串功能
						// 交换函数
						char c = sb.charAt(3*tx + ty);		
	                    sb.setCharAt(3 * tx + ty, sb.charAt(3 * tmp.x + tmp.y));
	                    sb.setCharAt(3 * tmp.x + tmp.y, c);
	                    String str = sb.toString();
	                    // 如果变化后和最终状态一致
	                    if (str.equals(end)) {
	                        ans = tmp.cnt + 1;
	                        break s;
	                    }
	                    
	                    // 剪枝
	                    // 如果集合中没有这种状态
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