package a2018����;

import java.util.Scanner;

class Position{
	int minX;
	int minY;
	int maxX;
	int maxY;
	
	public Position() {
		minX = minY = maxX = maxY = -10;
	}
}

public class _04������� {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			boolean res = true;
			Position[] pos = new Position[10];
			for (int j = 0; j < 10; j++) {
				pos[j] = new Position();
			}
			int n = in.nextInt();
			int m = in.nextInt();
			in.nextLine();
			int[][] map = new int[n][m];
			for (int j = 0; j < n; j++) {
				char[] str = in.nextLine().toCharArray();
				for (int k = 0; k < m; k++) {
					map[j][k] = str[k]-48;
				}
			}
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					int tmp = map[j][k];
					if (pos[tmp].minX == -10 || pos[tmp].minX > j)
						pos[tmp].minX = j;
					if (pos[tmp].maxX == -10 || pos[tmp].maxX < j)
						pos[tmp].maxX = j;
					if (pos[tmp].minY == -10 || pos[tmp].minY > k)
						pos[tmp].minY = k;
					if (pos[tmp].maxY == -10 || pos[tmp].maxY < k)
						pos[tmp].maxY = k;
				}
			}
			OUT:
				for(int j = 0; j < 9; j++) {
					if (pos[j].minX == -10)
						continue;
					for (int k = j+1; k < 10; k++) {
						if (pos[k].minX == -10) {
							continue;
						}
						if (pos[j].maxX >= pos[k].minX && pos[j].minX <= pos[k].maxX) {
							if (pos[j].maxY >= pos[k].maxY && pos[j].minY <= pos[k].maxY) {
								res = false;
								break OUT;
							}
						}
					}
				}
			if (res) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
			
		in.close();
	}
}




//���⣺�������
//
//С����һ����ߣ�һ������NxM����������Щ�����ڷ���һ������NxM��С���ӵ���ߺ��У�ÿ��С������ǡ�ðڷ�һ��������  
//
//ÿһ�������ϱ����һ��0~9���������п����ж�����������ͬ��������  
//
//С������ߵİڷ��������Ҫ�󣺱����ͬ�����Ĳ����������һ�����һ��������״��
//
//�����°ڷ�������Ҫ��ģ�
//
//00022
//00033
//44444  
//
//12244
//12244
//12233
//
//01234
//56789
//
//���°ڷŲ�����Ҫ��
//
//11122
//11122
//33311
//
//111111
//122221
//122221
//111111
//
//11122
//11113
//33333
//
//����һ�ְڷŷ�ʽ�������ж��Ƿ����С����Ҫ��
//
//����
//----
//��������������ݡ�  
//��һ�а���һ������T���������������� (1 <= T <= 10) 
//���°���T�����ݡ�  
//ÿ�����ݵ�һ�а�����������N��M��  (1 <= N, M <= 10)  
//���°���N��M�еľ��󣬴���ڷŷ�ʽ��  
//
//���
//---
//����ÿ�����ݣ����YES����NO�����Ƿ����С����Ҫ��  
//https://blog.csdn.net/weixin_45176257/article/details/106487933


