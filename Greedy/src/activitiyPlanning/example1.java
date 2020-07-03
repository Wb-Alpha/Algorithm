package activitiyPlanning;

public class example1 {
	static int n;
	
	public static void main(String[] args) {
		int s[] = {1,3,0,5,3,5,6,8,8,2,12};
		int j[] = {4,5,6,7,8,9,10,11,12,13,14};
		boolean a[] = new boolean[s.length];
		n = s.length;
		int result = greedySelector(s, j, a);
		System.out.println(result);
	}
	
	public static int greedySelector(int[] s, int[] f, boolean a[]) {
		a[1] = true;
		int j = 1;
		int count = 1;
		for (int i=0; i<n; i++) {
			if (s[i] > f[j]) {
				a[i]=true;
				j=i;
				count++;
			}
			else
				a[i] = false;
		}
		return count;
	}
}
