package a2014ʡ��;

/*
 * ��Ҫ��ȫ������Ŀ�߼��ǱȽ��ѵģ�����Ŀ�н�������8��Ԫ�أ����Լ���ȫ����Ҳ����
 * ��ʱ���ʿ��Խ���ȫ���У����г�����ÿһ����������з���
 */
public class _07�˿����� {
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
