package Training;

/*
 * 在一个旧式的火车站旁边有一座桥，其桥面可以绕河中心的桥墩水平旋转。
 * 一个车站的职工发现桥的长度最多能容纳两节车厢，如果将桥旋转180180度，
 * 则可以把相邻两节车厢的位置交换，用这种方法可以重新排列车厢的顺序。
 * 于是他就负责用这座桥将进站的车厢按车厢号从小到大排列。他退休后，
 * 火车站决定将这一工作自动化，其中一项重要的工作是编一个程序，输入初始的
 * 车厢顺序，计算最少用多少步就能将车厢排序。
 */

import java.util.*;

public class Carriage_reorganization {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] a = new int[N];
		int count = 0;
		
		for (int i=0; i<N; i++) {
			a[i] = in.nextInt();
		}
		
		for(int i=1; i<a.length; i++) {
			for(int j=0; j<a.length-1; j++) {
				if ( a[j] > a[j+1] ) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
