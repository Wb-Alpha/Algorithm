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
	
	public static void f(int[] a, int index) {
		if (index >= a.length-1) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			compare(a);
			return;
		}
		else {
			for (int i = index; i < a.length; i++) {
				swap(a, i, index);
				f(a, index+1);
				swap(a, i, index);
			}
		}
		
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void compare(int[] a) {
		int suma = 0;
		int sumb = 0;
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				suma = suma*10+a[j];
			}
			for (int j = i; j < a.length; j++) {
				sumb = sumb*10+a[j];
			}
			if (suma*sumb > max) {
				max = suma*sumb;
			}
		}
	}
}
