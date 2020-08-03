package Training;

import java.util.*;
import java.io.*;

//解答：https://blog.csdn.net/Look_star/article/details/88528092
public class 最短路 {
	final static int INF = Integer.MAX_VALUE;
	static int n,m;
	static int[] u; //起点
	static int[] v; //终点
	static int[] l; //长度
	static int[] d; //起点到i的最短距离
	static int[] first; //记录前驱first[i]是指i作为起点的边
	static int[] next; 
	
	static boolean[] vis;// 状态标记 是否在队列中
	static Queue<Integer> q = new LinkedList<Integer>();
	
	public static void spfa(int f) { 	//f为原点
		for (int i=0; i<n; i++) 
			d[i] = INF;
		d[f] = 0;
		Arrays.fill(vis, false);
		
		q.add(f);
		vis[f] = true;
		
		while( !q.isEmpty() ) {
			int temp = q.poll();
			vis[temp] = false;
			for(int i = first[temp]; i != -1; i=next[i]) {
				if (d[v[i]] > d[temp]+l[i]) {	//松弛操作
					d[v[i]] = d[temp]+l[i];
					if (!vis[v[i]]) {
						q.add(v[i]);
						vis[v[i]] = true;
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in)); //加快输入，这里如果用scanner会运行超时
		String str = bfr.readLine();
		String[] s = str.split(" ");
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);
		
		u = new int[m+1];
		v = new int[m+1];
		l = new int[m+1];
		first = new int[n+1];
		next = new int[m+1];
		d = new int[n+1];
		vis = new boolean[n+1];
		
		Arrays.fill(first, -1);
		for (int i=0; i<m; i++) {
			str = bfr.readLine();
			s = str.split(" ");
			u[i] = Integer.parseInt(s[0])-1;
			v[i] = Integer.parseInt(s[1])-1;
			l[i] = Integer.parseInt(s[2]);
			next[i] = first[u[i]];
			first[u[i]] = i;
		}
		
		spfa(0);
		for (int i=1; i<n; i++) {
			System.out.println(d[i]);
		}
	}
}
