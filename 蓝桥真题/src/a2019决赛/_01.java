package a2019决赛;

import java.util.Scanner;

public class _01 {
	static int ans = 0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[][] map =  new char[2][4];
		for (int i = 0; i < map.length; i++) {
			String temp = in.nextLine();
			char[] arr = temp.toCharArray();
			for (int j = 0; j < arr.length; j++) {
				map[i][j] = arr[j];
			}
		}
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				char temp = map[i][j];
				int temp_i = i;
				for (int p = i+1; p < map.length; p++) {
					if (temp < map[p][j]) {
						ans++;
					}
				}
				for (int p = j+1; p < map[0].length; p++) {
					if (temp < map[i][p]) {
						ans++;
					}
				}
				for (int p = j+1; p < map[0].length; p++) {
					if (temp_i >= map.length-1) {
						break;
					}
					temp_i++;
					if (temp < map[temp_i][p]) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
		in.close();
	}
}


//试题 A: 递增序列（5分）
//【问题描述】
//
//对于一个字母矩阵，我们称矩阵中的一个递增序列是指在矩阵中找到两个字母，它们在同一行，同一列，或者在同一 45 度的斜线上，这两个字母从左向右看、或者从上向下看是递增的。
//
//例如，如下矩阵中
//
//LANN
//QIAO
//
//有LN、LN、AN、AN、IO、AO、LQ、AI、NO、NO、AQ、IN、AN 等 13 个递增序列。注意当两个字母是从左下到右上排列时，从左向右看和从上向下看是不同的顺序。
//
//对于下面的 30 行 50 列的矩阵，请问总共有多少个递增序列？（如果你把
//以下文字复制到文本文件中，请务必检查复制的内容是否与文档中的一致。在试题目录下有一个文件 inc.txt，内容与下面的文本相同）