package a2017年决赛;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Point{
	public int x;
	public int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		Point newPoint = (Point)obj;
		return this.x==newPoint.x && this.y==newPoint.y;
	}
	
	static int row = 11;
	static int rank = 38;
	static List<Integer> saveCellNum = new ArrayList<Integer>();	// 存放每一代活细胞
	static List<Point> livingCell = new ArrayList<Point>();	// 存放当前活细胞
	static List<Point> nextLivingCell;		// 存放下一代活细胞
	static int dirX[] = {-1,-1,-1,0,0,1,1,1};
	static int dirY[] = {-1,0,1,-1,1,-1,0,1};
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char tmp[][] = new char[row][rank];
		for (int i=0; i < row; i++) {
			String str = in.nextLine();
			tmp[i] = str.toCharArray();
		}
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<rank; j++) {
				if (tmp[i][j]=='X') {
					livingCell.add(new Point(i,j));
				}
			}
		}
		
		saveCellNum.add(new Integer(livingCell.size()));// 加入第0代活细胞数目
		for (int loop=1; loop<=300;loop++) {
			nextLivingCell = new ArrayList<Point>();
			for (int i=0; i<livingCell.size(); i++) {
				Point curPoint = (Point)livingCell.get(i);
				int nigorCells = 0;
				for (int j=0; j<8; j++) {
					int dx = curPoint.x+dirX[j];
					int dy = curPoint.y+dirY[j];
					if (livingCell.contains(new Point(dx, dy))) {
						nigorCells++;
					}
					else {
						if (!nextLivingCell.contains(new Point(dx,dy))) {
							int nigorhPoint = 0;
							for (int k=0; k < 8; k++) {
								int dxx = dx+dirX[k];
								int dyy = dy+dirY[k];
								
								if (livingCell.contains(new Point(dxx, dyy))){
									nigorhPoint++;
								}
							}
							if (nigorhPoint == 3) {
								nextLivingCell.add(new Point(dx, dy));
							}
						}
					}
				}
				if (nigorCells == 3 || nigorCells == 3) {
					nextLivingCell.add(curPoint);
				}
			}
			saveCellNum.add(new Integer(nextLivingCell.size()));
			livingCell = nextLivingCell;
		}
		for (int i = 0; i < saveCellNum.size(); i++) {
			System.out.println(saveCellNum.get(i)+" ");
		}
		System.out.println();
		for (int i = 1; i < saveCellNum.size(); i++) {
			System.out.println(saveCellNum.get(i)-saveCellNum.get(i-1)+" ");
		}
	}
}

public class _02生命游戏 {
	
}
/*
 * 康威生命游戏是英国数学家约翰·何顿·康威在1970年发明的细胞自动机。 这个游戏在一个无限大的2D网格上进行。
 * 
 * 初始时，每个小方格中居住着一个活着或死了的细胞。 下一时刻每个细胞的状态都由它周围八个格子的细胞状态决定。
 * 
 * 具体来说：
 * 
 * 当前细胞为存活状态时，当周围低于2个（不包含2个）存活细胞时， 该细胞变成死亡状态。（模拟生命数量稀少）
 * 当前细胞为存活状态时，当周围有2个或3个存活细胞时， 该细胞保持原样。
 * 当前细胞为存活状态时，当周围有3个以上的存活细胞时，该细胞变成死亡状态。（模拟生命数量过多）
 * 当前细胞为死亡状态时，当周围有3个存活细胞时，该细胞变成存活状态。 （模拟繁殖） 当前代所有细胞同时被以上规则处理后,
 * 可以得到下一代细胞图。按规则继续处理这一代的细胞图，可以得到再下一代的细胞图，周而复始。
 * 
 * 例如假设初始是:(X代表活细胞，.代表死细胞) … … .XXX. …
 * 
 * 下一代会变为: … …X… …X… …X… …
 * 
 * 康威生命游戏中会出现一些有趣的模式。例如稳定不变的模式：
 * 
 * … .XX. .XX. …
 * 
 * 还有会循环的模式：
 * 
 * … … … .XX… .XX… .XX… .XX… .X… .XX… …XX. -> …X. -> …XX. …XX. …XX. …XX. … … …
 * 
 * 本题中我们要讨论的是一个非常特殊的模式，被称作"Gosper glider gun"：
 * 
 * … …X… …X.X… …XX…XX…XX. …X…X…XX…XX. .XX…X…X…XX… .XX…X…X.XX…X.X… …X…X…X… …X…X…
 * …XX… …
 * 
 * 假设以上初始状态是第0代，请问第1000000000(十亿)代一共有多少活着的细胞？
 * 
 * 注意：我们假定细胞机在无限的2D网格上推演，并非只有题目中画出的那点空间。 当然，对于遥远的位置，其初始状态一概为死细胞。
 * 
 * 注意：需要提交的是一个整数，不要填写多余内容。
 * 
 * PS：像这种什么十亿后是什么的一看就知道不能按照他的思路做，肯定有循环，或者有一些其他的捷径，慢慢摸索，
 */