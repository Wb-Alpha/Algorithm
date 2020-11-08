package a2018决赛;

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

public class _04整理玩具 {
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




//标题：整理玩具
//
//小明有一套玩具，一共包含NxM个部件。这些部件摆放在一个包含NxM个小格子的玩具盒中，每个小格子中恰好摆放一个部件。  
//
//每一个部件上标记有一个0~9的整数，有可能有多个部件标记相同的整数。  
//
//小明对玩具的摆放有特殊的要求：标记相同整数的部件必须摆在一起，组成一个矩形形状。
//
//如以下摆放是满足要求的：
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
//以下摆放不满足要求：
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
//给出一种摆放方式，请你判断是否符合小明的要求。
//
//输入
//----
//输入包含多组数据。  
//第一行包含一个整数T，代表数据组数。 (1 <= T <= 10) 
//以下包含T组数据。  
//每组数据第一行包含两个整数N和M。  (1 <= N, M <= 10)  
//以下包含N行M列的矩阵，代表摆放方式。  
//
//输出
//---
//对于每组数据，输出YES或者NO代表是否符合小明的要求。  
//https://blog.csdn.net/weixin_45176257/article/details/106487933


