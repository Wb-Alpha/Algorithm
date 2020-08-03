package Training;

import java.util.*;
import java.io.*;

//���https://blog.csdn.net/Look_star/article/details/88528092
public class ���· {
	final static int INF = Integer.MAX_VALUE;
	static int n,m;
	static int[] u; //���
	static int[] v; //�յ�
	static int[] l; //����
	static int[] d; //��㵽i����̾���
	static int[] first; //��¼ǰ��first[i]��ָi��Ϊ���ı�
	static int[] next; 
	
	static boolean[] vis;// ״̬��� �Ƿ��ڶ�����
	static Queue<Integer> q = new LinkedList<Integer>();
	
	public static void spfa(int f) { 	//fΪԭ��
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
				if (d[v[i]] > d[temp]+l[i]) {	//�ɳڲ���
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
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in)); //�ӿ����룬���������scanner�����г�ʱ
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
