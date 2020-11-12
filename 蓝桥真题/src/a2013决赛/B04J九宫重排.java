package a2013����;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B04J�Ź����� {
	// �������飬����ָ����һ��ǰ����λ��
	static int[][] dir = {{1,0}, {-1,0}, {0,-1}, {0,1}};
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		//ֻҪ��������
		while (in.hasNext()) {
			String begin = in.next(), end = in.next();// beginΪ��̬��endΪ����״̬
			int t = begin.indexOf(".");		// ��ǿո����ĸ�λ��
			Queue<State> queue = new LinkedList<State>();	// �½����У���ΪBFS�ĵȴ�����
			queue.offer(new State(begin, t/3, t%3, 0));		// ����ʼ״̬���������
			HashSet<String> set = new HashSet<String>();	// ���ü��ϣ����ڱ��ʲô�����Ѿ����ֹ���
			set.add(begin);		// ����ʼ�ڵ���뼯����
			int ans = 0;		// ��ʼ���𰸱���
			s : while(!queue.isEmpty()) {	// ֻҪ���л����ǿյ�
				State tmp = queue.poll();	// �����׽ڵ㵯����
				//�Ժ͸ýڵ����ڵĽڵ���в���
				for (int i = 0; i < 4; i ++) {	
					int tx = tmp.x+dir[i][0], ty = tmp.y+dir[i][1];	// ��¼���ڽڵ�����	
					if (tx >= 0 && tx < 3 && ty >=0 && ty <3) {	// �߽��ж�����ֹ����Խ��
						StringBuilder sb = new StringBuilder(tmp.s);	// �½�StringBuilderʵ�ָ������ַ�������
						// ��������
						char c = sb.charAt(3*tx + ty);		
	                    sb.setCharAt(3 * tx + ty, sb.charAt(3 * tmp.x + tmp.y));
	                    sb.setCharAt(3 * tmp.x + tmp.y, c);
	                    String str = sb.toString();
	                    // ����仯�������״̬һ��
	                    if (str.equals(end)) {
	                        ans = tmp.cnt + 1;
	                        break s;
	                    }
	                    
	                    // ��֦
	                    // ���������û������״̬
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



//��ͼ1�ľŹ����У����� 1~8 �����ֿ�Ƭ������һ�����ӿ��š���ո������ڵĸ����еĿ�Ƭ�����ƶ����ո��С��������ɴ��ƶ��������γ�ͼ2��ʾ�ľ��档
//
//���ǰ�ͼ1�ľ����Ϊ��12345678.
//��ͼ2�ľ����Ϊ��123.46758
//
//��Ȼ�ǰ����ϵ��£������ҵ�˳���¼���֣��ո��Ϊ��㡣
//
//����Ŀ����������֪�Ź��ĳ�̬����̬�������پ������ٲ����ƶ����Ե��������۶��ٲ����޷���������-1��
//
//���磺
//��������Ϊ��
//12345678.
//123.46758
//��,����Ӧ�������
//3
//
//���磺
//���룺
//13524678.
//46758123.
//�򣬳��������
//22
//
//
//��ԴԼ����
//��ֵ�ڴ����ģ���������� < 64M
//CPU����  < 2000ms