package a2018决赛;


//标题：最大乘积
//
//把 1~9 这9个数字分成两组，中间插入乘号，
//有的时候，它们的乘积也只包含1~9这9个数字，而且每个数字只出现1次。
//
//比如：
//984672 * 351 = 345619872
//98751 * 3462 = 341875962
//9 * 87146325 = 784316925
//...
//
//符合这种规律的算式还有很多，请你计算在所有这些算式中，乘积最大是多少？
//
//注意，需要提交的是一个整数，表示那个最大的积，不要填写任何多余的内容。
//（只提交乘积，不要提交整个算式）

public class _02最大乘积 {
	static int max = 0;
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		f(a, 0);
		System.out.println(max);
	}
	
	
	// 全排列
	public static void f(int[] a, int index) {
		if (index >= a.length-1) {	// 如果10个数据都排好了就交给compare()处理
			compare(a);
			return;
		}
		else {
			for (int i = index; i < a.length; i++) {
				swap(a, i, index);	
				f(a, index+1);
				swap(a, i, index);	// 回溯到原本状态
			}
		}
		
	}
	
	// 交换函数
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	//处理函数，负责在排好的数组中插入乘号
	public static void compare(int[] a) {
		int sum_a = 0;
		int sum_b = 0;
		int temp = 0;
		for (int i = 1; i < a.length; i++) {	// 在第i个位置插入乘号
			for (int j = 0; j < i; j++) {	// 将数组前i个数转化为一个乘数a
				sum_a = sum_a*10+a[j];
			}
			for (int j = i; j < a.length; j++) {	//将数组第i个元素之后的数转化成一个乘数b
				sum_b = sum_b*10+a[j];
			}
			if (sum_a*sum_b > max) {
				boolean[] j = new boolean[10];
				for (int p = 0; p < a.length; p++) {
					j[a[p]] = true;
				}
				for (int p = 0; p < j.length; p++) {
					if (j[p] == false) {
						temp = 1;
						break;
					}	
				}
				if (temp != 1) {
					max = sum_a*sum_b;
				}			
			}
		}
	}
	
}
