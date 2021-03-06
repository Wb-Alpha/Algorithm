package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class example1{
	public static int rank(int key, int[] a) {
		//数组必须是有序的
		int low = 0;
		int high = a.length - 1;
		while ( low <= high ) {
			//被查找的键要么不存在，要么必定处于low和high之间
			int mid = low + (high - low) / 2;
			if (key < a[mid])
				high = mid - 1;
			else if (key > a[mid])
				low = mid + 1;
			else
				return mid;
		}
		return -1;//数组中没有对应数字则返回-1
	}
	
	//以下是例子
	public static void main(String[] args) throws Exception{
		int a[] = {1, 8, 12, 15, 16, 21, 30, 35, 39};
		
		Arrays.sort(a);//将数组由大到小排列
		
		int result = rank(30, a);
		if (result != -1)
			System.out.println(result);
		else
			System.out.println("无此元素");
		
		result = rank(20, a);
		if (result != -1)
			System.out.println(result);
		else
			System.out.println("无此元素");
		
		result = rank(10, a);
		if (result != -1)
			System.out.println(result);
		else
			for(int i=0; i<10; i++) {
				if (a[i] > 10) {
					System.out.println(a[i-1] + " "+ a[i]);
					break;
				}
			}
	}
}
