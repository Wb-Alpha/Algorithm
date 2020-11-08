package a2017�����;

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
	static List<Integer> saveCellNum = new ArrayList<Integer>();	// ���ÿһ����ϸ��
	static List<Point> livingCell = new ArrayList<Point>();	// ��ŵ�ǰ��ϸ��
	static List<Point> nextLivingCell;		// �����һ����ϸ��
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
		
		saveCellNum.add(new Integer(livingCell.size()));// �����0����ϸ����Ŀ
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

public class _02������Ϸ {
	
}
/*
 * ����������Ϸ��Ӣ����ѧ��Լ�����ζ١�������1970�귢����ϸ���Զ����� �����Ϸ��һ�����޴��2D�����Ͻ��С�
 * 
 * ��ʼʱ��ÿ��С�����о�ס��һ�����Ż����˵�ϸ���� ��һʱ��ÿ��ϸ����״̬��������Χ�˸����ӵ�ϸ��״̬������
 * 
 * ������˵��
 * 
 * ��ǰϸ��Ϊ���״̬ʱ������Χ����2����������2�������ϸ��ʱ�� ��ϸ���������״̬����ģ����������ϡ�٣�
 * ��ǰϸ��Ϊ���״̬ʱ������Χ��2����3�����ϸ��ʱ�� ��ϸ������ԭ����
 * ��ǰϸ��Ϊ���״̬ʱ������Χ��3�����ϵĴ��ϸ��ʱ����ϸ���������״̬����ģ�������������ࣩ
 * ��ǰϸ��Ϊ����״̬ʱ������Χ��3�����ϸ��ʱ����ϸ����ɴ��״̬�� ��ģ�ֳⷱ�� ��ǰ������ϸ��ͬʱ�����Ϲ������,
 * ���Եõ���һ��ϸ��ͼ�����������������һ����ϸ��ͼ�����Եõ�����һ����ϸ��ͼ���ܶ���ʼ��
 * 
 * ��������ʼ��:(X�����ϸ����.������ϸ��) �� �� .XXX. ��
 * 
 * ��һ�����Ϊ: �� ��X�� ��X�� ��X�� ��
 * 
 * ����������Ϸ�л����һЩ��Ȥ��ģʽ�������ȶ������ģʽ��
 * 
 * �� .XX. .XX. ��
 * 
 * ���л�ѭ����ģʽ��
 * 
 * �� �� �� .XX�� .XX�� .XX�� .XX�� .X�� .XX�� ��XX. -> ��X. -> ��XX. ��XX. ��XX. ��XX. �� �� ��
 * 
 * ����������Ҫ���۵���һ���ǳ������ģʽ��������"Gosper glider gun"��
 * 
 * �� ��X�� ��X.X�� ��XX��XX��XX. ��X��X��XX��XX. .XX��X��X��XX�� .XX��X��X.XX��X.X�� ��X��X��X�� ��X��X��
 * ��XX�� ��
 * 
 * �������ϳ�ʼ״̬�ǵ�0�������ʵ�1000000000(ʮ��)��һ���ж��ٻ��ŵ�ϸ����
 * 
 * ע�⣺���Ǽٶ�ϸ���������޵�2D���������ݣ�����ֻ����Ŀ�л������ǵ�ռ䡣 ��Ȼ������ңԶ��λ�ã����ʼ״̬һ��Ϊ��ϸ����
 * 
 * ע�⣺��Ҫ�ύ����һ����������Ҫ��д�������ݡ�
 * 
 * PS��������ʲôʮ�ں���ʲô��һ����֪�����ܰ�������˼·�����϶���ѭ����������һЩ�����Ľݾ�������������
 */