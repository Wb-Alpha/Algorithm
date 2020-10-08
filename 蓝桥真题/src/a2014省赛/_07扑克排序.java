package a2014省赛;

/*
 * 想要完全复刻题目逻辑是比较难的，而题目中仅仅给出8个元素，所以即便全排列也不会
 * 耗时。故可以进行全排列，排列出来的每一个结果都进行分析
 */
public class _07扑克排序 {
	public static void main(String[] args) {
		char[] a = {'A','A','2','2','3','3','4','4'};
		f(a, 0);
	}
	
	private static void f(char[] a, int k) {
		if (k == a.length) {
			String s = new String(a);
			if (check(s)) {
				System.out.println(s);
			}
		}
		for (int i = k; i < a.length; i++) {
			char t = a[k];
			a[k] = a[i];
			a[i] = t;
			
			f(a, k+1);
			
			t = a[k];
			a[k] = a[i];
			a[i] = t;
		}
	}
	
	private static boolean check(String s) {
		if (s.lastIndexOf('A')-s.indexOf('A')==2 &&
			s.lastIndexOf('2')-s.indexOf('2')==3 &&
			s.lastIndexOf('3')-s.indexOf('3')==4 &&
			s.lastIndexOf('4')-s.indexOf('4')==5)
			return true;
		return false;
	}
}
